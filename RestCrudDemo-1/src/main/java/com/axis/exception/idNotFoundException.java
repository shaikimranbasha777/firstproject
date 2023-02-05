package com.axis.exception;

public class idNotFoundException extends RuntimeException{
	private String msg;
	
	public idNotFoundException(String msg) {
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}
}
