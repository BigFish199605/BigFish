package com.snackcase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BackManagerController {

	@RequestMapping("/back")
	public String back() {
		
		return "/back/index";
	}
	@RequestMapping("/test2")
	public String test2() {
		
		return "/back/库存管理";
	}
}
