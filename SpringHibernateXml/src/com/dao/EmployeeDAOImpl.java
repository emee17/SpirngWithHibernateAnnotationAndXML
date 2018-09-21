package com.dao;


import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pojo.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

	
	private HibernateTemplate hibernateTamplate;
	@Autowired
	public void setHibernateTamplate(HibernateTemplate hibernateTamplate) 
	{
		this.hibernateTamplate = hibernateTamplate;
	}
	
	@Override
	public void createEmployee(Employee employee) 
	{
		hibernateTamplate.save(employee);
	}
	
	

	@Override
	public Employee getEmployeeById(int employeeid) 
	{
		Employee employee = hibernateTamplate.get(Employee.class, employeeid);
		return employee;
	}

	@Override
	public void deleteEmployeeById(int employeeid)
	{
		Employee employee = new Employee ();
		employee.setEmployeeid(1);
		hibernateTamplate.delete(employee);
	}

	@Override
	public void updateEmployeeById(String email, int employeeid) 
	{
		Employee employee = hibernateTamplate.get(Employee.class, employeeid);
		employee.setEmail(email);
		hibernateTamplate.update(employee);
	}

	@Override
	public List<Employee> getAllEmployeeDetails() 
	{
		DetachedCriteria criteria = DetachedCriteria.forClass(Employee.class);
		List<Employee> list = (List<Employee>) hibernateTamplate.findByCriteria(criteria);
		return list;
		//return null;
	}

}
