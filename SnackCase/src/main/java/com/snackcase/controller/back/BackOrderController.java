package com.snackcase.controller.back;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.snackcase.pojo.Order;
import com.snackcase.service.back.BackOrderService;

@Controller
@RequestMapping("/back/order")
public class BackOrderController {
	@Autowired
	private BackOrderService backOrderService;
	@RequestMapping("/orderList")
	public String orderList(Model model){
		List<Order> orders = backOrderService.findOrderAll();
		model.addAttribute("orders",orders );
		return "/back/order/订单列表";
	}
	@RequestMapping("/orderUser")
	public String orderUser(){
		return "/back/order/用户订单";
	}
	@RequestMapping("/orderComplete")
	public String orderComplete(){
		return "/back/order/发货单列表";
	}
	@RequestMapping("/orderDownload")
	public String orderDownload(){
		return "/back/order/订单打印";
	}

}
