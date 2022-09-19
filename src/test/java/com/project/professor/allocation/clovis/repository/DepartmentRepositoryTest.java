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

import com.project.professor.allocation.clovis.entity.Department;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
@TestPropertySource(locations = "classpath:application.properties")

public class DepartmentRepositoryTest {

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	public void findAll() {
		List<Department> deptoList = departmentRepository.findAll();
		System.out.println(deptoList);
	}

	@Test
	public void findById() {
		Optional<Department> deptoListById = departmentRepository.findById(1L);
		System.out.println(deptoListById.orElse(null));
	}

	@Test
	public void create() {
		Department depto = new Department();
		depto.setName("Departamento de Programação WEB");
		System.out.println(depto);

		Department depto2 = departmentRepository.save(depto);
		System.out.println(depto2);

	}

	@Test
	public void update() {
		Department depto = new Department();
		depto.setName("Departamento de Programação WEB");
		depto.setId(3L);
		System.out.println(depto);

		Department depto2 = departmentRepository.save(depto);
		System.out.println(depto2);

	}

	@Test
	public void deleteById() {
		departmentRepository.deleteById(4l);
	}

	@Test
	public void deleteAll() {
//		deleta a tabela toda
		departmentRepository.deleteAllInBatch();
	}

}
