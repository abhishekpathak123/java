/**
 * File name	: ShoppingController.java
 * Author		: Lavanya Muthukutty Nadar
 * Date			: 12/10/2017
 * Description	: Controls the request from JSP pagaes 
 *
 */
package com.capgemini.shop.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.shop.beans.ShoppingBean;
import com.capgemini.shop.exception.ShopException;
import com.capgemini.shop.service.IShoppingService;
import com.capgemini.shop.service.ShoppingServiceImpl;

/**
 * @author Lavanya Muthukutty
 *
 */

@Controller
public class ShoppingController {
	
	ArrayList<ShoppingBean> slist;
	
	@Autowired
	IShoppingService serviceobj;
	
	//Shows the index page i.e home page
	@RequestMapping("/index")
	public Object ModelAndView() throws ShopException 
	{	
		ModelAndView mv = new ModelAndView();
		try {
			slist = (ArrayList<ShoppingBean>) serviceobj.getProductList();
			if(slist.isEmpty()){
				
				String msg = "there are no products";
				mv.addObject("msg", msg);
			}
			else{
				
				mv.setViewName("index");
				mv.addObject("slist", slist);
			}
		} catch (ShopException e) {
			throw new ShopException("Something went wrong");
		}
		
		return mv;
	}
	
	//Deletes the product on clicking the delete link
	
	@RequestMapping(value="/deleteProduct")
	public Object ModelAndView(@ModelAttribute("product") ShoppingBean product){
		
		ModelAndView mv = new ModelAndView();
		int id = product.getProductId();
		try 
		{
			serviceobj.removeProduct(product, id);
			
			slist = (ArrayList<ShoppingBean>) serviceobj.getProductList();
			if(slist.isEmpty()){
				
				String msg = "there are no products";
				mv.addObject("msg", msg);
			}
			else{
				mv.setViewName("index");
				mv.addObject("slist", slist);
			}
			
			return mv;
		} 
		catch (ShopException e) 
		{
			String msg = "No product found";
			mv.setViewName("index");
			mv.addObject("msg", msg);
			return mv;
		}
		
	}
	

}
