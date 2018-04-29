package com.nubeclick.pos.service;

public class ServiceException extends RuntimeException {

	private static final long serialVersionUID = -6185572200059841898L;

	public ServiceException() {
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Throwable cause) {
		super(cause);
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

}
