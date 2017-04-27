package com.ping.model.hibernate;



import java.util.Locale;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	private static SessionFactory sessionFactory = createSessionFactory();
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public static void closeSessionFactory() {
		if(sessionFactory!=null) {
			sessionFactory.close();
		}
	}
	private static SessionFactory createSessionFactory() {
		try {
			Locale.setDefault(Locale.TAIWAN);
			StandardServiceRegistry serviceRegistry =
					new StandardServiceRegistryBuilder().configure("/com/ping/model/hibernate/hibernate.cfg.xml").build();
			return new MetadataSources(
					serviceRegistry).buildMetadata().buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
            throw new ExceptionInInitializerError(e);
		}
	}
}
