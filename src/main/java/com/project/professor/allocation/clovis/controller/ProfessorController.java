package com.project.professor.allocation.clovis.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.professor.allocation.clovis.entity.Department;
import com.project.professor.allocation.clovis.entity.Professor;
import com.project.professor.allocation.clovis.service.ProfessorService;

@RestController
@RequestMapping(path = "/professors")
public class ProfessorController {
	private final ProfessorService professorService;

	public ProfessorController(ProfessorService professorService) {
		super();
		this.professorService = professorService;
	}
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Professor>> findAll(){
		List<Professor> professors = professorService.findAll();
		return new ResponseEntity<List<Professor>>(professors, HttpStatus.OK);
	}


}
