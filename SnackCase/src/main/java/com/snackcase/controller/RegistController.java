package com.snackcase.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.snackcase.pojo.User;

import com.snackcase.service.RegistService;

@Controller
public class RegistController {
	@Autowired
	RegistService registservice;

	@RequestMapping("/toregister")
	public String toregister() {
		return "login/register";
	}

	@RequestMapping("/regist")
	public String rigist(User user, Model model) {
		String password = user.getPassword();
		String password2 = user.getPassword2();
		String email = user.getEmail();
		String username = user.getUsername();

		System.out.println(user);

		if (username == null || username == "") {
			model.addAttribute("msg", "用户名不能为空");

			return "login/register";
		}

		User user1 = registservice.findonebyUsername(user.getUsername());
		if(user1!=null){
			model.addAttribute("msg", "用户名已存在");
		}
		
		
		

		if (password == null || password == "") {
			model.addAttribute("msg", "密码不能为空");

			return "login/register";
		}
		if (password2 == null || password2 == "") {
			model.addAttribute("msg", "确认密码不能为空");
			return "login/register";
		}
		if (email == null || email == "") {
			model.addAttribute("msg", "邮箱不能为空");
			return "login/register";
		}

		if (!password.equals(password2)) {

			model.addAttribute("msg", "两次密码不一致");
			return "login/register";
		}
		model.addAttribute("password", password);
		model.addAttribute("email", email);
		model.addAttribute("username", username);

		return "user/information";

	}

	@RequestMapping("/update")
	public String update(User user, Model model, HttpSession session) {
		String nickname = user.getNickname();
		String gender = user.getGender();
		String telephone = user.getTelephone();
		String name = user.getName();
		String age = user.getAge();

		if (nickname == null || nickname == "") {
			model.addAttribute("msg", "昵称不能为空");

			return "user/information";
		}

		if (gender == null || gender == "") {
			model.addAttribute("msg", "性别不能为空");

			return "user/information";
		}
		if (telephone == null || telephone == "") {
			model.addAttribute("msg", "电话不能为空");

			return "user/information";
		}
		if (name == null || name == "") {
			model.addAttribute("msg", "姓名不能为空");

			return "user/information";
		}
		if (age == null || age == "") {
			model.addAttribute("msg", "姓名不能为空");

			return "user/information";
		}

		System.out.println(user);

		registservice.regist(user);

		model.addAttribute("user", user);

		session.setAttribute("user", user);

		return "redirect:/home";

	}

	@RequestMapping("/zhuxiao")
	public String zhuxiao(User user, HttpSession session) {

		session.removeAttribute("user");

		return "redirect:/home";
	}

	@RequestMapping("/tologin")
	public String tologin() {

		return "/login/login";
	}

	@RequestMapping("/login")
	public String login(User user, Model model, HttpSession session) {
		String email = user.getEmail();
		String password = user.getPassword();
		
		System.out.println(user);

		User user1 = registservice.findone(email, password);

		if (user1 != null) {

			session.setAttribute("user", user1);
			return "redirect:/home";
		} else {

			model.addAttribute("msg", "邮箱或密码不正确");
			return "/login/login";
		}

	}

}
