package com.spring4.rest.services.impls;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring4.rest.controllers.beans.Employee;
import com.spring4.rest.daos.EmployeeDao;
import com.spring4.rest.services.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public Employee createEmployee(Employee employee) {
		try {
			return employeeDao.createEmployee(employee);
		} catch(Exception e) {
			return null;
		}
	}

	public Employee updateEmployee(Employee employee) {
		try {
			return employeeDao.updateEmployee(employee);
		} catch(Exception e) {
			return null;
		}
	}

	public Integer deleteEmployee(Integer employeeId) {
		try {
			return employeeDao.deleteEmployee(employeeId);
		} catch(Exception e) {
			return null;
		}
	}

	public Employee getEmployeeById(Integer employeeId) {
		return employeeDao.getEmployeeById(employeeId);
	}

}
