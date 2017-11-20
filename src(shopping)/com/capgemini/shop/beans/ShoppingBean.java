/**
 * File name	: ShoppingBean.java
 * Author		: Lavanya Muthukutty Nadar
 * Date			: 12/10/2017
 * Description	: Declaration of instance variables 
 *
 */


/**
 * 
 */
package com.capgemini.shop.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Product")
public class ShoppingBean {
	
	@Id
	@Column(name="product_id")
	private int productId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="product_price")
	private int productPrice;
	
	@Column(name="product_quantity")
	private int productQuantity;
	
	@Column(name="description")
	private String description;
	
	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}
	
	
	
	//non parametrized constructor
	
	public ShoppingBean() {
		super();
		// TODO Auto-generated constructor stub
	}




	//Paramaterized Constructor
	public ShoppingBean(int productId, String productName, int productPrice,
			int productQuantity, String description) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.description = description;
	}



	//getters and setters

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the productPrice
	 */
	public int getProductPrice() {
		return productPrice;
	}
	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	/**
	 * @return the productQuantity
	 */
	public int getProductQuantity() {
		return productQuantity;
	}
	/**
	 * @param productQuantity the productQuantity to set
	 */
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ShoppingBean [productId=" + productId + ", productName="
				+ productName + ", productPrice=" + productPrice
				+ ", productQuantity=" + productQuantity + ", description="
				+ description + "]";
	}
	
	
	
}
