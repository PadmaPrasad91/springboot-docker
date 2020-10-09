package com.app.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping("/")
	public String hello(Model model) {
		model.addAttribute("message", "Welcome To Docker World!");
		return "hello";
	}
}
