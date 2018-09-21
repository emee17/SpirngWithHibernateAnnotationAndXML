package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDAO;
import com.pojo.Employee;

@Service("employeeservice")
public class EmployeeServiceImpl implements EmployeeService{

	
	private EmployeeDAO employeedao;
	@Autowired
	public void setEmployeedao(EmployeeDAO employeedao) 
	{
		this.employeedao = employeedao;
	}
	
	@Override
	public void addEmployee(Employee employee)
	{
		employeedao.createEmployee(employee);
	}

	@Override
	public Employee fetchEmployeeById(int employeeid) 
	{
		return employeedao.getEmployeeById(employeeid);
	}

	@Override
	public void deleteEmployeeById(int employeeid) 
	{
		employeedao.deleteEmployeeById(employeeid);
	}

	@Override
	public void updateEmployeeById(String email, int employeeid)
	{
		employeedao.updateEmployeeById(email, employeeid);
	}

	@Override
	public List<Employee> getAllEmployeeInfo() 
	{

		return employeedao.getAllEmployeeDetails();
	}

}
