package com.cg.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.employee.bean.Employee;
import com.cg.employee.service.IEmployeeService;


@Controller
public class EmployeeController {
	
	@Autowired 
	IEmployeeService employeeService;
	
	public IEmployeeService getEmployeeService() {
		return employeeService;
	}
	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	@RequestMapping("/showHomePage")
	public String showHomePage() {
		return "index";
	}
	@RequestMapping("/showViewEmployeeForm")
	public ModelAndView showForm()
	{
		
			// Create an attribute of type Question
			Employee employee = new Employee();
			// Add the attribute to the model and return along with
			// the view name
			ModelAndView mv = new ModelAndView("viewEmployee");
			mv.addObject("employee", employee);
			mv.addObject("isFirst", "true");

		return mv;
	}
	@RequestMapping("/viewEmployee")
	public ModelAndView viewtrainee(
			@ModelAttribute("employee") Employee employee) {

		ModelAndView mv = new ModelAndView();

		Employee eBean = new Employee();
		eBean = employeeService.getEmployeeDetails(employee.getEmpId());

		if (eBean != null) {
			mv.setViewName("viewEmployee");
			mv.addObject("eBean", eBean);
		} else {
			String msg = "Enter a Valid Id!!";
			mv.setViewName("error");
			mv.addObject("msg", msg);
		}

		return mv;
	}
	@RequestMapping("/viewAllEmployees")
	public ModelAndView showViewAllDonations() {

		ModelAndView mv = new ModelAndView();

		List<Employee> list = employeeService.getAllEmployeeDetails();
		System.out.println(list);
		if (list.isEmpty()) {
			String msg = "There are no Employees";
			mv.setViewName("error");
			mv.addObject("msg", msg);
		} else {
			mv.setViewName("ViewAllEmployees");
			// Add the attribute to the model
			mv.addObject("list", list);
		}
		return mv;
	}


	/*@RequestMapping("/showModifyForm")
	public ModelAndView modifyEmployeeForm(@ModelAttribute("employee") Employee employee) {
		// Create an attribute of type Question
		
		// Add the attribute to the model and return along with
		// the view name
		ModelAndView mv = new ModelAndView("update");
		mv.addObject("employee", employee);
		mv.addObject("isFirst", "true");

		return mv;
	}*/
	@RequestMapping("/showModifyEmployeeForm")
	public ModelAndView showModifyForm(@ModelAttribute("employee") Employee employee){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("update");
		Employee eBean=employeeService.getEmployeeDetails(employee.getEmpId());
		mv.addObject("Name",eBean.getEmpName());
		mv.addObject("salary",eBean.getSalary());
		mv.addObject("employee",employee);
		return mv;
	}
	@RequestMapping("/updateEmployee")
	public ModelAndView updateEmployee(
			@ModelAttribute("employee") Employee employee) {
		ModelAndView mv = null;
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		int result = employeeService.updateEmployee(employee.getEmpId(), employee);
		if (result != 0) {
			mv = new ModelAndView("updateSuccess");
		}
		return mv;

	}
}
