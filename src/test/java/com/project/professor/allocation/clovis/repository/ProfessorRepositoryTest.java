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
	@Test
    public void save_create() {
        // Arrange
        Professor professor = new Professor();
        professor.setId(null);
        professor.setName("Teste 2");
        professor.setCpf("22222222222");
        professor.setDepartmentId(1L);

        // Act
        professor = professorRepository.save(professor);

        // Print
        System.out.println(professor);
    }

    @Test
    public void save_update() {
        // Arrange
        Professor professor = new Professor();
        professor.setId(1L);
        professor.setName("Teste 2");
        professor.setCpf("22222222222");
        professor.setDepartmentId(1L);

        // Act
        professor = professorRepository.save(professor);

        // Print
        System.out.println(professor);
    }

    @Test
    public void deleteById() {
        // Arrange
        Long id = 1L;

        // Act
        professorRepository.deleteById(id);
    }

    @Test
    public void deleteAll() {
        // Act
        professorRepository.deleteAllInBatch();
    }
}
