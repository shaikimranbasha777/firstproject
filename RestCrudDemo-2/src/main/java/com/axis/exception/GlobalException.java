package com.axis.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(IdNotFoundException.class)
	ResponseEntity<productErrorInfo> myException(IdNotFoundException exception)
		{
			productErrorInfo errorInfo = new productErrorInfo();
			errorInfo.setMsg(exception.getErrorMessage());
			errorInfo.setHttpStatus(HttpStatus.NOT_FOUND.toString());
			errorInfo.setLocalDateTime(LocalDateTime.now());
			
			return new ResponseEntity<productErrorInfo>(errorInfo, HttpStatus.NOT_FOUND);
		}
}
