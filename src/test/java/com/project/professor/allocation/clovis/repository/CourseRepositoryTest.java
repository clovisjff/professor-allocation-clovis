package com.project.professor.allocation.clovis.repository;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;

import com.project.professor.allocation.clovis.entity.Course;


@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
@TestPropertySource(locations = "classpath:application.properties")

public class CourseRepositoryTest {
	
	@Autowired
	CourseRepository courseRepository;
	
	@Test
	public void findAll() {
		
		List<Course> courseList = courseRepository.findAll();
		System.out.println(courseList);
		
	}
	
	@Test
	public void findById() {
		Optional<Course> courseListById = courseRepository.findById(6L);
		System.out.println(courseListById.orElse(null));
		
	}

}
