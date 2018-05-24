package com.job.service;

import java.util.List;

import com.cy.entity.SeekerSkills;

public interface SeekerSkillsService {
	public SeekerSkills findById(Long id);
	public List<SeekerSkills> findAll();
	public Boolean save(SeekerSkills seekerskills);
	public Boolean update(SeekerSkills seekerskills);
	public Boolean delete(Long id);

}
