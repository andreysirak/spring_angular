package com.example.demo2.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class HomeController {


	@Autowired
	public HomeController() {

	}

	@RequestMapping(value = "/", method = GET)
	public String index(Model model) {
		return "index";
	}
//
//	@RequestMapping(value = "/", method = POST)
//	public String login() {
//		return "home";
//	}
//
//
	
}
