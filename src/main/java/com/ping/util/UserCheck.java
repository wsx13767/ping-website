package com.ping.util;


import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import com.ping.formBean.RegisterLoginFormBean;

public class UserCheck {
	private boolean result;
	private static Map<String, String> errorMap;
	
	
	public boolean getResult() {
		return result;
	}
	
	public UserCheck(RegisterLoginFormBean formBean, Map<String, String> error, String type, Locale language) {
		this.setErrorMap(language);
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
		String account = this.replaceIlleagelValue(formBean.getAccount());
		String password = this.replaceIlleagelValue(formBean.getPassword());
		
		if (account == null || "".equals(account) || password == null || "".equals(password)) {
			if (account == null || "".equals(account)) {
				error.put("account", errorMap.get("account"));
			}
			if (password == null || "".equals(password)) {
				error.put("password", errorMap.get("password"));
			}
			this.result = false;
		} else {
			this.result = true;
		}
	}
	
	
	private void registerCheck(RegisterLoginFormBean formBean, Map<String, String> error) {
		String account = this.replaceIlleagelValue(formBean.getAccount());
		String password = this.replaceIlleagelValue(formBean.getPassword());
		String name = this.replaceIlleagelValue(formBean.getName());
		String email = this.replaceIlleagelValue(formBean.getEmail());
		String phone = this.replaceIlleagelValue(formBean.getPhone());
		String sex = formBean.getSex();

		if (account == null || "".equals(account) ||
				password == null || "".equals(password) ||
				name == null || "".equals(name) ||
				email == null || "".equals(name) ||
				phone == null || "".equals(phone) ||
				sex == null || "".equals(sex)) {
			if (account == null || "".equals(account)) {
				error.put("registerAccount", errorMap.get("registerAccount"));
			}
			if (password == null || "".equals(password)) {
				error.put("registerPassword", errorMap.get("registerPassword"));
			}
			if (name == null || "".equals(name)) {
				error.put("name", errorMap.get("name"));
			}
			if (email == null || "".equals(name)) {
				error.put("email", errorMap.get("email"));
			}
			if (phone == null || "".equals(phone)) {
				error.put("phone", errorMap.get("phone"));
			}
			if (sex == null || "".equals(sex)) {
				error.put("sex", errorMap.get("sex"));
			}
			this.result = false;
		} else {
			this.result = true;
		}
	}
	
	private String replaceIlleagelValue(String chr) {
		return (chr == null ? null : chr.replaceAll("\\s+", "").replaceAll("　", ""));
	}
	
	private void setErrorMap(Locale language) {
		errorMap = new HashMap<String, String>();
		errorMap.put("account", ResourceBundleProperties.getString(language.toString() ,"error.accountIsNull"));
		errorMap.put("password", ResourceBundleProperties.getString(language.toString() ,"error.passwordIsNull"));
		errorMap.put("registerAccount", ResourceBundleProperties.getString(language.toString() ,"error.registerAccountIsNull"));
		errorMap.put("registerPassword", ResourceBundleProperties.getString(language.toString() ,"error.registerPasswordIsNull"));
		errorMap.put("name", ResourceBundleProperties.getString(language.toString() ,"error.nameIsNull"));
		errorMap.put("email", ResourceBundleProperties.getString(language.toString() ,"error.emailIsNull"));
		errorMap.put("phone", ResourceBundleProperties.getString(language.toString() ,"error.phoneIsNull"));
		errorMap.put("sex", ResourceBundleProperties.getString(language.toString() ,"error.sexIsNull"));
	}
}
