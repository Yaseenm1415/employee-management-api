package com.example.employee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.entity.Employee;
import com.example.employee.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/employee/{uid}")
	public Employee getEmployeeById(@PathVariable("uid") int id) {
		return employeeService.getEmployeeById(id);
	}
	
	@DeleteMapping("/employee/{uid}")
	public String deleteEmployeeById(@PathVariable("uid") int id) {
		Employee employee = employeeService.getEmployeeById(id); 
		if(employee != null) {
		employeeService.deleteEmployeeById(employee);
		return "Employee deleted successfully";
		} else {
			return "Employee id " +id+ " is not exist";
		}	
	}
	
	@PutMapping("/employee")
	public Employee updateEmployeeById(@RequestBody Employee employee) {
		Employee exist = employeeService.getEmployeeById(employee.getId());
		if(exist!=null) {
			exist.setName(employee.getName());
			exist.setGender(employee.getGender());
			exist.setSalary(employee.getSalary());
			return employeeService.addEmployee(employee);
		} else {
			return null;
		}
	}
}
