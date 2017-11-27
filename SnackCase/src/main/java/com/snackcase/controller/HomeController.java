package com.snackcase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.snackcase.pojo.Item;
import com.snackcase.service.ItemService;

@Controller
public class HomeController {
	@Autowired 
	private ItemService itemService;
	
	@RequestMapping("/home")
	public String home(Model model) {
		
		/*List<Item> list = itemService.findAll();
		model.addAttribute("list", list);*/
		return "/home/home";
	}
	
	@RequestMapping("/information")
	public String info() {
		return "/user/information";
	}
	

	@RequestMapping("/sort")
	public String sort(Model model) {
		List<Item> list = itemService.findAll();
		model.addAttribute("list", list);
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
