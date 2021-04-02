package com.cg.ima.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class EmployeeDto {

	@Pattern (regexp="[A-Za-z]{3,20}",message="name must contain alphabets")
	@Size(min=3,message="employee name should be minimum 3 characters")
	private String empName;
	@Size(min=2,message="dept name must have minimum 2 characters")
	private String deptName;
	@Size(min=3,message="location must have minimum 3 characters")
	private String location;
	@Size(min=7,message="password should consist of minimum of 7 characters")
	private String password;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public EmployeeDto() {
		
	}
	
}
