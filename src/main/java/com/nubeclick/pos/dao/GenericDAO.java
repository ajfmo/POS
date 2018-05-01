package com.nubeclick.pos.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface GenericDAO<T, ID extends Serializable> {

	public T get(Class<T> entity, ID id) throws DAOException;

	public T save(T entity) throws DAOException;

	public void saveOrUpdate(T entity) throws DAOException;

	public void delete(T entity) throws DAOException;

	public List<T> query(String hsql, Map<String, Object> params) throws DAOException;

}
