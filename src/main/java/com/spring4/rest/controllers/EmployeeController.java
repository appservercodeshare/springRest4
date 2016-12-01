package com.spring4.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring4.rest.controllers.beans.Employee;
import com.spring4.rest.services.EmployeeService;

import static com.spring4.rest.utils.Utils.isNullOrEmpty;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getEmployeeById")
	@SuppressWarnings("rawtypes")
	public ResponseEntity getEmployeeById(@PathVariable("employeeId") Integer employeeId) {
		
		ResponseEntity respEntity = null;
		
		Employee dbEmployee = employeeService.getEmployeeById(employeeId);
		
		if(isNullOrEmpty(dbEmployee)) {
			respEntity = new ResponseEntity<Employee>(dbEmployee, HttpStatus.FOUND);
		} else {
			respEntity = new ResponseEntity<String>("No Employee found for ID", HttpStatus.NOT_FOUND); 
		}
		
		return respEntity;
	}
	
	@PostMapping(value = "/createEmployee")
	@SuppressWarnings("rawtypes")
	public ResponseEntity createEmployee(@RequestBody Employee employee) {
		
		
		ResponseEntity respEntity = null;
		
		Employee dbEmployee = employeeService.createEmployee(employee);
		
		if(isNullOrEmpty(dbEmployee)) {
			respEntity = new ResponseEntity<Employee>(dbEmployee, HttpStatus.CREATED);
		} else {
			respEntity = new ResponseEntity<String>("Employee is not created", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return respEntity;
	}
	
	@PutMapping(value = "/updateEmployee")
	@SuppressWarnings("rawtypes")
	public ResponseEntity updateEmployee(@RequestBody Employee employee) {
		
		ResponseEntity respEntity = null;
		
		Employee dbEmployee = employeeService.updateEmployee(employee);
		
		if(isNullOrEmpty(dbEmployee)) {
			respEntity = new ResponseEntity<Employee>(dbEmployee, HttpStatus.FOUND);
		} else {
			respEntity = new ResponseEntity<String>("Employee is not FOUND", HttpStatus.NOT_FOUND);
		}
		
		return respEntity;
	}
	
	@DeleteMapping(value = "/deleteEmployee")
	public ResponseEntity<Void> deleteEmployee(Integer employeeId) {
		ResponseEntity<Void> respEntity = null;
		
		Integer dbEmployeeId = employeeService.deleteEmployee(employeeId);
		
		if(isNullOrEmpty(dbEmployeeId)) {
			respEntity = new ResponseEntity<Void>(HttpStatus.NOT_FOUND); 
		} else {
			respEntity = new ResponseEntity<Void>(HttpStatus.FOUND);
		}
		
		return respEntity;
	}
	
}
