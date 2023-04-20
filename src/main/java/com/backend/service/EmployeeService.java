package com.backend.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.backend.model.Employee;
import com.backend.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
    EmployeeRepository repository;
	
	public List<Employee> getAllEmployees() throws Exception
    {
        List<Employee> employeeList = repository.findAll();
         System.out.println("EmployeeList "+employeeList.size());
        if(employeeList.size() > 0) {
        	System.out.println("FOUND DATA");
            return employeeList;
        } else {
        	System.out.println("not found");
            return new ArrayList<Employee>();
        }
    }
     
}
