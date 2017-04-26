package com.ping.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ping.formBean.RegisterLoginFormBean;
import com.ping.service.UserService;

@Controller
@RequestMapping("/views/registerLogin")
public class RegisterLoginController {
	@Autowired
	private UserService service;
	@RequestMapping(method = RequestMethod.GET)
	public String getPage() {
		return "/jsp/registerLogin";
	}
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String login(RegisterLoginFormBean formBean, 
			HttpServletResponse res, HttpSession session, Model model) {
		System.out.println("login");
		boolean result = service.login(formBean);
		if (result) {
			session.setAttribute("sessionAccount", formBean.getAccount());
			return "loginSuccess";
		}
		return "loginFail";
	}
	@RequestMapping(value="/logout", method = RequestMethod.POST)
	public String logout(HttpSession session, HttpServletResponse res) {
		System.out.println("logout");
		session.removeAttribute("sessionAccount");
		return "logout";

	}
	
}
