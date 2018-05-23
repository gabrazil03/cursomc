package com.nelioalves.cursomc.services.exception;

public class ObjectNotFoundExption extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundExption(String msg) {
		super(msg);
	}
	
	public ObjectNotFoundExption(String msg, Throwable cause) {
		super(msg, cause);
	}
}
