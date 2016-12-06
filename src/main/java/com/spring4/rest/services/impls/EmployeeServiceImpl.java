package com.spring4.rest.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring4.rest.controllers.beans.Employee;
import com.spring4.rest.daos.EmployeeDao;
import com.spring4.rest.services.EmployeeService;

@Service(value= "employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public Employee createEmployee(Employee employee) {
		Employee dbEmployee = null;
		try {
			dbEmployee =  employeeDao.createEmployee(employee);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return dbEmployee;
	}

	public Employee updateEmployee(Employee employee) {
		
		Employee dbEmployee = null;
		
		try {
			
			dbEmployee = employeeDao.updateEmployee(employee);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return dbEmployee;
	}

	public Integer deleteEmployee(Integer employeeId) {
		
		Integer dbEmployeeId = null;
		
		try {
			
			dbEmployeeId = employeeDao.deleteEmployee(employeeId);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return dbEmployeeId;
	}

	public Employee getEmployeeById(Integer employeeId) {
		
		Employee dbEmployee = null;
		
		try {
			dbEmployee =  employeeDao.getEmployeeById(employeeId);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return dbEmployee;
	}

}
