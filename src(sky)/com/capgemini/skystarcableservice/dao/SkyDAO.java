/**
 * File Name 	: SkyDAO.java
 * Modified Date: 12-OCT-2017
 * Description 	: DAO Interface
 */
package com.capgemini.skystarcableservice.dao;

import java.util.List;

import com.capgemini.skystarcableservice.beans.Customer;

/**
 * @author K S R S Kumar
 *
 */
public interface SkyDAO {

	List<Customer> retrieveAllCustomers();

	Customer getCustDetails(String custId);

}
