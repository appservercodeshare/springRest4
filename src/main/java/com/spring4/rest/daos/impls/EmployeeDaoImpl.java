package com.spring4.rest.daos.impls;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.spring4.rest.controllers.beans.Employee;
import com.spring4.rest.daos.AbstractCurdDao;
import com.spring4.rest.daos.EmployeeDao;

@Repository(value = "employeeDao")
public class EmployeeDaoImpl extends AbstractCurdDao implements EmployeeDao {

	public Employee createEmployee(Employee employee) {
		save(employee);
		return employee;
	}

	public Employee updateEmployee(Employee employee) {
		update(employee);
		return employee;
	}

	public Integer deleteEmployee(Integer employeeId) {
		delete(getEmployeeById(employeeId));
		return employeeId;
	}

	public Employee getEmployeeById(Integer employeeId) {
		
		Session session = getSession();
		Criteria empByIdCriteria = session.createCriteria(Employee.class);
		empByIdCriteria.add(Restrictions.eq("employeeId", employeeId));
		
		@SuppressWarnings("unchecked")
		List<Employee> employeeList =  empByIdCriteria.list();
		
		if(employeeList.isEmpty()) {
			return null;
		} else {
			return employeeList.get(0);
		}
		
	}

}
