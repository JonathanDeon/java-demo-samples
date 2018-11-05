package com.jonathan.ems.repository;

import java.util.List;

import com.jonathan.ems.model.Employee;

public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}