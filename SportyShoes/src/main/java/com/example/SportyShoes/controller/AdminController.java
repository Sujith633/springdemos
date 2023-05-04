package com.example.SportyShoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.SportyShoes.respository.AdminRespository;

@Controller
@RequestMapping("/index")
public class AdminController {
	@Autowired
	AdminRespository respo;

}
