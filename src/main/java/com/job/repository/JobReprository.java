package com.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cy.entity.Job;

public interface JobReprository extends JpaRepository<Job,Long> {

}
