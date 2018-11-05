package com.jonathan.ems.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.jonathan.ems.model.Employee;

@Repository("employeeRepository")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {

	@Value("${name}")
	String name;
	@Value("${city}")
	String town;
	
	@Override
	public List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<>();
		
		Employee emp = new Employee();
		
		emp.setLocation(town);
		emp.setName(name);
		
		employees.add(emp);
		
		return employees;
		
		
	}
}
