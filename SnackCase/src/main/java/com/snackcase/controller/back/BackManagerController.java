package com.snackcase.controller.back;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.snackcase.controller.CalendarController;
import com.snackcase.pojo.Item;
import com.snackcase.pojo.User;
import com.snackcase.service.ItemService;
import com.snackcase.service.OrderService;
import com.snackcase.service.back.UserService;

@Controller
public class BackManagerController extends CalendarController{
	@Autowired
	private ItemService itemService;
	@Autowired
	private UserService userService;
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/back")
	public String back() {
		
		return "/back/home/fmain";
	}
	@RequestMapping("/title")
	public String title(){
		return "/back/home/title";
	}
	
	//转向home的左侧页面
	@RequestMapping("/homeLeft")
	public String homeLeft(){
		return "/back/home/left";
	}
	
	//转向home的操作页面
	@RequestMapping("/homeMain")
	public String homeMain(Model model){
		//TODO
		List<Item> items=itemService.findAll();
		List<User> users=userService.findAll();
		model.addAttribute("users", items);
		model.addAttribute("orders", users);
		model.addAttribute("items", items);
		model.addAttribute("userNum", "666");
		model.addAttribute("itemNum", "666");
		model.addAttribute("orderToday", "666");
		model.addAttribute("orderSum", "666");
		return "/back/home/main";
	}
	
	@RequestMapping("/{model}/Left")
	public String Left(@PathVariable String model){
		return "/back/"+model+"/left";
	}
	
	@RequestMapping("/{model}/Main")
	public String sysadminMain(@PathVariable String model){
		return "/back/"+model+"/main";
	}
}
