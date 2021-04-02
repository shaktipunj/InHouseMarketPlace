package com.cg.ima.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.ima.constant.EmployeeConstant;
import com.cg.ima.constant.OfferConstant;
import com.cg.ima.dto.ErrorMessageDto;
import com.cg.ima.exception.InvalidEmployeeException;
import com.cg.ima.exception.InvalidOfferException;
import com.cg.ima.exception.ValidateException;

@RestControllerAdvice
public class OfferAdvice {
	
	@ExceptionHandler(InvalidOfferException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorMessageDto handleNotFoundException(InvalidOfferException exception)
	{
		return new ErrorMessageDto(OfferConstant.OFFER_NOT_FOUND,HttpStatus.NOT_FOUND.toString());
	}
	@ExceptionHandler(ValidateException.class)
	@ResponseStatus(HttpStatus.FORBIDDEN)
	public ErrorMessageDto handleValidateException(ValidateException exception)
	{
		List<String> lstmesagges=exception.getLserror().stream().map(m->m.getDefaultMessage().toString()).collect(Collectors.toList());
		return new ErrorMessageDto(lstmesagges);
	}
	

}