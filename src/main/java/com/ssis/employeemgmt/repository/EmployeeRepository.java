package com.ssis.employeemgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ssis.employeemgmt.models.Employee;

@Repository("empRepo")
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
