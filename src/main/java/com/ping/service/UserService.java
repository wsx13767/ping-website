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
		UserBean userBean = new UserBean();
		userBean.setAccount(formBean.getAccount());
		userBean.setPassword(formBean.getPassword());
		UserBean user = DAO.selectUserFromAccountPassword(userBean);
		if (user != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public UserBean userInfo(String account) {
		UserBean user = DAO.selectUserFromAccount(account);
		return user;
	}
	
	public UserBean register(RegisterLoginFormBean formBean) {
		UserBean userBean = new UserBean();
		userBean.setAccount(formBean.getAccount());
		userBean.setPassword(formBean.getPassword());
		userBean.setName(formBean.getName());
		userBean.setEmail(formBean.getEmail());
		userBean.setPhone(formBean.getPhone());
		userBean.setRank("1");
		userBean.setSex(formBean.getSex());
		DAO.insert(userBean);
		
		return userBean;
	}
	
	
}
