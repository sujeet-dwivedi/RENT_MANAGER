package com.rmngr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rmngr.bean.User;
import com.rmngr.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/register",method = RequestMethod.GET)
	public String register(ModelMap model) {
		model.addAttribute("user", new User());
		return "user/usersRegistration";
	}

	
	@RequestMapping(value = "/saveUpdateUser",method = RequestMethod.POST)
	public String saveUpdateUser(@ModelAttribute("user")User user) {
		if(user.getUserId() == 0) {
			userService.addUser(user);			
		}else {
			userService.editUser(user, user.getUserId());
		}
		return "redirect:/";
	}

}
