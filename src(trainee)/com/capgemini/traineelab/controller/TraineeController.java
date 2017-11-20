/**
 * 
 */
package com.capgemini.traineelab.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.traineelab.beans.Login;
import com.capgemini.traineelab.beans.Trainee;
import com.capgemini.traineelab.service.ITraineeService;

/**
 * @author Mayur Dongare
 *
 */

@Controller
public class TraineeController {

	@Autowired
	private ITraineeService traineeService;

	public ITraineeService getTraineeService() {
		return traineeService;
	}

	public void setTraineeService(ITraineeService traineeService) {
		this.traineeService = traineeService;
	}

	ArrayList<String> domainList;

	@RequestMapping("/showLoginPage")
	public String showLoginPage(Model model) {
		model.addAttribute("login", new Login());
		return "loginpage";
	}

	@RequestMapping("/showHomePage")
	public String showHomePage(@ModelAttribute("login") Login login, Model model) {
		if (login.getUsername().equalsIgnoreCase("admin")
				&& login.getPassword().equalsIgnoreCase("admin")) {
			return "homepage";
		} else {
			return "loginpage";
		}
	}

	@RequestMapping("/showAddTrainee")
	public String showAddTrainee(Model model) {

		domainList = new ArrayList<String>();

		domainList.add("Java");
		domainList.add("C");
		domainList.add("C++");
		domainList.add("DotNet");

		model.addAttribute("domainList", domainList);
		model.addAttribute("trainee", new Trainee());
		return "addTraineeForm";
	}

	@RequestMapping("/addTrainee")
	public ModelAndView addTrainee(
			@ModelAttribute("trainee") @Valid Trainee trainee,
			BindingResult result) {
		ModelAndView modelAndView = null;

		if (!result.hasErrors()) {
			trainee = traineeService.addTrainee(trainee);
			modelAndView = new ModelAndView("successpage");
		} else {
			modelAndView = new ModelAndView("addTraineeForm", "trainee",
					trainee);
			modelAndView.addObject("domainList", domainList);
		}
		return modelAndView;
	}

	@RequestMapping("/showRetrieveTrainee")
	public String showRetrieveTrainee(Model model) {
		model.addAttribute("trainee", new Trainee());
		return "retrieveTrainee";
	}

	@RequestMapping("/retrieveTrainee")
	public ModelAndView retrieveTrainee(
			@ModelAttribute("trainee") Trainee trainee, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView("retrievedTrainee",
				"trainee", traineeService.retrieveTrainee(trainee
						.getTraineeId()));
		return modelAndView;
	}

	@RequestMapping("/retrieveAllTrainees")
	public ModelAndView retrieveAllTrainee() {
		List<Trainee> traineeList = new ArrayList<>();
		traineeList = traineeService.retrieveAllTrainees();
		ModelAndView modelAndView = new ModelAndView("retrievedAllTrainee",
				"traineeList", traineeList);
		return modelAndView;
	}

	@RequestMapping("/showDeleteTrainee")
	public String showDeleteTrainee(Model model) {
		model.addAttribute("trainee", new Trainee());
		return "showDeleteOperation";
	}

	@RequestMapping("/showDeletedTrainee")
	public ModelAndView showDeletedTrainee(
			@ModelAttribute("trainee") Trainee trainee, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView("showDeletedTrainee",
				"trainee", traineeService.retrieveTrainee(trainee
						.getTraineeId()));
		return modelAndView;
	}

	@RequestMapping("/deleteTrainee")
	public ModelAndView deleteTrainee(@ModelAttribute("trainee") Trainee trainee) {
		traineeService.deleteTrainee(trainee);
		return new ModelAndView("successpage");
	}

	@RequestMapping("/showModifyTrainee")
	public String showModifyTrainee(Model model) {
		model.addAttribute("trainee", new Trainee());
		return "showModifyOperation";
	}

	@RequestMapping("/showModifiedTrainee")
	public ModelAndView showModifiedTrainee(
			@ModelAttribute("trainee") Trainee trainee) {
		ModelAndView modelAndView = new ModelAndView("showModifiedTrainee",
				"trainee", traineeService.retrieveTrainee(trainee
						.getTraineeId()));
		return modelAndView;
	}

	@RequestMapping("/modifyTrainee")
	public ModelAndView modifyTrainee(
			@ModelAttribute("trainee") @Valid Trainee trainee,
			BindingResult result) {

		ModelAndView modelAndView = null;

		if (!result.hasErrors()) {
			traineeService.modifyTrainee(trainee);
			return new ModelAndView("successpage");
		} else {
			modelAndView = new ModelAndView("showModifiedTrainee", "trainee",
					trainee);
		}
		return modelAndView;

	}

}
