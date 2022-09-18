package com.project.professor.allocation.clovis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.professor.allocation.clovis.entity.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository <Professor, Long> {

}
