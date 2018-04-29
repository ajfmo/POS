package com.nubeclick.pos.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;

import com.nubeclick.pos.dao.DAOException;
import com.nubeclick.pos.dao.GenericDAO;
import com.nubeclick.pos.dao.impl.GenericDAOImpl;

public class GenericServiceImpl<T, ID extends Serializable> implements GenericService<T, ID> {

	private GenericDAO<T, ID> dao;
	private Class<T> entity;

	public GenericServiceImpl(Class<T> entity, SessionFactory sessionFactory) {
		this.entity = entity;
		dao = new GenericDAOImpl<T, ID>(entity, sessionFactory);
	}

	@Override
	public T get(Class<T> entity, ID id) throws DAOException {
		return (T) dao.get(entity, id);
	}

	@Override
	public T save(T entity) throws DAOException {
		return (T) dao.save(entity);
	}

	@Override
	public void saveOrUpdate(T entity) throws DAOException {
		dao.saveOrUpdate(entity);
	}

	@Override
	public void delete(T entity) throws DAOException {
		dao.delete(entity);
	}

	@Override
	public List<T> getAll() {
		return query("from " + entity.getName(), null);
	}

	@Override
	public void deleteAll() {
		query("delete from " + entity.getName(), null);
	}

	@Override
	public List<T> query(String hsql, Map<String, Object> params) {
		return (List<T>) dao.query(hsql, params);
	}

}
