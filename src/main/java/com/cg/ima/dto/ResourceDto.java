package com.cg.ima.dto;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.checkerframework.checker.units.qual.min;

public class ResourceDto {
	
	@Pattern (regexp="[A-Za-z]{3,20}",message="tittle must contain alphabets")
	private String title;
	@Pattern (regexp="[A-Za-z]{3,20}",message="description must contain alphabets")
	private String description;
	private String category;	// Service/Product/Help
	@Pattern(regexp="buy|sell|rent|hire",message="the options are buy,sell,rent,hire")
	private String type;
	
	// Buy/Sell/Rent/Hire
	@Min(value=1000)
	private double price;
	@Min(value=1)
	private int empId;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public ResourceDto() {

}
}
