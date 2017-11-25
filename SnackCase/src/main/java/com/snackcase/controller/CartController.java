package com.snackcase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {
	//点击添加，跳转到购物车页面
	@RequestMapping("/add")
	public String toAdd(){
		return "/cart/cart";
	}
	@RequestMapping("/pay")
	public String toPay(){
		return "/cart/pay";
	}
	@RequestMapping("success")
	public String toSuccess(){
		return "/cart/success";
	}
}
