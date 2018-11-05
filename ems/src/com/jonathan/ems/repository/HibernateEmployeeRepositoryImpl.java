package com.jonathan.ems.repository;

import java.util.ArrayList;
import java.util.List;

import com.jonathan.ems.model.Employee;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {

	/* (non-Javadoc)
	 * @see com.jonathan.ems.repository.EmployeeRepository#getAllEmployees()
	 */
	@Override
	public List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<>();
		
		Employee emp = new Employee();
		
		emp.setLocation("Kandana");
		emp.setName("Jonathan");
		
		employees.add(emp);
		
		return employees;
		
		
	}
}
