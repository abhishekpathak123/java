/**
 * File Name 	: SkyServiceImpl.java
 * Modified Date: 12-OCT-2017
 * Description 	: Implementaion class to SkyService Interface
 */
package com.capgemini.skystarcableservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.skystarcableservice.beans.Customer;
import com.capgemini.skystarcableservice.dao.SkyDAO;

/**
 * @author K S R S Kumar
 *
 */
@Service
public class SkyServiceImpl implements SkyService {

	@Autowired
	private SkyDAO skyDAO;

	public SkyDAO getSkyDAO() {
		return skyDAO;
	}

	public void setSkyDAO(SkyDAO skyDAO) {
		this.skyDAO = skyDAO;
	}



	@Override
	public List<Customer> retrieveAllCustomers() {
		// TODO Auto-generated method stub
		return skyDAO.retrieveAllCustomers();
	}

	@Override
	public Customer getCustDetails(String custId) {
		// TODO Auto-generated method stub
		return skyDAO.getCustDetails(custId);
	}

}
