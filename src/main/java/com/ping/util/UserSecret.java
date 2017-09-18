package com.ping.util;

import com.ping.model.UserBean;

public class UserSecret {
	public static UserBean changeSectrt(UserBean user) {
		String password = user.getPassword();
		String email = user.getEmail();
		String[] emailArray = email.split("@");
		user.setEmail(emailArray[0].substring(0, 2) + "****" + emailArray[1].substring(emailArray[1].length() - 2));
		user.setPassword(password.substring(0, 2) + "****" + password.substring(password.length() - 2));
		return user;
	}
}
