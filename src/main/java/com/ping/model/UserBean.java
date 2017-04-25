package com.ping.model;

import java.util.Locale;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Session;

import com.ping.model.hibernate.HibernateUtil;

@Entity
@Table(name="USERS")
public class UserBean {
	@Id
	private int id;
	private String name;
	private String account;
	private String password;
	private String birth;
	private String email;
	private String sex;
	private String rank;
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.TAIWAN);
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
		System.out.println(session.load(UserBean.class, 1));
		HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		HibernateUtil.closeSessionFactory();
	}
	
	@Override
	public String toString() {
		return "UserBean [id=" + id + ", name=" + name + ", account=" + account + ", password=" + password + ", birth="
				+ birth + ", email=" + email + ", sex=" + sex + ", rank=" + rank + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
}
