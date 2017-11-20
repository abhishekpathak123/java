package com.capgemini.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;



@Entity
@Table(name="grocery_mvc")
public class Grocery {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private float price;
	private String category;
	private int quantity;
	private String unit;
	private String description;
	public Grocery() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Grocery [id=" + id + ", name=" + name + ", price=" + price
				+ ", category=" + category + ", quantity=" + quantity
				+ ", unit=" + unit + ", description=" + description + "]";
	}
	public Grocery(int id, String name, float price, String category,
			int quantity, String unit, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
		this.unit = unit;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@NotEmpty(message="This field is required")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Pattern(regexp = "^(?:(?!Select).)*$", message = "Select a category")
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}