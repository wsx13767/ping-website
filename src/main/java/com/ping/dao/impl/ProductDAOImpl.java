package com.ping.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.ping.dao.ProductDAO;
import com.ping.model.ProductBean;
import com.ping.model.hibernate.HibernateUtil;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	private Session getSession() {
		return HibernateUtil.getSessionFactory().getCurrentSession();
	}
	@Override
	public ProductBean select(ProductBean productBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductBean insert(ProductBean productBean) {
		Session session = null;
		ProductBean obj = null;
		try {
			session = this.getSession();
			session.save(productBean);
			obj = productBean;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public ProductBean update(ProductBean productBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductBean delete(ProductBean productBean) {
		// TODO Auto-generated method stub
		return null;
	}

}
