package com.cg.employee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.employee.bean.Employee;
@Repository
@Transactional
public class EmployeeDaoImpl implements IEmployeeDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeDetails(int empId) {
		return entityManager.find(Employee.class, empId);
	
	}

	@Override
	public List<Employee> getAllEmployeeDetails() {
		TypedQuery<Employee> query = entityManager.createQuery("SELECT e FROM Employee e", Employee.class);
		return query.getResultList();	}

	@Override
	public int updateEmployee(int id, Employee emp) {
		Query query=entityManager.createQuery("UPDATE Employee e SET e.salary=:eSal WHERE e.empId="+id);
		query.setParameter("eSal", emp.getSalary());
			int result=query.executeUpdate();
		return result;
	}

}
