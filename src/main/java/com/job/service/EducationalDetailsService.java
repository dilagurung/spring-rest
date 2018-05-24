package com.job.service;

import java.util.List;

import com.cy.entity.EducationalDetails;


public interface EducationalDetailsService {
	public  EducationalDetails findById(Long id);
	public List< EducationalDetails> findAll();
	public Boolean save( EducationalDetails  educationaldetails);
	public Boolean update( EducationalDetails  educationaldetails);
	public Boolean delete(Long id);


}
