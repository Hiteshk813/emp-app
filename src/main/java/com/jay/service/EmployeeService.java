package com.jay.service;

import com.jay.entity.Employee;

public class EmployeeService {

	Employee employee;

	public EmployeeService() {
		super();
		//employee = new Employee(101,"Employee-1","D-10111",20000,true);
	}
	
	

	public EmployeeService(Employee employee) {
		super();
		this.employee = employee;
	}



	@Override
	public String toString() {
		return "EmployeeService [employee=" + employee + "]";
	}
	
	
}
