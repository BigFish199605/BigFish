package com.snackcase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		return "/home/home";
	}
	
	@RequestMapping("/cart")
	public String info() {
		return "/cart/cart";
	}
	

	@RequestMapping("/sort")
	public String sort() {
		return "/product/sort";
	}
	
	@RequestMapping("/collection")
	public String toCollection(){
		return "/home/collection";
	}
	
	@RequestMapping("/information")
	public String toInformation(){
		return "/home/collection";
	}

}
