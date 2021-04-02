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
@Table(name="market_offer")
public class Offer {
	@Id 
	@Column(name="offer_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int offerId;
	private String isAvailable;
	private LocalDate availableUpto;
	private double price;
	public String getIsAvailable() {
		return isAvailable;
	}


	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Resource getResource() {
		return resource;
	}


	public void setResource(Resource resource) {
		this.resource = resource;
	}
	@ManyToOne
	@JoinColumn(name="resource_id", referencedColumnName = "resource_id")
	private Resource resource;
	
	@Override
	public String toString() {
		return "Offer [offerId=" + offerId + ", isAvailable=" + isAvailable + ", availableUpto=" + availableUpto
				+ "]";
	}
	
	
	public Offer(int offerId, String isAvailable, LocalDate availableUpto, List<Proposal> proposals) {
		super();
		this.offerId = offerId;
		this.isAvailable = isAvailable;
		this.availableUpto = availableUpto;
		
	}
	public Offer() {
		// TODO Auto-generated constructor stub
	}
	
	public int getOfferId() {
		return offerId;
	}
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
	
	
	public LocalDate getAvailableUpto() {
		return availableUpto;
	}
	public void setAvailableUpto(LocalDate availableUpto) {
		this.availableUpto = availableUpto;
	}
	
	
}
