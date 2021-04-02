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
@Table(name="market_resource")
public class Resource { 
	@Id
	@Column(name="resource_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int resId;
	private String title;
	private String description;
	private String category;	// Service/Product/Help
	private LocalDate date;
	private String type;	// Buy/Sell/Rent/Hire
	private double price;
	@ManyToOne
	@JoinColumn(name="emp_id", referencedColumnName = "emp_id")
	private Employee emp;
	@Override
	public String toString() {
		return "Resource [resId=" + resId + ", title=" + title + ", description=" + description + ", category="
				+ category + ", date=" + date + ", type=" + type + ", price=" + price + ", emp=" + emp + "]";
	}
	public Resource(int resId, String title, String description, String category, LocalDate date, String type,
			double price, Employee emp) {
		super();
		this.resId = resId;
		this.title = title;
		this.description = description;
		this.category = category;
		this.date = date;
		this.type = type;
		this.price = price;
		this.emp = emp;
	}
	public Resource() {
		// TODO Auto-generated constructor stub
	}
	public int getResId() {
		return resId;
	}
	public void setResId(int resId) {
		this.resId = resId;
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
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
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
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
}