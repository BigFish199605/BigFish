package com.snackcase.controller.back;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.snackcase.pojo.Item;
import com.snackcase.service.ItemService;

import com.snackcase.controller.CalendarController;
import com.snackcase.pojo.Item;
import com.snackcase.service.ItemService;



@Controller
@RequestMapping("/back/item")
public class ItemController extends TimeTool{
	
	@Autowired
	private ItemService itemService;
	
	
	@RequestMapping("/add")
	public String add(){
		return "/back/item/添加新商品";
	}
	@RequestMapping("/comment")
	public String comment(){
		return "/back/item/用户评论";
	}
	@RequestMapping("/kind")
	public String kind(){
		return "/back/item/商品分类";
	}
	
	@RequestMapping("/num")
	public String num(Model model){
		
		List<Item> items = itemService.findAll();
		
		model.addAttribute("items",items);
		
		return "/back/item/库存管理";
	}
	
	
	
	
	@RequestMapping("/delete/item.action")
	public String delete(String id){
		
		itemService.delete(0,id);
		
		return "redirect:/back/item/num";
	}
	
	@RequestMapping("/findAll")
	public String findAll(Model model){
		
		List<Item> items = itemService.findAll();
		
		model.addAttribute("items",items);
		
		return "/back/item/商品列表";
	}
	
	

}
