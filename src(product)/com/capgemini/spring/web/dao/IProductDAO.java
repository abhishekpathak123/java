package com.capgemini.spring.web.dao;

import java.util.List;

import com.capgemini.spring.web.entities.Product;
import com.capgemini.spring.web.exception.ProductException;

public interface IProductDAO 
{
	public int addProductDetails(Product product) throws ProductException;
	
	public Product getProduct(int id ) throws ProductException;
	
	public void updateProduct( Product product ) throws ProductException;
	
	public Product removeProduct( Product product ) throws ProductException;
	
	public List<Product> getAllProducts() throws ProductException;
}
