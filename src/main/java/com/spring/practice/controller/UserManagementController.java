package com.spring.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserManagementController {
	@RequestMapping("login")
	public String hello(Model model) {

		//model.addAttribute("name", "John Doe");

		return "login";
	}
}
