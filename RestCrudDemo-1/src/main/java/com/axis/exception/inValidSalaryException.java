package com.axis.exception;

public class inValidSalaryException extends RuntimeException {
	String msg;

	public inValidSalaryException(String msg) {
		super();
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}
}
