package com.ping.web.controller;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ping.formBean.RegisterLoginFormBean;
import com.ping.model.UserBean;
import com.ping.service.UserService;
import com.ping.util.UserCheck;

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
		Map<String, String> error = new HashMap<String, String>();
		model.addAttribute("error", error);
		UserCheck check = new UserCheck(formBean, error, "login");
		if (!check.getResult()) {
			return "loginFail";
		}
		if (service.login(formBean)) {
			UserBean user = service.userInfo(formBean.getAccount());
			session.setAttribute("sessionUser", user);
			return "loginSuccess";
		} else {
			error.put("fail", "Your account and password are error !!!");
		}

		return "loginFail";
	}
	@RequestMapping(value="/logout", method = RequestMethod.POST)
	public String logout(HttpSession session, HttpServletResponse res) {
		session.removeAttribute("sessionUser");
		return "logout";
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String register(RegisterLoginFormBean formBean ,Model model) {
		UserBean obj = service.register(formBean);
		Map<String, String> error = new HashMap<String, String>();
		model.addAttribute("error",error);
		UserCheck check = new UserCheck(formBean, error, "register");
		if (!check.getResult()) {
			return "registerFail";
		}
		if (obj != null) {
			return "registerSuccess";
		}
		return "registerFail";
	}
	
}
