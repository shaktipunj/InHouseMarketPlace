package com.cg.ima.service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ima.constant.EmployeeConstant;
import com.cg.ima.dto.EmployeeDto;
import com.cg.ima.entity.Employee;
import com.cg.ima.exception.InvalidEmployeeException;
import com.cg.ima.repository.IEmployeeRepository;


@Service("employeeservice")
@Transactional
public class IEmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
    IEmployeeRepository  employeerepo;

	
	@Override
	public int addEmployee(EmployeeDto employeedto) {
		Employee employee=new Employee();
		employee.setEmpName(employeedto.getEmpName());
		employee.setDeptName(employeedto.getDeptName());
		employee.setLocation(employeedto.getLocation());
		employee.setPassword(employeedto.getPassword());
		Employee savedemployee= employeerepo.save(employee);
		return savedemployee.getEmpId();
		
		
	}

	@Override
	
	public Employee getEmployee(int empId) throws InvalidEmployeeException {
		// TODO Auto-generated method stub
		Optional <Employee> optemployee=employeerepo.findById(empId);
		if(optemployee.isPresent()) {
			return optemployee.get();
		}
		throw new InvalidEmployeeException(EmployeeConstant.EMPLOYEE_NOT_FOUND);
	}

	
	

}
