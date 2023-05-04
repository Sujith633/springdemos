//package com.example.SportyShoes.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.example.SportyShoes.entity.Product;
//import com.example.SportyShoes.entity.User;
//import com.example.SportyShoes.respository.ProductRespository;
//import com.example.SportyShoes.respository.UserRespository;
//
//
//@Controller
//@RequestMapping("/UserProducts")
//public class UserController {
//	@Autowired
//	UserRespository respository;
//
//	
//	@PostMapping
//	String addproduct(@ModelAttribute("user") User user,ModelMap model) {
//
////		respository.saveAll(user);
//		model.addAttribute("products", respository.findAll());
//		return "UserProducts";
//	}
//
//}
