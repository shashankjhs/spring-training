package com.walmart.api.coupon.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@GetMapping("/hello") //this URI is used by client application to invoke this method
	public String helloRest() {
		return "Welcome to Spring REST";
	}
}
