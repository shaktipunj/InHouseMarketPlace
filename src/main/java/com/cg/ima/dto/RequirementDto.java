package com.cg.ima.dto;

import java.time.LocalDate;

import javax.validation.constraints.Size;

public class RequirementDto {

	@Size(min=3,message="requirement name should be minimum 3 characters")
	private int reqId;
	private boolean isFulfilled;
	private LocalDate fulfilledOn;
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
	
	public RequirementDto(){
	
}
}
