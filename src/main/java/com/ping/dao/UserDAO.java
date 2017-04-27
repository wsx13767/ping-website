package com.ping.dao;


import com.ping.model.UserBean;

public interface UserDAO {
	public UserBean selectUserFromAccountPassword(UserBean formBean);
	public UserBean selectUserFromAccount(String account);
	public UserBean update(UserBean userBean);
	public UserBean insert(UserBean userBean);
}
