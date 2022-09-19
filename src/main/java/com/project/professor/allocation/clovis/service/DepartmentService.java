package com.project.professor.allocation.clovis.service;

import org.springframework.stereotype.Service;

import com.project.professor.allocation.clovis.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	private DepartmentRepository departmentRepository;
	

	public DepartmentService(DepartmentRepository departmentRepository) {
		super();
		this.departmentRepository = departmentRepository;
	}
	
	
	

}
