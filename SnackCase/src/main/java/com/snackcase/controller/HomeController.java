package com.snackcase.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		
		
		return "/home/home";
	}
	
	@RequestMapping("/information")
	public String info() {
		return "/user/information";
	}
	

	@RequestMapping("/sort")
	public String sort() {
		return "/product/sort";
	}
	
	@RequestMapping("/cart")
	public String cart() {
		return "/cart/cart";
	}
	
	
	@RequestMapping("/collection")
	public String collection() {
		return "/user/collection";
	}
	
	@RequestMapping("/add")
	public String add() {
		return "/cart/cart";
	}
	
	
	@RequestMapping("/index")
	public String index() {
		return "/user/index";
	}
	
	@RequestMapping("/option")
	public String person() {
		return "/home/options";
	}
	
	@RequestMapping("/order")
	public String order() {
		return "/order/order";
	}
	
	@RequestMapping("/orderinfo")
	public String orderinfo() {
		return "/order/orderinfo";
	}
	
	@RequestMapping("/success")
	public String success() {
		return "/pay/success";
	}
	
	@RequestMapping("/address")
	public String address() {
		return "user/address";
	}
	
	@RequestMapping("/news")
	public String news() {
		return "user/news";
	}
	
	@RequestMapping("/cardlist")
	public String card() {
		return "/user/cardList";
		
	}
	//修改个人信息请求
	@RequestMapping("/tosave")
	public String tosave() {
		
		return "/user/information";
		
	}
	//点击修改个人资料
	@RequestMapping("/updateInfo")
	public String toupdate() {
		
		return "/user/updateInfo";
		
	}
	//跳转支付页面
	@RequestMapping("/pay")
	public String toupay() {
		
		return "/pay/pay";
		
	}


}
