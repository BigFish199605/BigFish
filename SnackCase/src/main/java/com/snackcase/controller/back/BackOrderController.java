package com.snackcase.controller.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/back/order")
public class BackOrderController {

	@RequestMapping("/orderList")
	public String orderList(){
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
