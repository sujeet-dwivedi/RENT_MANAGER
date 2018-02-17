package com.rmngr.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rmngr.bean.Renter;
import com.rmngr.service.RenterService;

@Controller
public class RenterController {
	
	@Autowired
	private RenterService renterService;


	@RequestMapping(value = "/addRenter",method = RequestMethod.GET)
	public String addRenter(ModelMap model) {
		model.addAttribute("renterForm", new Renter());
		return "renterForm";
	}


	@RequestMapping(value = "/saveRenter",method = RequestMethod.POST)
	public String saveRenter(@ModelAttribute("renterForm")Renter renter) {
		if(renter.getRenterId() == 0) {
			renterService.addRenter(renter);			
		}else {
			renterService.editRenter(renter, renter.getRenterId());
		}
		return "redirect:/home";
	}

	@RequestMapping(value = "/renters/{id}/update", method = RequestMethod.GET)
	public String showUpdateRenterForm(@PathVariable("id") int id, Model model) {
		model.addAttribute("renterForm", renterService.find(id));
		return "renterForm";

	}

	// show update form
	@RequestMapping(value = "/renters/{id}", method = RequestMethod.GET)
	public String showRenter(@PathVariable("id") int id, Model model) {
		Renter renter = renterService.find(id);
		model.addAttribute("renter", renter);
		return "showRenter";

	}


	@RequestMapping(value = "/renters/{id}/delete", method = RequestMethod.GET)
	public String deleteRenter(@PathVariable("id") int id, Model model) {
		renterService.deleteRenter(id);;
		return "redirect:/home";

	}

}
