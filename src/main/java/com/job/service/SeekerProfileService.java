package com.job.service;

import java.util.List;

import com.cy.entity.SeekerProfile;

public interface SeekerProfileService {
	public SeekerProfile findById(Long id);
	public List<SeekerProfile> findAll();
	public Boolean save(SeekerProfile seekerprofile);
	public Boolean update(SeekerProfile seekerprofile);
	public Boolean delete(Long id);

}
