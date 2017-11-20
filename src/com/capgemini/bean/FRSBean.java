package com.capgemini.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="flat")
public class FRSBean {

	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public int flatId;
	
	public String CustName;
	public String bhk;
	public long Amount;
	
	
	
	
	public int getFlatId() {
		return flatId;
	}
	public void setFlatId(int flatId) {
		this.flatId = flatId;
	}
	public String getCustName() {
		return CustName;
	}
	public void setCustName(String custName) {
		CustName = custName;
	}
	public String getBhk() {
		return bhk;
	}
	public void setBhk(String bhk) {
		this.bhk = bhk;
	}
	public long getAmount() {
		return Amount;
	}
	public void setAmount(long amount) {
		Amount = amount;
	}
	
	@Override
	public String toString() {
		return "FRSBean [flatId=" + flatId + ", CustName=" + CustName
				+ ", bhk=" + bhk + ", Amount=" + Amount + "]";
	}
	
	
	
	
	
	
	
}
