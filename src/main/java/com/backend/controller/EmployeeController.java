package com.backend.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.Exception.*;
import com.backend.model.*;
import com.backend.repository.*;
import com.backend.service.EmployeeService;


@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	// get all employees
	@GetMapping("/employee")
	public List<Employee> getAllEmployees() throws Exception{
		return service.getAllEmployees();
				
	}		
	}