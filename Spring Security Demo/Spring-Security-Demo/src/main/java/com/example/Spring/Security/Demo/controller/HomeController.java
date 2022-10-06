package com.example.Spring.Security.Demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String home() {
		return "This is Home page";
	}
	@GetMapping("/admin")
	public String admin() {
		return "This is Admin page";
	}
}
