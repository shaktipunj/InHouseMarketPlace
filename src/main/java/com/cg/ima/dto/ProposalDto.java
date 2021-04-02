package com.cg.ima.dto;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class ProposalDto {
	@Size(min= 3, message= "proposal description must have 3 characters")
	private String proposal;
	@Min(value= 1000, message= "proposal amount must be minimum 1000")
	private double amount;
	@Min(value= 1, message= "requirementid must be minimum 1")
	private int requirementId;
	@Min(value= 1, message= "resourceid must be minimum 1")
	private int resourceId;
	public String getProposal() {
		return proposal;
	}
	public void setProposal(String proposal) {
		this.proposal = proposal;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getRequirementId() {
		return requirementId;
	}
	public void setRequirementId(int requirementId) {
		this.requirementId = requirementId;
	}
	public int getResourceId() {
		return resourceId;
	}
	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}
	public ProposalDto() {
}
}