package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.bean.OrderMaster;
import com.cg.bean.StockMaster;
import com.cg.exception.StockTradingExceptions;

@Repository("stockDao")
public class StockDAOImpl implements StockDAO{

	@PersistenceContext
	EntityManager entityManager;
	
	List<StockMaster> stocklist=null;
	@Override
	public List<StockMaster> getStockList() throws StockTradingExceptions{
		try
		{
			String qu="from StockMaster";
			TypedQuery<StockMaster> query=entityManager.createQuery(qu,StockMaster.class);
			stocklist=query.getResultList();	
		}
		catch(Exception ex) {
			throw new StockTradingExceptions(ex.getMessage());
		}
		System.out.println(stocklist);
		return stocklist;
	}
	@Override
	public StockMaster getStockData (String name)
	{
		StockMaster sm=entityManager.find(StockMaster.class, name);
		return sm;
	}
	@Override
	public void enterData(OrderMaster ord) throws StockTradingExceptions {
		try {
		entityManager.persist(ord);
		entityManager.flush();
		}catch (Exception e) {
			throw new StockTradingExceptions("Some error in inserting the values into database");
		}
	}
}
