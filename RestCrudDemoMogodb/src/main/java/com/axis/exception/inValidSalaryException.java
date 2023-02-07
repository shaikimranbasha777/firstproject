package com.axis.exception;

public class inValidSalaryException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;

	public inValidSalaryException(String msg) {
		super();
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}
}
