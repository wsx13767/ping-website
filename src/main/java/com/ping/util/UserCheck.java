package com.ping.util;

import java.util.Map;

import com.ping.formBean.RegisterLoginFormBean;

public class UserCheck {
	private boolean result;
	
	public boolean getResult() {
		return result;
	}
	public UserCheck(RegisterLoginFormBean formBean, Map<String, String> error, String type) {	
		switch (type) {
			case "login":
				loginCheck(formBean, error);
				break;
			case "register":
				registerCheck(formBean, error);
				break;
		}
	}
	

	private void loginCheck(RegisterLoginFormBean formBean, Map<String, String> error) {
		String account = formBean.getAccount().replaceAll("\\s+", "").replaceAll("　", "");
		String password = formBean.getPassword().replaceAll("\\s+", "");
		
		if (account == null || "".equals(account) || password == null || "".equals(password)) {
			if (account == null || "".equals(account)) {
				error.put("account", "Account is null !!!!");
			}
			if (password == null || "".equals(password)) {
				error.put("password", "Password is null !!!!");
			}
			this.result = false;
		} else {
			this.result = true;
		}
	}
	
	
	private void registerCheck(RegisterLoginFormBean formBean, Map<String, String> error) {
		String account = formBean.getAccount().replaceAll("\\s+", "").replaceAll("　", "");
		String password = formBean.getPassword().replaceAll("\\s+", "");
		String name = formBean.getName() == null ? null : formBean.getName().replaceAll("\\s+", "").replaceAll("　", "");
		String email = formBean.getEmail() == null ? null : formBean.getEmail().replaceAll("\\s+", "").replaceAll("　", "");
		String phone = formBean.getPhone() == null ? null : formBean.getPhone().replaceAll("\\s+", "").replaceAll("　", "");
		String sex = formBean.getSex();

		if (account == null || "".equals(account) ||
				password == null || "".equals(password) ||
				name == null || "".equals(name) ||
				email == null || "".equals(name) ||
				phone == null || "".equals(phone) ||
				sex == null || "".equals(sex)) {
			if (account == null || "".equals(account)) {
				error.put("registerAccount", "Account is null !!!!");
			}
			if (password == null || "".equals(password)) {
				error.put("registerPassword", "Password is null !!!!");
			}
			if (name == null || "".equals(name)) {
				error.put("name", "Name is null !!!!");
			}
			if (email == null || "".equals(name)) {
				error.put("email", "Email is null !!!!");
			}
			if (phone == null || "".equals(phone)) {
				error.put("phone", "Phone is null !!!!");
			}
			if (sex == null || "".equals(sex)) {
				error.put("sex", "Sex is not select !!!!");
			}
			this.result = false;
		} else {
			this.result = true;
		}
	}
	
	
	
}
