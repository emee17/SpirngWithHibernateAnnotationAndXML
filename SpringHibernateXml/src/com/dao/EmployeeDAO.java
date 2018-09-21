package com.dao;

import java.util.List;

import com.pojo.Employee;

public interface EmployeeDAO 
{
	public void createEmployee(Employee employee);
	public Employee getEmployeeById(int employeeid);
	public void deleteEmployeeById(int employeeid);
	public void updateEmployeeById(String email,int employeeid);
	public List<Employee> getAllEmployeeDetails();
}
