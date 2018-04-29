package com.nubeclick.pos.dao;

import org.hibernate.HibernateException;

public class DAOException extends HibernateException {

	private static final long serialVersionUID = -75650143752664310L;

	public DAOException(String message, Throwable cause) {
		super(message, cause);
	}

	public DAOException(String message) {
		super(message);
	}

	public DAOException(Throwable cause) {
		super(cause);
	}

}
