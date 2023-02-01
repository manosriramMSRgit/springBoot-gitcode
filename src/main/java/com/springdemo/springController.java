package com.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springboot")
public class springController {

	public String name = "Manosriram";
	
	@GetMapping("/msg")
	public String displayMessage() {
		return "Hello from Mano, This is a My Spring boot application.....";
	}
}
