/**
 * File Name 	: SkyController.java
 * Modified Date: 12-OCT-2017
 * Description 	: controller from where actions happen
 */
package com.capgemini.skystarcableservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.skystarcableservice.beans.Customer;
import com.capgemini.skystarcableservice.service.SkyService;

/**
 * @author K S R S Kumar
 *
 */
@Controller
public class SkyController {

	@Autowired
	SkyService skyService;

	public SkyService getSkyService() {
		return skyService;
	}

	public void setSkyService(SkyService skyService) {
		this.skyService = skyService;
	}
	
	/*Redirecting to Index.jsp Page*/
	
	@RequestMapping("/showHomePage")
	public String showHomePage(){
		return "Index";
	}
	
	/*@RequestMapping("/custnum")
	public ModelAndView custnum(@RequestParam("id") String id)
	{
		Customer customer=skyService.getCustDetails(id);
		ModelAndView modelAndView=new ModelAndView("custDetail","customer",customer);
		return modelAndView;
		
	}*/
	
	/*gettingDetails from database according to the custId passed in the url*/
	
	@RequestMapping("/updateCust")
	public String custnum(@RequestParam("custId") String id,Model mv)
	{
		Customer customer=skyService.getCustDetails(id);
		mv.addAttribute("customer", customer);
		return "custDetail";
		
	}
	
	/*retrieving all the Customer Details from database */
	
	@RequestMapping("/showCustomerDetails")
	public ModelAndView showCustomerDetails() {
		List<Customer> customerList = new ArrayList<>();
		customerList = skyService.retrieveAllCustomers();
		//System.out.println("customerList"+customerList);
		ModelAndView modelAndView = new ModelAndView("custReport",
				"customerList", customerList);
		return modelAndView;
	}
	
}
