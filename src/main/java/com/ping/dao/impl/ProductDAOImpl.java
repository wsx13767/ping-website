package com.ping.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
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
			Query<Long> count = session.createQuery("SELECT COUNT(*) FROM ProductBean", Long.class);
			productBean.setId(Integer.valueOf(count.uniqueResult().toString()).intValue() + 1);
			productBean.setStatus("open");
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
	@Override
	public List<ProductBean> selectForList() {
		Session session = null;
		List<ProductBean> obj = null;
		try {
			session = this.getSession();
			Query<ProductBean> query = session.createQuery("From ProductBean where STATUS = ?", ProductBean.class);
			query.setParameter(0, "open");
			obj = query.getResultList();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return obj;
	}

}
