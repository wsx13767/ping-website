package com.ping.model.hibernate;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;

/**
 * Servlet Filter implementation class OpenSessionInViewFilter
 */
@WebFilter(urlPatterns={"/*"})
public class OpenSessionInViewFilter implements Filter {
//	private FilterConfig fConfig;

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest  req = (HttpServletRequest) request;
		HttpServletResponse  res = (HttpServletResponse) response;
        try {
        	HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        	req.setCharacterEncoding("UTF-8");
			chain.doFilter(req, res);
        	HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
        } catch (HibernateException e) {
        	e.printStackTrace();
        	HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().rollback();
        }
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	@Override
	public void init(FilterConfig fConfig) throws ServletException {
//		this.fConfig = fConfig;
	}
	
	/**
	 * @see Filter#destroy()
	 */
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}
}
