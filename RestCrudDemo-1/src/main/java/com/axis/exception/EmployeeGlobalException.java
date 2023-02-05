package com.axis.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeGlobalException {

	@ExceptionHandler(idNotFoundException.class)
	ResponseEntity<ErrorInfo> myException(idNotFoundException exception)
		{
			ErrorInfo errorInfo = new ErrorInfo();
			errorInfo.setMsg(exception.getMsg());
			errorInfo.setHttpStatus(HttpStatus.NOT_FOUND.toString());
			errorInfo.setLocalDateTime(LocalDateTime.now());
			
			return new ResponseEntity<ErrorInfo>(errorInfo, HttpStatus.NOT_FOUND);
		}
	
	@ExceptionHandler(inValidAgeException.class)
	ResponseEntity<ErrorInfo> myException2(inValidAgeException exception)
		{
			ErrorInfo errorInfo = new ErrorInfo();
			errorInfo.setMsg(exception.getMsg());
			errorInfo.setMsg(HttpStatus.NOT_FOUND.toString());
			errorInfo.setLocalDateTime(LocalDateTime.now());
			
			return new ResponseEntity<ErrorInfo>(errorInfo, HttpStatus.BAD_REQUEST);
		}
	
	@ExceptionHandler(inValidSalaryException.class)
	ResponseEntity<ErrorInfo> myException3(inValidSalaryException exception)
		{
			ErrorInfo errorInfo = new ErrorInfo();
			errorInfo.setMsg(exception.getMsg());
			errorInfo.setMsg(HttpStatus.NOT_FOUND.toString());
			errorInfo.setLocalDateTime(LocalDateTime.now());
			
			return new ResponseEntity<ErrorInfo>(errorInfo, HttpStatus.BAD_REQUEST);
		}
	
}
