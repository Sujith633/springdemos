package com.examples.S08SpringMVCDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@RequestMapping("/register")
	public String hello() {
//		ModelAndView mv = new ModelAndView();
		
//		mv.setViewName("registeruser");
		return "registeruser";
	}
	
	@RequestMapping(value="/signupuser",method=RequestMethod.POST)
	
	public String SignUPUser(@ModelAttribute("user") User user,ModelMap model) {
		System.out.println("From UI retrived user is "+user);
//		ModelAndView mv = new ModelAndView();
		model.addAttribute("user",user);
//		mv.setViewName("registeruserresult");
		return "registeruserresult";
		
	}

}
