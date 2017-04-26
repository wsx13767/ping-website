package com.ping.dao.impl;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.ping.dao.UserDAO;
import com.ping.formBean.RegisterLoginFormBean;
import com.ping.model.UserBean;
import com.ping.model.hibernate.HibernateUtil;
@Repository
public class UserDAOImpl implements UserDAO {
//	@Autowired
//	private DriverManagerDataSource dataSource;
	@Override
	public UserBean user(RegisterLoginFormBean formBean) {
		Session session = null;
		UserBean obj = null;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			Query<UserBean> query = session.createQuery("from UserBean where account = ? and password = ?", UserBean.class);
			query.setParameter(0, formBean.getAccount());
			query.setParameter(1, formBean.getPassword());
			obj = query.uniqueResult();			
			session.getTransaction().commit();
			session.close();
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
			session.close();
		}
		return obj;
	}
	@Override
	public UserBean userFromAccount(String account) {
		Session session = null;
		UserBean obj = null;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			Query<UserBean> query = session.createQuery("from UserBean where account = ?", UserBean.class);
			query.setParameter(0, account);
			obj = query.uniqueResult();
			session.getTransaction().commit();
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.close();
		}
		return obj;
	}
}
