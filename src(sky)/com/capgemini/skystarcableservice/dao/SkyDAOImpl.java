/**
 * File Name 	: SkyDAOImpl.java
 * Modified Date: 12-OCT-2017
 * Description 	: Implementaion class to SkyDAO Interface
 */
package com.capgemini.skystarcableservice.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.skystarcableservice.beans.Customer;

/**
 * @author K S R S Kumar
 *
 */
@Repository
@Transactional
public class SkyDAOImpl implements SkyDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Customer> retrieveAllCustomers() {
		TypedQuery<Customer> typedQuery = entityManager.createQuery(
				"SELECT customer FROM Customer customer", Customer.class);
		return typedQuery.getResultList();
	}

	@Override
	public Customer getCustDetails(String custId) {
		// TODO Auto-generated method stub
		Customer customer=entityManager.find(Customer.class, custId);
		return customer;
	}

}
