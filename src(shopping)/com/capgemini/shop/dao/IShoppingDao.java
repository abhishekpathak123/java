/**
 * File name	: IShoppingDao.java
 * Author		: Lavanya Muthukutty Nadar
 * Date			: 12/10/2017
 * Description	: Interface with methods to implement
 *
 */
package com.capgemini.shop.dao;

import java.util.List;

import com.capgemini.shop.beans.ShoppingBean;
import com.capgemini.shop.exception.ShopException;

/**
 * @author CAPG
 *
 */
public interface IShoppingDao {
	
	public List<ShoppingBean> getProductList() throws ShopException;
	public ShoppingBean getProduct(int id) throws ShopException;
	public ShoppingBean removeProduct(ShoppingBean product, int id) throws ShopException;

}
