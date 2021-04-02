package com.cg.ima.entity;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="market_proposal")
public class Proposal {
	@Id 
	@Column(name="prop_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int propId;
	private String proposal;
	private double amount;
	private LocalDate proposalDate;
	private boolean isAccepted;
	private LocalDate acceptedOn;
	@ManyToOne
	@JoinColumn(name="req_id",referencedColumnName = "req_id")
	private Requirement requirement;
	public Requirement getRequirement() {
		return requirement;
	}
	public void setRequirement(Requirement requirement) {
		this.requirement = requirement;
	}
	@ManyToOne 
	@JoinColumn(name="resource_id",referencedColumnName = "resource_id")
	private Resource resource;
	@Override
	public String toString() {
		return "Proposal [propId=" + propId + ", proposal=" + proposal + ", amount=" + amount + ", proposalDate="
				+ proposalDate + ", isAccepted=" + isAccepted + ", acceptedOn=" + acceptedOn + " resource=" + resource + "]";
	}
	public Proposal(int propId, String proposal, double amount, LocalDate proposalDate, boolean isAccepted,
			LocalDate acceptedOn, Employee emp, Resource resource) {
		super();
		this.propId = propId;
		this.proposal = proposal;
		this.amount = amount;
		this.proposalDate = proposalDate;
		this.isAccepted = isAccepted;
		this.acceptedOn = acceptedOn;
		
		this.resource = resource;
	}
	public Proposal() {
		// TODO Auto-generated constructor stub
	}
	public int getPropId() {
		return propId;
	}
	public void setPropId(int propId) {
		this.propId = propId;
	}
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
	public LocalDate getProposalDate() {
		return proposalDate;
	}
	public void setProposalDate(LocalDate proposalDate) {
		this.proposalDate = proposalDate;
	}
	public boolean isAccepted() {
		return isAccepted;
	}
	public void setAccepted(boolean isAccepted) {
		this.isAccepted = isAccepted;
	}
	public LocalDate getAcceptedOn() {
		return acceptedOn;
	}
	public void setAcceptedOn(LocalDate acceptedOn) {
		this.acceptedOn = acceptedOn;
	}
	
	
	public Resource getResource() {
		return resource;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	
}
