package com.jbk.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class DefaultExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(StudentNotFoundException.class)
	public final ResponseEntity<ErrorDetail> studentNotFound(StudentNotFoundException e){
		ErrorDetail errorDetail=new ErrorDetail(e.getMessage(),"Check Id");
		return new ResponseEntity<>(errorDetail,HttpStatus.NOT_FOUND);
		
	}

}
