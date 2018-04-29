package com.nubeclick.pos.service;

import java.io.Serializable;
import java.util.List;

import com.nubeclick.pos.dao.GenericDAO;

public interface GenericService<T, ID extends Serializable> extends GenericDAO<T, ID> {
	List<T> getAll();

	void deleteAll();
}
