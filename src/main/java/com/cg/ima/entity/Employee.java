package com.cg.ima.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="market_employee")
public class Employee {
	@Id 
	@Column(name="emp_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empId;
	private String empName;
	private String deptName;
	private String location;
	private String password;
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", deptName=" + deptName + ", location=" + location + ", password="
				+ password + ", empId=" + empId + "]";
	}
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
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Employee(String empName, String deptName, String location, String password, int empId) {
		super();
		this.empName = empName;
		this.deptName = deptName;
		this.location = location;
		this.password = password;
		this.empId = empId;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
}