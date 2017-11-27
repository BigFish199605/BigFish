package com.snackcase.controller.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BackManagerController {

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
	public String homeMain(){
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
