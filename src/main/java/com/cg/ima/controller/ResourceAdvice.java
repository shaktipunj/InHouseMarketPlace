package com.cg.ima.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.ima.constant.RequirementConstant;
import com.cg.ima.constant.ResourceConstant;
import com.cg.ima.dto.ErrorMessageDto;
import com.cg.ima.exception.InvalidRequirementException;
import com.cg.ima.exception.InvalidResourceException;
import com.cg.ima.exception.ValidateException;

@RestControllerAdvice
public class ResourceAdvice {
	
	@ExceptionHandler(InvalidResourceException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorMessageDto handleNotFoundException(InvalidResourceException exception)
	{
		return new ErrorMessageDto(ResourceConstant.RESOURCE_NOT_FOUND,HttpStatus.NOT_FOUND.toString());
	}
	@ExceptionHandler(ValidateException.class)
	@ResponseStatus(HttpStatus.FORBIDDEN)
	public ErrorMessageDto handleValidateException(ValidateException exception)
	{
		List<String> lstmesagges=exception.getLserror().stream().map(m->m.getDefaultMessage().toString()).collect(Collectors.toList());
		return new ErrorMessageDto(lstmesagges);
	}

}
