package com.project.professor.allocation.clovis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.professor.allocation.clovis.entity.Allocation;
import com.project.professor.allocation.clovis.entity.Professor;

@Repository
public interface AllocationRepository extends JpaRepository <Allocation, Long> {
	
	//SELECT * FROM  allocation WHERE course_id = 1?
	List<Allocation> findByCourseId(Long courseId);
	
	//SELECT * FROM  allocation WHERE professor_id = 1?
	List<Allocation> findByProfessorId(Long professorId);
	

}
