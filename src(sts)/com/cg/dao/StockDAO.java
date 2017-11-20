package com.cg.dao;

import java.util.List;

import com.cg.bean.OrderMaster;
import com.cg.bean.StockMaster;
import com.cg.exception.StockTradingExceptions;

public interface StockDAO {

	List<StockMaster> getStockList() throws StockTradingExceptions;

	StockMaster getStockData(String name);

	void enterData(OrderMaster ord) throws StockTradingExceptions;

}
