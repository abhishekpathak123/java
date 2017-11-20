package com.capgemini.spring.web.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@NamedQueries( 
		@NamedQuery(
				name="GetAllProducts", 
				query="select product from Product product"
					) 
			)
public class Product 
{
	@Id
	@SequenceGenerator(name="productIdGen", sequenceName="Seq_Pro_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="productIdGen")
	private int id;
	
	@NotEmpty(message="Name cannot be empty")
	@Size(min=3, max=50, message="Product Name should be more then 3 and less than 50 chars long")
	private String name;
	
	@Min(value=1, message="Product Price Cannot be Less than 1.")
	private double price;
	
	@Min(value=1, message="Quantity has to be a positive number")
	private int quantity;
	
	@NotEmpty(message="Category cannot be blank")
	private String category;
	
	@NotEmpty(message="Please let us know if the product can be shipped abroad")
	private String canBeShippedAbroad;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Product(String name, double price, int quantity, String category,
			String canBeShippedAbroad) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
		this.canBeShippedAbroad = canBeShippedAbroad;
	}



	public Product(int id, String name, double price, int quantity,
			String category, String canBeShippedAbroad) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
		this.canBeShippedAbroad = canBeShippedAbroad;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the canBeShippedAbroad
	 */
	public String getCanBeShippedAbroad() {
		return canBeShippedAbroad;
	}

	/**
	 * @param canBeShippedAbroad the canBeShippedAbroad to set
	 */
	public void setCanBeShippedAbroad(String canBeShippedAbroad) {
		this.canBeShippedAbroad = canBeShippedAbroad;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price
				+ ", quantity=" + quantity + ", category=" + category
				+ ", canBeShippedAbroad=" + canBeShippedAbroad + "]";
	}
}
