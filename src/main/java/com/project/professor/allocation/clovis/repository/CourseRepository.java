package com.project.professor.allocation.clovis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.professor.allocation.clovis.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository <Course, Long> {
	
	List<Course> findByNameContaining(String name);

}
