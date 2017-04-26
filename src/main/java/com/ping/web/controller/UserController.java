package com.ping.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ping.service.UserService;

@Controller
@RequestMapping("/views/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String getPage(HttpSession session, Model model) {
		model.addAttribute("user", userService.userInfo(session.getAttribute("sessionAccount").toString()));
		return "/jsp/user";
	}
}
