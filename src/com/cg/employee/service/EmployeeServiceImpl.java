package com.cg.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.employee.bean.Employee;
import com.cg.employee.dao.IEmployeeDao;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	IEmployeeDao empDao;
	
	public IEmployeeDao getEmpDao() {
		return empDao;
	}

	public void setEmpDao(IEmployeeDao empDao) {
		this.empDao = empDao;
	}

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeDetails(int empId) {
		// TODO Auto-generated method stub
		return empDao.getEmployeeDetails(empId) ;
	}

	@Override
	public List<Employee> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return empDao.getAllEmployeeDetails();
	}

	@Override
	public int updateEmployee(int id, Employee emp) {
		// TODO Auto-generated method stub
		return empDao.updateEmployee(id, emp);
	}

}
