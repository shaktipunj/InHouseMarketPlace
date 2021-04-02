package com.cg.ima.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ima.constant.RequirementConstant;
import com.cg.ima.constant.ResourceConstant;
import com.cg.ima.dto.RequirementDto;
import com.cg.ima.dto.ResourceDto;
import com.cg.ima.dto.SuccessMessageDto;
import com.cg.ima.entity.Requirement;
import com.cg.ima.entity.Resource;
import com.cg.ima.exception.InvalidEmployeeException;
import com.cg.ima.exception.InvalidRequirementException;
import com.cg.ima.exception.InvalidResourceException;
import com.cg.ima.exception.ValidateException;
import com.cg.ima.service.IRequirementService;
import com.cg.ima.service.IResourceService;

@RestController
public class ResourceController {

	@Autowired
	private IResourceService resourceser;
	@PostMapping("addresource")
	public SuccessMessageDto addResource(@Valid @RequestBody ResourceDto resourcedto, BindingResult br) throws ValidateException, InvalidEmployeeException
	{
		if(br.hasErrors()) 
			throw new ValidateException(br.getFieldErrors());
		int id=resourceser.addResource(resourcedto);
		return new SuccessMessageDto(ResourceConstant.RESOURCE_ADDED + id);
	}
	@GetMapping("getallresourcesbyid/{resid}")
	public Resource getAllResource(@PathVariable (name="resid") int resourceId) throws InvalidResourceException
	{
		return resourceser.getAllResource(resourceId);
	}
}
