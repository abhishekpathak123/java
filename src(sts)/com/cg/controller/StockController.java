package com.cg.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.bean.OrderMaster;
import com.cg.bean.Quantity;
import com.cg.bean.StockMaster;
import com.cg.exception.StockTradingExceptions;
import com.cg.service.StockService;

@Controller
public class StockController {
	
	@Autowired
	StockService objServ;
	
	@RequestMapping("/")
	public String first(Model mv)
	{	
		ArrayList<StockMaster> slist;
		try {
			slist = (ArrayList<StockMaster>) objServ.getStockList();
		} catch (StockTradingExceptions e) {
			mv.addAttribute("error", e.getMessage());
			return "error";
		}
		mv.addAttribute("slist", slist);
		return "index";
	}
	
	@RequestMapping("/stockname")
	public String stock(@RequestParam("name") String name,Model mv)
	{
		StockMaster sm=objServ.getStockData(name);
		mv.addAttribute("stock", sm);
		mv.addAttribute("quantity", new Quantity());
		return "order";
		
	}
	@RequestMapping("/order")
	public String order(@ModelAttribute("order") OrderMaster ordm,@ModelAttribute("quantity") @Valid Quantity quan,BindingResult result,Model mv,@RequestParam("sel") String sel)
	{
		if(result.hasErrors())
		{	
			StockMaster stm=objServ.getStockData(ordm.getStock());
			mv.addAttribute("stock", stm);
			mv.addAttribute("quantity", quan);
			return "order";
		}
		OrderMaster odm = null;
		try {
			odm = objServ.calculatePrice(quan.getQuantity(), ordm, sel);
			mv.addAttribute("order",odm);
		} catch (StockTradingExceptions e) {
			mv.addAttribute("error", e.getMessage());
			return "error";
		}
		return "summary";	
	}
	@RequestMapping("/home")
	public String home(Model mv) {
		ArrayList<StockMaster> slist = null;
		try {
			slist = (ArrayList<StockMaster>) objServ.getStockList();
			mv.addAttribute("slist", slist);
		} catch (StockTradingExceptions e) {
			mv.addAttribute("error", e.getMessage());
			return "error";
		}
		return "index";
	}
}
