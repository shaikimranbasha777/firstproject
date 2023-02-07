package com.axis.exception;

public class IdNotFoundException extends RuntimeException{

	String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public IdNotFoundException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
	
	
}
