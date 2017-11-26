package com.snackcase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.snackcase.pojo.Order;
import com.snackcase.service.OrderService;

@Controller
public class OrderController {
	//@Autowired
	//private OrderService orderService;
	//根据id添加到购物车
	/*@RequestMapping("/add")
	public String toAdd(String orderId,Model model){
		Order order = orderService.findOne(orderId);
		model.addAttribute("order", order);
		return "/cart/cart";
	}
	//选中删除的订单
	@RequestMapping("todelete")
	public String remove(){
		
		
		return "redirect:/cart";
	}
	//点击+按钮
	@RequestMapping("increase")
	public String increase(){
		
		return "redirect:/cart";
	}
	//点击-按钮
	@RequestMapping("decrease")
	public String decrease(){
		
		return "redirect:/cart";
	}*/
}
