package com.ping.formBean;

public class RegisterLoginFormBean {
	private String account;
	private String password;
	private String name;
	private String email;
	private String phone;
	private String sex;
	
	@Override
	public String toString() {
		return "RegisterLoginFormBean [account=" + account + ", password=" + password + ", name=" + name + ", email="
				+ email + ", phone=" + phone + ", sex=" + sex + "]";
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
