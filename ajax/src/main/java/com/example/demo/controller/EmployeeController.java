package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
public class EmployeeController {
	
	@GetMapping(path ="/employees/{empid}", produces = "application/json")
	Employee getEmployee(@PathVariable("empid") int empid)
	{
		Employee emp = new Employee(empid, "Dinesh", "dk@gm.xom", "988772"+empid);
		return emp;
	}

}
