package com.project.professor.allocation.clovis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.professor.allocation.clovis.entity.Professor;
import com.project.professor.allocation.clovis.entity.Professor;
import com.project.professor.allocation.clovis.repository.ProfessorRepository;

@Service
public class ProfessorService {

	private final ProfessorRepository professorRepository;

	public ProfessorService(ProfessorRepository professorRepository) {
		super();
		this.professorRepository = professorRepository;
	}

	public List<Professor> findByDepartmentId(Long departmentId) {

		List<Professor> professorDepto = professorRepository.findByDepartmentId(departmentId);
		return professorDepto;
	}

	public Professor findById(Long id) {
		Professor prof = professorRepository.findById(id).orElse(null);
		return prof;

	}
	
		
	public List<Professor> findAll() {

		List<Professor> profList = professorRepository.findAll();
		return profList;
	}

	public Professor create(Professor professor) {
		professor.setId(null);
		return professorRepository.save(professor);
	}

	public Professor update(Professor professor) {
		Long id = professor.getId();
		if (id != null && professorRepository.existsById(id)) {
			professor.setId(id);
			return professorRepository.save(professor);
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
