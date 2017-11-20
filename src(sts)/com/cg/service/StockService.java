package com.cg.service;

import java.util.List;

import com.cg.bean.OrderMaster;
import com.cg.bean.StockMaster;
import com.cg.exception.StockTradingExceptions;

public interface StockService {
	List<StockMaster> getStockList() throws StockTradingExceptions;
	StockMaster getStockData(String name);
	OrderMaster calculatePrice(int quant, OrderMaster ord, String sel) throws StockTradingExceptions;
}
