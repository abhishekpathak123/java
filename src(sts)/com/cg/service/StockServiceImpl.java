package com.cg.service;

import java.text.DecimalFormat;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.OrderMaster;
import com.cg.bean.StockMaster;
import com.cg.dao.StockDAO;
import com.cg.exception.StockTradingExceptions;


@Service("objServ")
@Transactional
public class StockServiceImpl implements StockService{

	@Autowired
	StockDAO objDao;
	
	
	//------------------------ Stock Trading System --------------------------
	/*******************************************************************************************************
	 - Function Name	:	getStockList
	 - Throws		    :  	StockTradingExceptions
	 - Creation Date	:	28/09/2017
	 - Description		:	calls dao method getStockList(d)
	 ********************************************************************************************************/
	
	
	@Override
	public List<StockMaster> getStockList() throws StockTradingExceptions {
		
		return objDao.getStockList();
	}
	
	
	//------------------------ Stock Trading System --------------------------
	/*******************************************************************************************************
	 - Function Name	:	getStockData
	 - Throws		    :  	StockTradingExceptions
	 - Creation Date	:	28/09/2017
	 - Description		:	calls dao method getStockData(d)
	 ********************************************************************************************************/

	@Override
	public StockMaster getStockData(String name) {
		return objDao.getStockData(name);
		
	}
	
	
	//------------------------ Stock Trading System --------------------------
		/*******************************************************************************************************
		 - Function Name	:	calculate
		 - Throws		    :  	StockTradingExceptions
		 - Creation Date	:	28/09/2017
		 - Description		:	calls dao method calculate(d)
		 ********************************************************************************************************/
	
	@Override
	public OrderMaster calculatePrice(int quant,OrderMaster ord,String sel) throws StockTradingExceptions 
	{	
		Double qu=Double.parseDouble(ord.getQuote());
		DecimalFormat df = new DecimalFormat("#.##");
		Double val1=quant*qu;
		val1 = Double.valueOf(df.format(val1));
		
		ord.setOrderAmount(val1);
		if(sel.equals("buy"))
		{
			Double val=0.005*ord.getOrderAmount();
			val = Double.valueOf(df.format(val));
			ord.setCommission(val);
		}
		else
		{	
			Double val=0.01*ord.getOrderAmount();
			val = Double.valueOf(df.format(val));
			ord.setCommission(val);
		}
		objDao.enterData(ord);
		return ord;
	}

}
