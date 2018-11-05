package com.jonathan.ems.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonathan.ems.model.Employee;

import com.jonathan.ems.repository.EmployeeRepository;
import com.jonathan.ems.repository.HibernateEmployeeRepositoryImpl;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository; //= new HibernateEmployeeRepositoryImpl();
	
	//public EmployeeServiceImpl(){}
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}


	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
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
