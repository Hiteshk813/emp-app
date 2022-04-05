package com.jay.ctrl;

import com.jay.service.EmployeeService;

public class EmployeeController {
private EmployeeService employeeService;

public EmployeeController() {
	super();
	//employeeService = new EmployeeService();
}


public EmployeeController(EmployeeService employeeService) {
	super();
	this.employeeService = employeeService;
}


@Override
public String toString() {
	return "EmployeeController [employeeService=" + employeeService + "]";
}




}
