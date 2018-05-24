package com.job.service;

import java.util.List;


import com.cy.entity.ExperienceDetails;

public interface ExperienceDetailsService {
	public  ExperienceDetails findById(Long id);
	public List< ExperienceDetails> findAll();
	public Boolean save( ExperienceDetails  experiencedetails);
	public Boolean update( ExperienceDetails  experiencedetails);
	public Boolean delete(Long id);

}
