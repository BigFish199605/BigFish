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
	//跳转到确认支付页面
	//如果没有登录则不能支付，需要先登录
	@RequestMapping("/pay")
	public String toPay(){
		return "/cart/pay";
	}
	//支付成功
	@RequestMapping("success")
	public String toSuccess(){
		return "/cart/success";
	}
}
