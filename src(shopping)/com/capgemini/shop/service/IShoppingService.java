/**
 * File name	: IShoppingService.java
 * Author		: Lavanya Muthukutty Nadar
 * Date			: 12/10/2017
 * Description	: Interface with methods to be implemented.
 */
package com.capgemini.shop.service;

import java.util.List;

import com.capgemini.shop.beans.ShoppingBean;
import com.capgemini.shop.exception.ShopException;


public interface IShoppingService {

	public List<ShoppingBean> getProductList() throws ShopException;
	public ShoppingBean getProduct(int id) throws ShopException;
	public ShoppingBean removeProduct(ShoppingBean product, int id) throws ShopException;
}
