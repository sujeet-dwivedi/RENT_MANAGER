package com.rmngr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rmngr.bean.Rent_Payment;
import com.rmngr.bean.Renter;
import com.rmngr.service.RentPayService;
import com.rmngr.service.RenterService;

@Controller
public class RentController {

	@Autowired
	private RenterService renterService;

	@Autowired
	private RentPayService rentPayService;

	/*
	 * add payment details
	 */
	@RequestMapping(value = "/savePaymntDtl",method = RequestMethod.POST)
	public String saveRentPaymnt(@ModelAttribute("rentPaymnt")Rent_Payment rPayment) {
		boolean isTrue = rentPayService.isRentRecordExists(rPayment);
		if(isTrue) {
			rentPayService.editPayment(rPayment);
		}else {
			rentPayService.addPayment(rPayment);	

		}
		return "redirect:/home";
	}



	/*
	 * show renter details
	 * show payment details
	 */
	@RequestMapping(value = "{id}showrdtl", method = RequestMethod.GET)
	public String showRentDtl(@PathVariable("id") int id, Model model) {
		String dateAndRoom=Integer.toString(id);
		String date=dateAndRoom.substring(0, 6);
		String room=dateAndRoom.substring(6);
		String d = date.substring(0, 2);
		String m = date.substring(2, 4);
		String y = date.substring(4);
		String searchDate = d+"/"+m+"/"+y;		

		Renter renter = renterService.find(Integer.parseInt(room));
		model.addAttribute("renter", renter);

		model.addAttribute("rentPaymntByRoom", rentPayService.findAllByID(Integer.parseInt(room)));

		Rent_Payment rPayment=rentPayService.find(Integer.parseInt(room),searchDate);
		model.addAttribute("rentPaymnt", rPayment);

		return "showRenter";

	}


}
