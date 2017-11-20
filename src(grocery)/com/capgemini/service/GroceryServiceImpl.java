package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.bean.Grocery;
import com.capgemini.dao.IGroceryDao;

@Transactional
@Service
public class GroceryServiceImpl implements IGroceryService {
	@Autowired
	private IGroceryDao grocDao;
	
	@Override
	public List<String> getCatList() {
		
		return grocDao.getCatList();
	}

	@Override
	public int addGroceryItem(Grocery groc) {
		
		return grocDao.addGroceryItem(groc);
	}

}
