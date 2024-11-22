package com.tka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
public String getMassage()
{
		System.out.println("I am in get massage method");
	return "Hello Student,Welcome to my AOP Project";
}
	
	@GetMapping("/msg")
public String getMassage1()
{
		System.out.println("im in getMassage 1");
	return "Hello Student,Good Morning";
}
}
