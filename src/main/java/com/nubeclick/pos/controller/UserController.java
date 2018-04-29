package com.nubeclick.pos.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.nubeclick.pos.dto.User;
import com.nubeclick.pos.util.JPAUtil;

public class UserController {

	// Objects
	private EntityManager manager = JPAUtil.getEntityManagerFactory().createEntityManager();

	public boolean loginUser(String userLogin, String userPwd) {
		Query hqlQuery = manager.createNamedQuery("User.Login", User.class);
		hqlQuery.setParameter("userLogin", userLogin);
		hqlQuery.setParameter("userPwd", userPwd);
		List<User> resultset = hqlQuery.getResultList();
		if (resultset != null && resultset.size() > 0) {
			return true;
		}
		return false;
	}
}
