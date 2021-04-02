package com.cg.ima.dto;

import java.time.LocalDate;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class OfferDto {
	
	//@Size(min=3,message="offer ID should be minimum 3 numbers")
	private int offerId;
	private String isAvailable;
	//private LocalDate availableUpto;
	private double price;
	public int getOfferId() {
		return offerId;
	}
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
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
	
public OfferDto() {
		
	}
}
