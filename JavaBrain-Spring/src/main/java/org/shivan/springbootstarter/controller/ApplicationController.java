package org.shivan.springbootstarter.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on the server is " + LocalDateTime.now();
	}
	
	

}
