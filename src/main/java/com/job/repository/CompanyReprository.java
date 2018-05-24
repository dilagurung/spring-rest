package com.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cy.entity.Company;

public interface CompanyReprository extends JpaRepository<Company,Long> {
	

}
