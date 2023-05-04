package com.example.SportyShoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.SportyShoes.entity.Admin;
import com.example.SportyShoes.entity.Product;
import com.example.SportyShoes.respository.ProductRespository;

@Controller
//@RequestMapping("/index")
public class ProductController {
	@Autowired
	ProductRespository respository;

	@RequestMapping("/registeruserresult")
	@GetMapping
	public String hello() {
//		ModelAndView mv = new ModelAndView();
		
//		mv.setViewName("registeruser");
		return "registeruser";
	}
	@RequestMapping(value="/signupuser",method=RequestMethod.POST)

	public String SignUPUser(@ModelAttribute("user") Admin user, ModelMap model) {
		System.out.println("From UI retrived user is " + user);
//		ModelAndView mv = new ModelAndView();
		model.addAttribute("user", user);
//		mv.setViewName("registeruserresult");
		return "registeruserresult";

	}


	
	@RequestMapping("/products")
	@PostMapping
	String addproduct(@ModelAttribute("product") Product product, ModelMap model) {

		respository.save(product);
		model.addAttribute("products", respository.findAll());
		return "products";
	}
	@GetMapping
	Iterable<Product> getproducts() {
		return respository.findAll();
	}
	@RequestMapping("/category")
	@GetMapping("/{id}")
	Product getproduct(@PathVariable("id") Integer id) {
		return respository.findById(id).get();
	}

}
