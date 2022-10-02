package com.project.professor.allocation.clovis.controller;

import org.springframework.web.bind.annotation.RestController;

import com.project.professor.allocation.clovis.service.AllocationService;

@RestController
public class AllocationController {
	private final AllocationService allocationService;

	public AllocationController(AllocationService allocationService) {
		super();
		this.allocationService = allocationService;
	}
	

}
