/**
 * File name	: ShoppingServiceImpl.java
 * Author		: Lavanya Muthukutty Nadar
 * Date			: 12/10/2017
 * Description	: Service methods invoking DAO methods to perform database transactions and implements IShoppingService.java.
 */
package com.capgemini.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.shop.beans.ShoppingBean;
import com.capgemini.shop.dao.IShoppingDao;
import com.capgemini.shop.dao.ShoppingDaoImpl;
import com.capgemini.shop.exception.ShopException;

/**
 * @author CAPG
 *
 */

@Service
public class ShoppingServiceImpl implements IShoppingService {

	@Autowired
	IShoppingDao shopDaoObj;
	



	@Override
	public List<ShoppingBean> getProductList() throws ShopException {
		// TODO Auto-generated method stub
		return shopDaoObj.getProductList();
		
	}




	@Override
	public ShoppingBean getProduct(int id) throws ShopException {
		// TODO Auto-generated method stub
		return shopDaoObj.getProduct(id);
	}




	@Override
	public ShoppingBean removeProduct(ShoppingBean product, int id)
			throws ShopException {
		// TODO Auto-generated method stub
		return shopDaoObj.removeProduct(product, id);
	}


	

}
