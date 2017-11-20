/**
 * File name	: ShoppingDaoImpl.java
 * Author		: Lavanya Muthukutty Nadar
 * Date			: 12/10/2017
 * Description	: Logic for database transactions.
 */
package com.capgemini.shop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.shop.beans.ShoppingBean;
import com.capgemini.shop.exception.ShopException;

/**
 * @author CAPG
 *
 */

@Repository
@Transactional
public class ShoppingDaoImpl implements IShoppingDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	

	/**
	 * @return the entityManager
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}



	/**
	 * @param entityManager the entityManager to set
	 */
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}



	/* 
	 * Retrieves data from the database
	 */
	@Override
	public List<ShoppingBean> getProductList() throws ShopException {
		// TODO Auto-generated method stub
		TypedQuery<ShoppingBean> query = 
				entityManager.createQuery("SELECT t FROM ShoppingBean t", 
						ShoppingBean.class);
		return query.getResultList();
	}
	
	/* 
	 * Retrieves data from the database with respect to a particular id
	 */
	
	@Override
	public ShoppingBean getProduct(int id) throws ShopException {
		
		ShoppingBean product = null;
		
		try 
		{
			product = entityManager.find(ShoppingBean.class, id);
			
			if( product == null )
				throw new Exception();
		} 
		catch (Exception e) 
		{
			throw new ShopException("Could not find the product with id " + id);
		}
		
		return product;
	}
	
	/* 
	 * Deletes the data from the database with respect to a particular id
	 */
	
	@Override
	public ShoppingBean removeProduct(ShoppingBean product, int id) throws ShopException {
		
		try 
		{
			
			product= entityManager.find(ShoppingBean.class, id);
			entityManager.remove(product);
			
			entityManager.remove(product);
			entityManager.flush();
		} 
		catch (Exception e) 
		{
			throw new ShopException("Something went wrong while removing the product details. Try again");
		}
		
		return null;
	}

}
