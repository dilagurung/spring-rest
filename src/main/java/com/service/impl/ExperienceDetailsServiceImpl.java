package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.entity.ExperienceDetails;
import com.job.repository.ExperienceDetailsReprository;
import com.job.service.ExperienceDetailsService;


@Service
public class ExperienceDetailsServiceImpl implements ExperienceDetailsService{

	@Autowired
	ExperienceDetailsReprository experiencedetailsReprository;
	@Override
	public ExperienceDetails findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExperienceDetails> findAll() {
		// TODO Auto-generated method stub
		return experiencedetailsReprository.findAll();
	}

	@Override
	public Boolean save(ExperienceDetails experiencedetails) {
		// TODO Auto-generated method stub
		experiencedetailsReprository.save(experiencedetails);
		return true;
	}

	@Override
	public Boolean update(ExperienceDetails experiencedetails) {
		// TODO Auto-generated method stub
		experiencedetailsReprository.save(experiencedetails);
		return true;
	}

	@Override
	public Boolean delete(Long id) {
		// TODO Auto-generated method stub
		experiencedetailsReprository.deleteById(id);
		return true;
	}

}
