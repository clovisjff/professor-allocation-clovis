package com.project.professor.allocation.clovis.controller;

import org.springframework.web.bind.annotation.RestController;

import com.project.professor.allocation.clovis.service.ProfessorService;

@RestController
public class ProfessorController {
	private final ProfessorService professorService;

	public ProfessorController(ProfessorService professorService) {
		super();
		this.professorService = professorService;
	}
	

}
