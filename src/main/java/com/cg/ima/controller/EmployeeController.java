package com.cg.ima.controller;

import javax.validation.Valid;
import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ima.constant.EmployeeConstant;
import com.cg.ima.dto.EmployeeDto;
import com.cg.ima.dto.SuccessMessageDto;
import com.cg.ima.entity.Employee;
import com.cg.ima.exception.InvalidEmployeeException;
import com.cg.ima.exception.ValidateException;
import com.cg.ima.service.IEmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeser;
	@PostMapping("addemployee")
	public SuccessMessageDto addEmployee(@Valid @RequestBody EmployeeDto employeedto, BindingResult br) throws ValidateException
	{
		if(br.hasErrors()) 
			throw new ValidateException(br.getFieldErrors());
		int id=employeeser.addEmployee(employeedto);
		return new SuccessMessageDto(EmployeeConstant.EMPLOYEE_ADDED + id);
	}
	@GetMapping("getemployeebyid/{eid}")
	public Employee getEmployee(@PathVariable (name="eid") int empId) throws InvalidEmployeeException
	{
		return employeeser.getEmployee(empId);
	}
	
}
