package com.project.professor.allocation.clovis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.professor.allocation.clovis.entity.Department;
import com.project.professor.allocation.clovis.repository.DepartmentRepository;

@Service
public class DepartmentService {

	private final DepartmentRepository departmentRepository;

	public DepartmentService(DepartmentRepository departmentRepository) {
		super();
		this.departmentRepository = departmentRepository;
	}

	public Department findById(Long id) {

		Department department = departmentRepository.findById(id).orElse(null);
		return department;
	}

	public List<Department> findAll() {

		List<Department> deptoList = departmentRepository.findAll();
		return deptoList;
	}

	public Department create(Department department) {
		department.setId(null);
		return departmentRepository.save(department);
	}

	public Department update(Department department) {
		Long id = department.getId();
		if (id != null && departmentRepository.existsById(id)) {
			department.setId(id);
			return departmentRepository.save(department);
		} else
			return null;

	}

	public void deleteById(Long id) {
		if (departmentRepository.existsById(id))
			departmentRepository.deleteById(id);
	}

	public void deleteAll() {
		departmentRepository.deleteAllInBatch();
	}
}
