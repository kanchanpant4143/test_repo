package com.ssis.employeemgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssis.employeemgmt.models.EmployeeDetails;

public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails, Integer> {

}
