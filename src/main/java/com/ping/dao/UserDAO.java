package com.ping.dao;

import com.ping.formBean.RegisterLoginFormBean;
import com.ping.model.UserBean;

public interface UserDAO {
	public UserBean user(RegisterLoginFormBean formBean);
	public UserBean userFromAccount(String account);
}
