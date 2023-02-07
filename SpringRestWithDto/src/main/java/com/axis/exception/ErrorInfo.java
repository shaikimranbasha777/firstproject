package com.axis.exception;

import java.time.LocalDateTime;

public class ErrorInfo {
	
	private String errorMessage;
	private String status;
	private LocalDateTime localDateTime;
	public ErrorInfo(String errorMessage, String status, LocalDateTime localDateTime) {
		super();
		this.errorMessage = errorMessage;
		this.status = status;
		this.localDateTime = localDateTime;
	}
	public ErrorInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
	
	
	
}
