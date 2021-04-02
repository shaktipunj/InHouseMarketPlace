package com.cg.ima.service;

import java.util.List;

import com.cg.ima.dto.EmployeeDto;
import com.cg.ima.entity.Employee;
import com.cg.ima.entity.Offer;
import com.cg.ima.entity.Proposal;
import com.cg.ima.entity.Requirement;
import com.cg.ima.exception.InvalidEmployeeException;

public interface IEmployeeService {
	
	//Employee addEmployee(Employee emp);
	
	//Employee editEmployee(Employee emp);
	
	Employee getEmployee(int empId) throws InvalidEmployeeException;

	int addEmployee(EmployeeDto employeedto);
	
	//Offer updateIsAvailable(Offer offer);
	
	//Requirement updateIsFulfilled(Requirement req);
	
	//Proposal updateIsAccepted(Proposal prop);
	
	//List<Offer> getAllOffers(int empId) throws InvalidEmployeeException;
	
	//List<Requirement> getAllRequirements(int empId) throws InvalidEmployeeException;
}
