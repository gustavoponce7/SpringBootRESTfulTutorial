package com.example.service;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeService {
	Employee getEmployeeById(long id);
	List<Employee> getAllEmployees();
}
