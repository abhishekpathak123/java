package com.cg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="order_master")
public class OrderMaster {

	@Id
	@SequenceGenerator(name="seq",sequenceName="stock_seq",initialValue=101,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq")
	@Column(name="order_id")
	private int orderId;
	private String stock;
	private String quote;
	@Column(name="order_amount")
	private double orderAmount;
	private double commission;
	
	
	@Override
	public String toString() {
		return "OrderMaster [orderId=" + orderId + ", stock=" + stock
				+ ", quote=" + quote + ", orderAmount=" + orderAmount
				+ ", commission=" + commission + "]";
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
}
