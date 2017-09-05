package com.ping.web.controller;


import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.ping.formBean.RegisterLoginFormBean;
import com.ping.model.UserBean;
import com.ping.service.UserService;
import com.ping.util.UserCheck;

@Controller
@RequestMapping("/views/registerLogin")
public class RegisterLoginController {
	@Autowired
	private UserService service;
	
	Locale language;
	
	@RequestMapping(method = RequestMethod.GET)
	public String getPage(HttpServletRequest request) {
//		System.out.println();
		language = RequestContextUtils.getLocale(request);
		System.out.println(language);
		return "/jsp/registerLogin";
	}

	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String login(RegisterLoginFormBean formBean, 
			HttpServletResponse res, HttpSession session, Model model) {
		Map<String, String> error = new HashMap<String, String>();
		model.addAttribute("error", error);
		UserCheck check = new UserCheck(formBean, error, "login", this.language);
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
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String doGetLogin(HttpServletRequest request) {
		language = RequestContextUtils.getLocale(request);
		return "/jsp/registerLogin";
	}
	@RequestMapping(value="/logout", method = RequestMethod.POST)
	public String logout(HttpSession session, HttpServletResponse res) {
		session.removeAttribute("sessionUser");
		return "logout";
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String register(RegisterLoginFormBean formBean ,Model model) {
		Map<String, String> error = new HashMap<String, String>();
		model.addAttribute("error",error);
		UserCheck check = new UserCheck(formBean, error, "register", language);
		if (!check.getResult()) {
			return "registerFail";
		}
		UserBean obj = service.register(formBean);
		if (obj != null) {
			return "registerSuccess";
		}
		return "registerFail";
	}
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String doGetRegister(HttpServletRequest request) {
		//防止按完註冊又改變語言發生錯誤
		language = RequestContextUtils.getLocale(request);
		return "/jsp/registerLogin";
	}
}
