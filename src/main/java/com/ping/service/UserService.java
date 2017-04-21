package com.ping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ping.dao.UserDAO;
import com.ping.formBean.RegisterLoginFormBean;

@Service
public class UserService {
	@Autowired
	private UserDAO DAO;
	public boolean login(RegisterLoginFormBean formBean) {
		return DAO.select(formBean);
	}
}
