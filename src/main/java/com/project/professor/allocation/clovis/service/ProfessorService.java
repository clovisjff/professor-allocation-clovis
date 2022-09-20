package com.project.professor.allocation.clovis.service;

import org.springframework.stereotype.Service;

import com.project.professor.allocation.clovis.repository.ProfessorRepository;

@Service
public class ProfessorService {

	private final ProfessorRepository professorRepository;

	public ProfessorService(ProfessorRepository professorRepository) {
		super();
		this.professorRepository = professorRepository;
	}

}
