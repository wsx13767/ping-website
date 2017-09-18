package com.ping.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ping.model.UserBean;
import com.ping.service.UserService;
import com.ping.util.UserSecret;
@Controller
@RequestMapping("/views/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String getPage(HttpSession session, Model model) {
		UserBean user = (UserBean) session.getAttribute("sessionUser");
		String account = user.getAccount();
		UserBean userInfo = userService.userInfo(account);
		try {
		//還未解決之問題，只好先new出一新物件，避免密碼被update
		UserBean clone = (UserBean) userInfo.clone();
		model.addAttribute("user", UserSecret.changeSectrt(clone));
		
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "/jsp/user";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void changeInfo() {
		
	}
}
