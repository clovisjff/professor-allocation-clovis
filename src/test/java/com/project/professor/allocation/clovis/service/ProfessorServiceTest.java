package com.project.professor.allocation.clovis.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.project.professor.allocation.clovis.entity.Professor;

@SpringBootTest
@TestPropertySource(locations = "classpath:application.properties")

public class ProfessorServiceTest {
	@Autowired
	ProfessorService professorService;
	
	@Test
	public void findById() {
		
		System.out.println(professorService.findById(1L));
		
	}
	
	@Test
	public void create() {
		 
        Professor professor = new Professor();
        professor.setId(null);
        professor.setCpf("44444444444");
        professor.setName("Teste 4");
        professor.setDepartmentId(1L);

      
        System.out.println(professorService.create(professor));
		
		
	}
	

}
