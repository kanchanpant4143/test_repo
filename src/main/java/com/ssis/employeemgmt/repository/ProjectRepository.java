package com.ssis.employeemgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssis.employeemgmt.models.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
