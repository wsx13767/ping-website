package com.ping.model;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;
import org.hibernate.query.Query;

import com.ping.model.hibernate.HibernateUtil;



@Entity
@Table(name="USERS")
public class UserBean implements Cloneable {
	@Id
	@GeneratedValue(generator = "generateId")
	@GenericGenerator(name = "generateId", strategy = "uuid")
	private String id;
	private String name;
	private String account;
	private String password;
	private String birth;
	private String email;
	private String sex;
	private String rank;
	private String phone;
	
	@Override
	 public Object clone() throws CloneNotSupportedException {
	  return super.clone();
	 }
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		UserBean user = new UserBean();
//		user.setId(0);
		user.setBirth("1");
		user.setAccount("qqqq");
//		System.out.println(user.getId());
//		session.geti
		session.save(user);
//		Query<UserBean> query = session.createQuery("from UserBean where account = ? and password = ?", UserBean.class);
//		query.setParameter(0, "123");
//		query.setParameter(1, "456");
//		user = query.uniqueResult();
//		System.out.println(user.getId());
//		System.out.println(session.load(UserBean.class, 2));
//		@SuppressWarnings("unchecked")
//		List<UserBean> lists = session.createQuery("FROM UserBean").list();
//		System.out.println(lists);
		session.getTransaction().commit();
		HibernateUtil.closeSessionFactory();
	}
	
	@Override
	public String toString() {
		return "UserBean [id=" + id + ", name=" + name + ", account=" + account + ", password=" + password + ", birth="
				+ birth + ", email=" + email + ", sex=" + sex + ", rank=" + rank + ", phone=" + phone + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
