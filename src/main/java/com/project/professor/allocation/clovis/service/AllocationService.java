package com.project.professor.allocation.clovis.service;

import org.springframework.stereotype.Service;

import com.project.professor.allocation.clovis.repository.AllocationRepository;

@Service
public class AllocationService {

	private final AllocationRepository allocationRepository;

	public AllocationService(AllocationRepository allocationRepository) {
		super();
		this.allocationRepository = allocationRepository;
	}

}
