package com.ping.model.hibernate;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;



@WebListener
public class SessionFactoryListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("應用程式關閉");
		HibernateUtil.closeSessionFactory();

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("應用程式啟動");
		HibernateUtil.getSessionFactory();
	}

}
