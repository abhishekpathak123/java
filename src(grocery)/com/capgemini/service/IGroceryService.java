package com.capgemini.service;

import java.util.List;

import com.capgemini.bean.Grocery;

public interface IGroceryService {

	List<String> getCatList();

	int addGroceryItem(Grocery groc);

}
