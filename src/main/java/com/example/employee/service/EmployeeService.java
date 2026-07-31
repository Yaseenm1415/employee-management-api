package com.example.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employee.entity.Employee;
import com.example.employee.repositories.EmployeeRepo;

@Service
public class EmployeeService {
	EmployeeRepo employeeRepo;

	public EmployeeService(EmployeeRepo employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}

	public Employee addEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	public Employee getEmployeeById(int id) {
		return employeeRepo.findById(id).orElse(null);
	}

	public void deleteEmployeeById(Employee employee) {
		employeeRepo.delete(employee);
	}

}
