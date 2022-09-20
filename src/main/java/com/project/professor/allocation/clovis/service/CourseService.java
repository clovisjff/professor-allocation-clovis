package com.project.professor.allocation.clovis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.professor.allocation.clovis.entity.Course;
import com.project.professor.allocation.clovis.entity.Professor;
import com.project.professor.allocation.clovis.repository.CourseRepository;

@Service
public class CourseService {

	private final CourseRepository courseRepository;

	public CourseService(CourseRepository courseRepository) {
		super();
		this.courseRepository = courseRepository;
	}
	
	public List<Course> findByNameContaining(String name){
		List<Course> courses = courseRepository.findByNameContaining(name);
		return courses;
	}

	public Course findById(Long id) {
		Course Course = courseRepository.findById(id).orElse(null);
		return Course;
	}

	public List<Course> findAll() {
		List<Course> Courses = courseRepository.findAll();
		return Courses;
	}

	public Course create(Course course) {
		course.setId(null);
		return courseRepository.save(course);
	}

	public Course update(Course Course) {
		Long id = Course.getId();
		if (id!=null && courseRepository.existsById(id))
			return courseRepository.save(Course);
		else
			return null;
	}

	public void deleteById(Long id) {
		if(courseRepository.existsById(id))
			courseRepository.deleteById(id);
	}

	public void deleteAll() {
		courseRepository.deleteAllInBatch();
	}

}
