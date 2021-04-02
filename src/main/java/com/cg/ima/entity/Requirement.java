package com.cg.ima.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="market_requirement")
public class Requirement {
	@Id 
	@Column(name="req_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int reqId;
	private boolean isFulfilled;
	private LocalDate fulfilledOn;
	@ManyToOne
	@JoinColumn(name="emp_id", referencedColumnName = "emp_id")
	private Employee emp;
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Requirement [reqId=" + reqId + ", isFulfilled=" + isFulfilled + ", fulfilledOn=" + fulfilledOn
				+ "]";
	}
	public Requirement(int reqId, boolean isFulfilled, LocalDate fulfilledOn) {
		super();
		this.reqId = reqId;
		this.isFulfilled = isFulfilled;
		this.fulfilledOn = fulfilledOn;
		
	}
	public Requirement() {
		// TODO Auto-generated constructor stub
	}
	public int getReqId() {
		return reqId;
	}
	public void setReqId(int reqId) {
		this.reqId = reqId;
	}
	public boolean isFulfilled() {
		return isFulfilled;
	}
	public void setFulfilled(boolean isFulfilled) {
		this.isFulfilled = isFulfilled;
	}
	public LocalDate getFulfilledOn() {
		return fulfilledOn;
	}
	public void setFulfilledOn(LocalDate fulfilledOn) {
		this.fulfilledOn = fulfilledOn;
	}
	
	
}
