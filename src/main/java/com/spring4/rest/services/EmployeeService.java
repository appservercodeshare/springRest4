package com.spring4.rest.services;

import com.spring4.rest.controllers.beans.Employee;

public interface EmployeeService {

	/**
	 * CURD APIS
	 */
	public Employee createEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public Integer deleteEmployee(Integer employeeId);
	
	/**
	 * Query APIS
	 */
	public Employee getEmployeeById(Integer employeeId);
}
