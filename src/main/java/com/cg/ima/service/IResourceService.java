package com.cg.ima.service;
import javax.validation.Valid;

import com.cg.ima.dto.ResourceDto;
import com.cg.ima.entity.Resource;
import com.cg.ima.exception.InvalidEmployeeException;
import com.cg.ima.exception.InvalidResourceException;

public interface IResourceService {
	
	//List<Resource> getAllResources(String category, String type);
	
	//List<Resource> getAllResources(int empId) throws InvalidEmployeeException;

	int addResource(@Valid ResourceDto resourcedto) throws InvalidEmployeeException;

	
	Resource getAllResource(int resourceId) throws InvalidResourceException;

	
}
