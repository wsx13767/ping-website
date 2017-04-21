package com.ping.dao;

import com.ping.formBean.RegisterLoginFormBean;

public interface UserDAO {
	public boolean select(RegisterLoginFormBean formBean);
}
