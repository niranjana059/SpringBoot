package com.niranjan.learning.greet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@RequestMapping("/greet")
	public String greet() {
		return "Hi, Niranjan .. Welcome to Spring boot rest api development";
	}

}
