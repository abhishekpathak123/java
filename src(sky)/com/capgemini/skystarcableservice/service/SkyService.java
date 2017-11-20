/**
 * File Name 	: SkyService.java
 * Modified Date: 12-OCT-2017
 * Description 	: Service Interface
 */
package com.capgemini.skystarcableservice.service;

import java.util.List;

import com.capgemini.skystarcableservice.beans.Customer;

/**
 * @author K S R S Kumar
 *
 */
public interface SkyService {

	List<Customer> retrieveAllCustomers();

	Customer getCustDetails(String custId);

}
