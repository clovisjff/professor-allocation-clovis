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

import com.project.professor.allocation.clovis.entity.Allocation;



@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
@TestPropertySource(locations = "classpath:application.properties")

public class AllocationRepositoryTest {
	
	@Autowired
	AllocationRepository allocationRepository;
	
	@Test
	public void findAll() {
		
		List<Allocation> allocationList = allocationRepository.findAll();
		System.out.println(allocationList);
		
	}
	
	@Test
	public void findById() {
		Optional<Allocation> allocationListById = allocationRepository.findById(1L);
		System.out.println(allocationListById.orElse(null));
		
	}

//	@Test
//	public void teste01() {
//		List<Allocation> teste01 = allocationRepository.findByProfessorId(2L);
//		System.out.println(teste01);
//	}
//	
}
