package com.cg.employee.service;

import java.util.List;

import com.cg.employee.bean.Employee;

public interface IEmployeeService {
	public Employee addEmployee(Employee emp);
	public Employee getEmployeeDetails(int empId);
	public List<Employee> getAllEmployeeDetails();
	public int updateEmployee(int id,Employee emp);



}
