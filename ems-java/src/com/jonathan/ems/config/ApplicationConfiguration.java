package com.jonathan.ems.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.jonathan.ems.repository.EmployeeRepository;
import com.jonathan.ems.repository.HibernateEmployeeRepositoryImpl;
import com.jonathan.ems.service.EmployeeService;
import com.jonathan.ems.service.EmployeeServiceImpl;

@Configuration
@ComponentScan("com.jonathan.ems")
@PropertySource("application.properties")
public class ApplicationConfiguration {

	@Bean(name="employeeService")
	//@Scope("prototype")
	public EmployeeService getEmployeeService() {
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		//employeeServiceImpl.setEmployeeRepository(getEmployeeRepository());
		return employeeServiceImpl;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySource() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
//	@Bean(name="employeeRepository")
//	public EmployeeRepository getEmployeeRepository() {
//		return new HibernateEmployeeRepositoryImpl();
//	}
}
