package com.axis.exception;

public class inValidAgeException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;
	public inValidAgeException(String msg) {
		super();
		this.msg = msg;
		}
	public String getMsg() {
		return msg;
	}

}
