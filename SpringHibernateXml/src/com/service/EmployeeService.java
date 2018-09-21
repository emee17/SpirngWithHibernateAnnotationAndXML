package com.service;

import java.util.List;

import com.pojo.Employee;

public interface EmployeeService 
{
	public void addEmployee(Employee employee);
	public Employee fetchEmployeeById(int employeeid);
	public void deleteEmployeeById(int employeeid);
	public void updateEmployeeById(String email,int employeeid);
	public List<Employee> getAllEmployeeInfo();
}
