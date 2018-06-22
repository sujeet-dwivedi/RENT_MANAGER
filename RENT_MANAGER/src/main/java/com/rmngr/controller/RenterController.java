package com.rmngr.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rmngr.bean.Rent_Payment;
import com.rmngr.bean.Renter;
import com.rmngr.service.RentPayService;
import com.rmngr.service.RenterService;

@Controller
public class RenterController {

	@Autowired
	private RenterService renterService;
	
	@Autowired
	private RentPayService rentPayService;
	/*
	 * Render New Renter Form
	 */
	@RequestMapping(value = "/addRenter",method = RequestMethod.GET)
	public String showAddRenter(ModelMap model) {
		model.addAttribute("renterForm", new Renter());
		return "renterForm";
	}

	/*
	 * Add Renter Details
	 */
	@RequestMapping(value = "/saveRenter",method = RequestMethod.POST)
	public String saveRenter(@ModelAttribute("renterForm")Renter renter) {
		boolean isTrue = renterService.isRoomExists(renter.getRenterId());
		if(isTrue) {
			renterService.editRenter(renter, renter.getRenterId());
		}else {
			renterService.addRenter(renter);	

		}
		return "redirect:/home";
	}

	/*
	 * show renter details
	 * show payment details
	 */
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public String showRenter(@PathVariable("id") int id, Model model) {
		Renter renter = renterService.find(id);
		model.addAttribute("renter", renter);
		
		Rent_Payment rPayment=new Rent_Payment();
		model.addAttribute("rentPaymnt", rPayment);
		
		model.addAttribute("rentPaymntByRoom", rentPayService.findAllByID(id));
		
		return "showRenter";

	}

	/*
	 * update renter details
	 */
	@RequestMapping(value = "{id}update", method = RequestMethod.GET)
	public String showUpdateRenterForm(@PathVariable("id") int id, Model model) {
		model.addAttribute("renterForm", renterService.find(id));
		return "renterForm";

	}


	/*
	 * delete renter details
	 */
	@RequestMapping(value = "{id}delete", method = RequestMethod.GET)
	public String deleteRenter(@PathVariable("id") int id, Model model) {
		renterService.deleteRenter(id);;
		return "redirect:/home";

	}

}
