package com.project.professor.allocation.clovis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.professor.allocation.clovis.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

	List<Department> findByNameContaining(String name);
	

}
