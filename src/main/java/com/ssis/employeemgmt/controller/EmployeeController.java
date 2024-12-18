package com.ssis.employeemgmt.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssis.employeemgmt.models.Employee;
import com.ssis.employeemgmt.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository empRepo;

	@PostMapping("/employees")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
		empRepo.save(employee);
		return ResponseEntity.ok(employee);
	}
	
	@GetMapping("/employees/{eid}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("eid") Integer id) {
        Employee employee = empRepo.findById(id).orElse(null);
        
        return ResponseEntity.of(Optional.ofNullable(employee));
    }
	

}
