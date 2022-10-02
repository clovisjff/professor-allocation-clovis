package com.project.professor.allocation.clovis.controller;

import org.springframework.web.bind.annotation.RestController;

import com.project.professor.allocation.clovis.service.CourseService;

@RestController
public class CourseController {
	private final CourseService courseService;

	public CourseController(CourseService courseService) {
		super();
		this.courseService = courseService;
	}
	

}
