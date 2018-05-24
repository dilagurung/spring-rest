package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.entity.EducationalDetails;
import com.job.repository.EducationalDetailsReprository;
import com.job.service.EducationalDetailsService;

@Service
public class EducationalDetailsServiceImpl implements EducationalDetailsService {

	@Autowired
	EducationalDetailsReprository educationaldetailsReprository;
	@Override
	public EducationalDetails findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EducationalDetails> findAll() {
		// TODO Auto-generated method stub
		return educationaldetailsReprository.findAll();
	}

	@Override
	public Boolean save(EducationalDetails educationaldetails) {
		// TODO Auto-generated method stub
		educationaldetailsReprository.save(educationaldetails);
		return true;
	}

	@Override
	public Boolean update(EducationalDetails educationaldetails) {
		// TODO Auto-generated method stub
		educationaldetailsReprository.save(educationaldetails);
		return true;
	}

	@Override
	public Boolean delete(Long id) {
		// TODO Auto-generated method stub
		educationaldetailsReprository.deleteById(id);
		return true;
	}

}
