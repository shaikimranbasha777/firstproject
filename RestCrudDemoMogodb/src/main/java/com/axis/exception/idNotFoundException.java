package com.axis.exception;

public class idNotFoundException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	
	public idNotFoundException(String msg) {
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}
}
