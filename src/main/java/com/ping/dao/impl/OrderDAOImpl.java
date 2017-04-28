package com.ping.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.ping.dao.OrderDAO;
import com.ping.model.OrderBean;
import com.ping.model.hibernate.HibernateUtil;
@Repository
public class OrderDAOImpl implements OrderDAO {

	private Session getSession() {
		return HibernateUtil.getSessionFactory().getCurrentSession();
	}
	
	@Override
	public OrderBean select(OrderBean orderBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderBean insert(OrderBean orderBean) {
		Session session = null;
		OrderBean obj = null;
		try {
			session = this.getSession();
//			Query<Integer> count = session.createQuery("select count(*) from OrderBean", Integer.class);
//			orderBean.setId(Integer.valueOf(count.uniqueResult().toString()).intValue() + 1);
			orderBean.setId(1);
			session.save(orderBean);
			obj = orderBean;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
			
			
		return obj;
	}

	@Override
	public OrderBean update(OrderBean orderBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderBean delete(OrderBean orderBean) {
		// TODO Auto-generated method stub
		return null;
	}

}
