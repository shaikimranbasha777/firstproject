package com.axis.exception;

public class inValidAgeException extends RuntimeException{
	String msg;
	public inValidAgeException(String msg) {
		super();
		this.msg = msg;
		}
	public String getMsg() {
		return msg;
	}

}
