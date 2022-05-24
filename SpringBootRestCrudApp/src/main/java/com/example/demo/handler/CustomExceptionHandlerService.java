package com.example.demo.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.exception.ProductNotFoundException;

@RestControllerAdvice
public class CustomExceptionHandlerService {
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<String> handleProductNotFoundException(
			ProductNotFoundException pne )
	{
		return new ResponseEntity<String>(pne.getMessage(), HttpStatus.NOT_FOUND);
	}
}
