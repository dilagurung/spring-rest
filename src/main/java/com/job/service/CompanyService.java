package com.job.service;

import java.util.List;

import com.cy.entity.Company;

public interface CompanyService {
	public Company findById(Long id);
	public List<Company> findAll();
	public Boolean save(Company company);
	public Boolean update(Company company);
	public Boolean delete(Long id);
	
		
	

}
