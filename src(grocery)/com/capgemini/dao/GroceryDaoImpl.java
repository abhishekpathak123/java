package com.capgemini.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.bean.Grocery;

@Transactional
@Repository
public class GroceryDaoImpl implements IGroceryDao {

	@Override
	public List<String> getCatList() {
		List<String> cList = new ArrayList<>();
		cList.add("Pulses");
		cList.add("Cereals");
		cList.add("Cooking oil");
		cList.add("Vegetables");
		cList.add("Fruits");
		cList.add("Condiments");
		return cList;
	}

	@PersistenceContext
	EntityManager entManager;
	
	@Override
	public int addGroceryItem(Grocery groc) {
		System.out.println(groc);
		try {
  		   entManager.persist(groc);
  			return 1;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	
}
