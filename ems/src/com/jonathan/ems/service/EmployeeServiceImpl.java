package com.jonathan.ems.service;
import java.util.List;

import com.jonathan.ems.model.Employee;

import com.jonathan.ems.repository.EmployeeRepository;
import com.jonathan.ems.repository.HibernateEmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeRepository employeeRepository; //= new HibernateEmployeeRepositoryImpl();
	
	public EmployeeServiceImpl() {
		System.out.println("Constructor fired");
	}

	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		System.out.println("args Constructor fired");
		this.employeeRepository = employeeRepository;
	}


	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}


	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("setter fired");
		this.employeeRepository = employeeRepository;
	}


	/* (non-Javadoc)
	 * @see com.jonathan.ems.service.EmployeeService#getAllEmployees()
	 */
	@Override
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}
}
