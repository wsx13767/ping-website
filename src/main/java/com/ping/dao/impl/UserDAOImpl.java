package com.ping.dao.impl;



import org.hibernate.HibernateException;
import org.hibernate.Session;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.ping.dao.UserDAO;
import com.ping.model.UserBean;
import com.ping.model.hibernate.HibernateUtil;
@Repository
public class UserDAOImpl implements UserDAO {
	
	private Session getSession() {
		return HibernateUtil.getSessionFactory().getCurrentSession();
	}
	@Override
	public UserBean selectUserFromAccountPassword(UserBean userBean) {
		Session session = null;
		UserBean obj = null;
		try {
			session = this.getSession();
			Query<UserBean> query = session.createQuery("from UserBean where account = ? and password = ?", UserBean.class);
			query.setParameter(0, userBean.getAccount());
			query.setParameter(1, userBean.getPassword());
			obj = query.uniqueResult();			
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return obj;
	}
	@Override
	public UserBean selectUserFromAccount(String account) {
		Session session = null;
		UserBean obj = null;
		try {
			session = this.getSession();
			Query<UserBean> query = session.createQuery("from UserBean where account = ?", UserBean.class);
			query.setParameter(0, account);
			obj = query.uniqueResult();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return obj;
	}
	@Override
	public UserBean update(UserBean userBean) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public UserBean insert(UserBean userBean) {
		Session session = null;
		UserBean obj = null;
		try {
			session = this.getSession();
			Query<Long> count = session.createQuery("select count(*) from UserBean", Long.class);
			
			userBean.setId(Integer.valueOf(count.uniqueResult().toString()).intValue() + 1);
			session.save(userBean);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}
}
