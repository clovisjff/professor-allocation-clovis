package com.project.professor.allocation.clovis.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.professor.allocation.clovis.entity.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

	// findByDepartmentId
	// SELECT * FROM professor WHERE department_id =?1
	List<Professor> findByDepartmentId(Long departmentId);

	// SELECT * FROM professor WHERE CPF=?1
	// findByCpf

	Professor findByCpf(String cpf);

	// Optional<Professor> findByCpf(String cpf);

	List<Professor> findByNameContaining(String name);

}
