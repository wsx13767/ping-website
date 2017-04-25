package com.ping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Session;

import com.ping.model.hibernate.HibernateUtil;

@Entity
@Table(name="DEPT")
public class DeptBean {
	@Id
	@Column(name="DEPTID")
	private int deptid;
	@Column(name="DEPTNAME")
	private String deptname;
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
		System.out.println(session.load(DeptBean.class, 40));
		HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		HibernateUtil.getSessionFactory().getCurrentSession().close();
	}
	
	
	@Override
	public String toString() {
		return "DeptBean [deptid=" + deptid + ", deptname=" + deptname + "]";
	}


	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
}
