package com.project.professor.allocation.clovis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.professor.allocation.clovis.entity.Department;
import com.project.professor.allocation.clovis.entity.Professor;
import com.project.professor.allocation.clovis.entity.Professor;
import com.project.professor.allocation.clovis.repository.ProfessorRepository;

@Service
public class ProfessorService {

	private final ProfessorRepository professorRepository;
	private final DepartmentService departmentService;

	public ProfessorService(ProfessorRepository professorRepository, DepartmentService departmentService) {
		super();
		this.professorRepository = professorRepository;
		this.departmentService = departmentService;
	}

	public List<Professor> findByDepartmentId(Long id) {
		List<Professor> professors = professorRepository.findByDepartmentId(id);
		return professors;
	}

	public Professor findByCpf(String cpf) {
		Professor searched = professorRepository.findByCpf(cpf);
		return searched;
	}

	public List<Professor> findByNameContaining(String name) {
		List<Professor> professors = professorRepository.findByNameContaining(name);
		return professors;
	}

	public Professor findById(Long id) {
		Professor professor = professorRepository.findById(id).orElse(null);
		return professor;
	}

	public List<Professor> findAll() {
		List<Professor> professors = professorRepository.findAll();
		return professors;
	}

	private Professor saveInternal(Professor professor) {
		Department department = departmentService.findById(professor.getDepartmentId());

		Professor professorSaved = professorRepository.save(professor);
		professorSaved.setDepartment(department);

		return professorSaved;
	}

	public Professor create(Professor professor) {
		professor.setId(null);
		
		Department department = departmentService.findById(professor.getDepartmentId());
				
		professor = professorRepository.save(professor);
		professor.setDepartment(department);
		
		
		return professor;
	}

	public Professor update(Professor professor) {
		Long id = professor.getId();
		if (id != null && professorRepository.existsById(id)) {
			return saveInternal(professor);
		} else
			return null;
	}

	public void deleteById(Long id) {
		if (professorRepository.existsById(id))
			professorRepository.deleteById(id);
	}

	public void deleteAll() {
		professorRepository.deleteAllInBatch();
	}
}
