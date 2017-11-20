package com.capgemini.dao;

import java.util.List;

import com.capgemini.bean.Grocery;

public interface IGroceryDao {

	List<String> getCatList();

	int addGroceryItem(Grocery groc);
	
}
