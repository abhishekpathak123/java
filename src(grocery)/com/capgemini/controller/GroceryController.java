package com.capgemini.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capgemini.bean.Grocery;
import com.capgemini.service.IGroceryService;

@Controller
public class GroceryController {
	@Autowired
	private IGroceryService grocService;
	private List<String> catList;
	@RequestMapping(value="addGrocery.obj")
	public String redirectToAddGrocery(Model model) {
		System.out.println("inside controller");
		Grocery groc = new Grocery(); //(111,"Ghee",250F);
		model.addAttribute("grocery", groc);
		catList = grocService.getCatList(); //categories of products
		model.addAttribute("clist", catList);
		return "groceryForm";
		
	}
	
	@RequestMapping(value="submitGrocery.obj")
	public String addGrocery(@ModelAttribute(value="grocery") @Valid Grocery groc, 
			BindingResult bResult, Model model){
		System.out.println("adding Grocery");
		if(bResult.hasErrors()){
			catList = grocService.getCatList();
			model.addAttribute("clist", catList);
			return "groceryForm";
		}
		else{
		int rows = grocService.addGroceryItem(groc);
		if(rows==0)
			return "submitFail";
		}
		return "submitSuccess";
	}
}
