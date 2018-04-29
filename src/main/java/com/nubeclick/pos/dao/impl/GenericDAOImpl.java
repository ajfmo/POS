package com.nubeclick.pos.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.nubeclick.pos.dao.DAOException;
import com.nubeclick.pos.dao.GenericDAO;

public class GenericDAOImpl<T, ID extends Serializable> implements GenericDAO<T, ID> {

	private SessionFactory sessionFactory;

	public GenericDAOImpl(Class<T> cl, SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		if (sessionFactory == null)
			throw new RuntimeException("Session factory is null!!!");
	}

	public T get(Class<T> entity, ID id) throws DAOException {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		T element = (T) session.get(entity, id);
		session.getTransaction().commit();
		return element;
	}

	public T save(T entity) throws DAOException {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		return entity;
	}

	public void saveOrUpdate(T entity) throws DAOException {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.saveOrUpdate(entity);
		session.getTransaction().commit();
	}

	public void delete(T entity) throws DAOException {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.delete(entity);
		session.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	public List<T> query(String hsql, Map<String, Object> params) throws DAOException {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Query<T> query = session.createQuery(hsql);
		if (params != null) {
			for (String i : params.keySet()) {
				query.setParameter(i, params.get(i));
			}
		}

		List<T> result = null;
		if ((hsql.toUpperCase().indexOf("DELETE") == -1) && (hsql.toUpperCase().indexOf("UPDATE") == -1)
				&& (hsql.toUpperCase().indexOf("INSERT") == -1)) {
			result = query.list();
		} else {
		}
		session.getTransaction().commit();

		return result;
	}

}
