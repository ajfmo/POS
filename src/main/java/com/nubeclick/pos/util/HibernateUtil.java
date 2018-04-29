package com.nubeclick.pos.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	private static StandardServiceRegistry registry;

	public static synchronized void buildSessionFactory() {

		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure("/config/hibernate.cfg.xml").build();
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			if (registry != null) {
				StandardServiceRegistryBuilder.destroy(registry);
			}
		}
	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			buildSessionFactory();
		}
		return sessionFactory;
	}

	public static void shutdown() {
		if (registry != null && sessionFactory != null && sessionFactory.isClosed() == false) {
			getSessionFactory().close();
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}
}