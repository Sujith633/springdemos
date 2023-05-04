package com.example.S13SpringBootRest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.S13SpringBootRest.entity.Product;
import com.example.S13SpringBootRest.resposiyory.ProductRespository;

@Controller
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductRespository respository;
	
	@GetMapping
	Iterable<Product> getproducts(){
		return respository.findAll();
	}
	
	@GetMapping("/{id}")
	Product getproduct(@PathVariable("id") Integer id){
		return respository.findById(id).get();
	}
	
	@PostMapping
	String addproduct(@ModelAttribute("product") Product product,ModelMap model) {
		
		respository.save(product);
		model.addAttribute("products",respository.findAll());
		return "products";
		
	}

}
