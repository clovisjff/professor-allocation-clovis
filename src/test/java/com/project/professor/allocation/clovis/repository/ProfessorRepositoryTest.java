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


import com.project.professor.allocation.clovis.entity.Professor;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
@TestPropertySource(locations = "classpath:application.properties")


public class ProfessorRepositoryTest {
	
	@Autowired
	ProfessorRepository professorRepository;
	
	
	@Test
	public void findByDepartmentId() {
		
		List<Professor> professors = professorRepository.findByDepartmentId(1L);
		System.out.println(professors);
	}
	
	@Test
	public void findAll() {
		
		List<Professor> profList = professorRepository.findAll();
		System.out.println(profList);
		
	}
	
	@Test
	public void findById() {
		Optional<Professor> profListById = professorRepository.findById(1L);
		System.out.println(profListById.orElse(null));
		
	}

}
