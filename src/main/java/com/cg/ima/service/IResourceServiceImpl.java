package com.cg.ima.service;

import java.time.LocalDate;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ima.constant.EmployeeConstant;
import com.cg.ima.constant.ResourceConstant;
import com.cg.ima.dto.ResourceDto;
import com.cg.ima.entity.Employee;
import com.cg.ima.entity.Resource;
import com.cg.ima.exception.InvalidEmployeeException;
import com.cg.ima.exception.InvalidResourceException;
import com.cg.ima.repository.IEmployeeRepository;
import com.cg.ima.repository.IResourceRepository;

@Service("resourceservice")
@Transactional
public class IResourceServiceImpl implements IResourceService {

	@Autowired
	IResourceRepository resourcerepo;
	@Autowired
	private IEmployeeRepository emprepo;

	
	@Override
	public int addResource(ResourceDto resourcedto) throws InvalidEmployeeException {
Optional<Employee> optemp= emprepo.findById(resourcedto.getEmpId());
if(optemp.isEmpty()) {
	
	throw new InvalidEmployeeException(EmployeeConstant.EMPLOYEE_NOT_FOUND);
}
		Resource resource = new Resource();
		resource.setEmp(optemp.get());
		resource.setTitle(resource.getTitle());
		resource.setDescription(resource.getDescription());
		resource.setCategory(resource.getCategory());
		resource.setPrice(resource.getPrice());
		resource.setDate(LocalDate.now());
		resource.setType(resourcedto.getType());
		
		Resource savedresource = resourcerepo.save(resource);
		return savedresource.getResId();

	}


	@Override
	public Resource getAllResource(int resourceId) throws InvalidResourceException {
		// TODO Auto-generated method stub
		Optional<Resource> optresource = resourcerepo.findById(resourceId);
		if (optresource.isPresent()) {
			return optresource.get();
		}
		throw new InvalidResourceException(ResourceConstant.RESOURCE_NOT_FOUND);
	}}

	