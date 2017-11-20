package com.cg.employee.dao;

import java.util.List;

import com.cg.employee.bean.Employee;


public interface IEmployeeDao {
	public Employee addEmployee(Employee emp);
	public Employee getEmployeeDetails(int empId);
	public List<Employee> getAllEmployeeDetails();
	public int updateEmployee(int id,Employee emp);


}
