/**
 * File Name 	: Customer.java
 * Modified Date: 12-OCT-2017
 * Description 	: Customer Bean
 */
package com.capgemini.skystarcableservice.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author K S R S Kumar
 *
 */

@Entity
@Table(name = "skycustomers")
public class Customer {

	@Id
	private String custNum;
	
	private String basePack;
	
	private String optionalPack;

	public String getCustNum() {
		return custNum;
	}

	public void setCustNum(String custNum) {
		this.custNum = custNum;
	}

	public String getBasePack() {
		return basePack;
	}

	public void setBasePack(String basePack) {
		this.basePack = basePack;
	}

	public String getOptionalPack() {
		return optionalPack;
	}

	public void setOptionalPack(String optionalPack) {
		this.optionalPack = optionalPack;
	}
	
	
	
	
}
