package com.rmngr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rmngr.bean.User;
import com.rmngr.service.RenterService;
import com.rmngr.service.UserService;

@Controller
@RequestMapping("/")
public class LoginController {

	@Autowired
	private RenterService renterService;

	@Autowired
	private UserService userService;

	/**
	 * Initial Request to open Login Page
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String welcomePage(ModelMap model) {
		model.addAttribute("loginForm", new User());
		return "welcome";
	}

	/**
	 * Validate user and Switch to dashboard with All Renters list
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("user")User user) {
		ModelAndView model = new ModelAndView();
		if(userService.validateUser(user)) {
			model.setViewName("homePage");
			model.addObject("renters", renterService.findAll());
		}else {
			model.setViewName("welcome");
			model.addObject("loginForm", new User());
		}
		return model;
	}

/**
 * logout controller 
 * @return
 */
	@RequestMapping(value = "/logout",method = RequestMethod.GET)
	public String logout() {
		return "redirect:/";
	}

	/**
	 * redirect to home page
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/home",method = RequestMethod.GET)
	public String home(ModelMap model) {
		model.addAttribute("renters", renterService.findAll());
		return "homePage";
	}
}
