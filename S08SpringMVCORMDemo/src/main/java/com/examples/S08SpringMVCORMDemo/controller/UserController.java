package com.examples.S08SpringMVCORMDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.examples.S08SpringMVCORMDemo.entity.User;
import com.examples.S08SpringMVCORMDemo.service.UserAlreadyExistsException;
import com.examples.S08SpringMVCORMDemo.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping("/register")
	public String show() {
		
		return "userreg";
		
	}
	
	@RequestMapping("/registeruser")
	public String register(@ModelAttribute("user") User user, ModelMap model) {
		
		int result;
		try {
			result = userService.save(user);
			model.addAttribute("message","User created with id "+result);
			model.addAttribute("users",userService.getUsers());
//			return "userreg";
		} catch (UserAlreadyExistsException e) {
			model.addAttribute("message",e.getMessage());
			e.printStackTrace();
		}
//		model.addAttribute("message","User created with id "+result);
//		model.addAttribute("users",userService.getUsers());
		return "userreg";
	}
	@RequestMapping("/users")
	public String getUsers(ModelMap model) {
		model.addAttribute("users",userService.getUsers());
		return "displayusers";
	}

}
