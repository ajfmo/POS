package com.nubeclick.pos.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory emf;

	private static synchronized void buildEntityManagerFactory() {
		try {
			emf = Persistence.createEntityManagerFactory("POSNubeClick");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static EntityManagerFactory getEntityManagerFactory() {
		if (emf == null) {
			buildEntityManagerFactory();
		}
		return emf;
	}

	public static void shutdown() {
		if (emf != null && emf.isOpen() == true) {
			getEntityManagerFactory().close();
		}
	}

	public EntityManagerFactory getCurrentFactory() {
		emf = (EntityManagerFactory) Persistence.getPersistenceUtil();
		return emf;
	}

	/*
	 * 
	 * import javax.persistence.EntityManager; import
	 * javax.persistence.EntityManagerFactory; import javax.persistence.Persistence;
	 * 
	 * public class JPAUtil {
	 * 
	 * private static final String PERSISTENCE_UNIT = "appUnitPU"; private static
	 * ThreadLocal<EntityManager> threadLocal; private static EntityManagerFactory
	 * factory;
	 * 
	 * static { factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
	 * threadLocal = new ThreadLocal<EntityManager>(); }
	 * 
	 * public static EntityManager getEntityManager() { if (threadLocal.get() ==
	 * null) { threadLocal.set(factory.createEntityManager()); } return
	 * threadLocal.get(); }
	 * 
	 * public static void closeEntityManager() { EntityManager em =
	 * threadLocal.get(); if (em != null) { threadLocal.remove(); em.close(); } }
	 * 
	 */

}
