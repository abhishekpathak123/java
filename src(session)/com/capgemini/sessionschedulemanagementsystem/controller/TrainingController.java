/**
 * 
 */
package com.capgemini.sessionschedulemanagementsystem.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.sessionschedulemanagementsystem.service.ITrainingService;

/**
 * @author Mayur Dongare
 *
 */

@Controller
public class TrainingController {

	@Autowired
	private ITrainingService trainingService;

	/*******************************************************************************************************
	 - Function Name	:	showHomePage
	 - Input Parameters	:	Model model
	 - Return Type		:	String
	 - Author			:	Mayur Dongare
	 - Creation Date	:	12/10/2017
	 - Description		:	This method is used to retrieving all scheduled sessions from database
	 						by calling retrieveAllScheduledSession method of TrainingService class
	 						and display the homepage (ScheduledSessions.jsp).
	 ********************************************************************************************************/
	
	@RequestMapping("/showHomePage")
	public String showHomePage(Model model) {
		model.addAttribute("scheduledSessionList",
				trainingService.retrieveAllScheduledSession());
		return "ScheduledSessions";
	}

	/*******************************************************************************************************
	 - Function Name	:	showUpdatePage
	 - Input Parameters	:	RequestParam("name") String name,
							RequestParam("duration") String duration,
							RequestParam("faculty") String faculty,
							RequestParam("role") String roleModel model 
	 - Return Type		:	String
	 - Author			:	Mayur Dongare
	 - Creation Date	:	12/10/2017
	 - Description		:	This method is used to update scheduled sessions
	 						and display the page(UpdateSession.jsp).
	 ********************************************************************************************************/
	
	@RequestMapping("/showUpdate")
	public String showUpdatePage(@RequestParam("name") String name,
			@RequestParam("duration") String duration,
			@RequestParam("faculty") String faculty,
			@RequestParam("role") String role, Model model) {

		model.addAttribute("name", name);
		model.addAttribute("duration", duration);
		model.addAttribute("faculty", faculty);
		model.addAttribute("role", role);

		ArrayList<String> roleList = new ArrayList<>();

		if (role.equalsIgnoreCase("ILT")) {
			roleList.add("VC");
			roleList.add("WBT");
		} else if (role.equalsIgnoreCase("VC")) {
			roleList.add("ILT");
			roleList.add("WBT");
		} else if (role.equalsIgnoreCase("WBT")) {
			roleList.add("ILT");
			roleList.add("VC");
		}
		/*
		 * NOTE: IN GIVEN DATABASE SCHEMA, SECOND INSERT STATEMENT THE mode1 IS
		 * ASSISGNED AS 'ITL'.THEREFORE THIS EXTRACT ROLE OTHER THAN ROLES GIVEN
		 * IN VALIDATION.
		 */
		else if (role.equalsIgnoreCase("ITL")) {
			roleList.add("ILT");
			roleList.add("VC");
			roleList.add("WBT");
		}
		model.addAttribute("roleList", roleList);

		return "UpdateSession";
	}
}
