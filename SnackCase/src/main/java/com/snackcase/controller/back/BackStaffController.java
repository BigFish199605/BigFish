package com.snackcase.controller.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/back/staff")
public class BackStaffController {
	@RequestMapping("/staff")
	public String staff(){
		return "/back/staff/员工列表";
	}
	@RequestMapping("/staffInfo")
	public String staffInfo(){
		return "/back/staff/员工信息";
	}
	@RequestMapping("/staffAdd")
	public String staffAdd(){
		return "/back/staff/添加新员工信息";
	}
	@RequestMapping("/staffJob")
	public String staffJob(){
		return "/back/staff/员工职位";
	}
	@RequestMapping("/jobInfo")
	public String jobInfo(){
		return "/back/staff/角色权限";
	}

}
