package com.crud.springboot.employeemanagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.springboot.employeemanagement.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	

	public List<Employee> findAllByOrderByLastNameAsc();


	public List<Employee> findByFirstNameContainsAndLastNameContainsAllIgnoreCase(
									String theFirstName, String theLastName);
	
}
