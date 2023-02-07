package com.axis.exception;

public class IdNotFoundException extends RuntimeException{
	
	String errorsg;

	public IdNotFoundException(String errorsg) {
		super();
		this.errorsg = errorsg;
	}

	public String getErrorsg() {
		return errorsg;
	}

	public void setErrorsg(String errorsg) {
		this.errorsg = errorsg;
	}
	
	
}
