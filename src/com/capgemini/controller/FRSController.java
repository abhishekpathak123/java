package com.capgemini.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.bean.FRSBean;
import com.capgemini.service.IFRSService;






@Controller
public class FRSController {


	@Autowired
	
	IFRSService frsservice;
	
			
	public IFRSService getFrsservice() {
		return frsservice;
	}

	public void setFrsservice(IFRSService frsservice) {
		this.frsservice = frsservice;
	}

	public ArrayList<String> getBhklist() {
		return bhklist;
	}

	public void setBhklist(ArrayList<String> bhklist) {
		this.bhklist = bhklist;
	}

	ArrayList<String> bhklist;
	
	@RequestMapping("/showHomePage")
	public String showHomePage(Model model)
	{
		
		bhklist= new ArrayList<String>();
		
		bhklist.add("1-bhk");
		bhklist.add("2-bhk");
		bhklist.add("3-bhk");
		
		model.addAttribute("bhklist",bhklist);
		model.addAttribute("frsbean",new FRSBean());
		
		
		
		return "AddFlatPageForm";
	}
	
	
	@RequestMapping("/addFlat")
	public ModelAndView addQuestion(@ModelAttribute("frsbean") @Valid FRSBean frsbean,BindingResult bindingresult) {

		
		ModelAndView mv = null;
		
		if (!bindingresult.hasErrors()) 
		{
			frsbean=frsservice.addFlat(frsbean);
			mv = new ModelAndView("Success");
			mv.addObject("flatId", frsbean.getFlatId());
			
		} else {
			mv = new ModelAndView("AddFlatPageForm", "frsbean",frsbean);
		}

		return mv;

	}
	
	/*
	@RequestMapping("/")
	public String retrieveflat() {
	
		// Create an attribute of type Question
			
				// Add the attribute to the model and return along with
				// the view name
				ModelAndView mv = new ModelAndView("retrieve");
				mv.addObject("frsbean",new FRSBean());
				mv.addObject("isFirst", "true");
	
		return mv;
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
