package com.snackcase.controller.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/back/item")
public class ItemController {
	
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
	public String num(){
		return "/back/item/库存管理";
	}
}
