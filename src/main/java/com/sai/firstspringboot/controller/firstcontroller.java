package com.sai.firstspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstcontroller {
	
	@GetMapping("/")
	public String getMessage() {
		
		return "This is my first message on spring boot";
	}

}
