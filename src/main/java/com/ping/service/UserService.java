package com.ping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ping.dao.UserDAO;
import com.ping.formBean.RegisterLoginFormBean;
import com.ping.model.UserBean;

@Service
public class UserService {
	@Autowired
	private UserDAO DAO;
	public boolean login(RegisterLoginFormBean formBean) {
		System.out.println("service");
		UserBean user = DAO.user(formBean);
		if (user != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public UserBean userInfo(String account) {
		UserBean user = DAO.userFromAccount(account);
		return user;
	}
	
	
}
