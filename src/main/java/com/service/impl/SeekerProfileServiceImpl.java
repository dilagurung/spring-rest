package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.entity.SeekerProfile;
import com.job.repository.SeekerProfileReprository;
import com.job.service.SeekerProfileService;

@Service
public class SeekerProfileServiceImpl implements SeekerProfileService {

	@Autowired
	SeekerProfileReprository seekerprofileReprository;
	@Override
	public SeekerProfile findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SeekerProfile> findAll() {
		// TODO Auto-generated method stub
		return seekerprofileReprository.findAll();
	}

	@Override
	public Boolean save(SeekerProfile seekerprofile) {
		// TODO Auto-generated method stub
		seekerprofileReprository.save(seekerprofile);
		return true;
	}

	@Override
	public Boolean update(SeekerProfile seekerprofile) {
		// TODO Auto-generated method stub
		seekerprofileReprository.save(seekerprofile);
		return true;
	}

	@Override
	public Boolean delete(Long id) {
		// TODO Auto-generated method stub
		seekerprofileReprository.deleteById(id);
		return true;
	}

}
