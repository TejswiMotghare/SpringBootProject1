package com.softronix.dao;

import org.springframework.data.repository.CrudRepository;

import com.softronix.entity.Employee;

public interface EmployeeDao extends CrudRepository<Employee, String> {
	
	

}
