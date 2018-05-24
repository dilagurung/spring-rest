package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.entity.SeekerSkills;
import com.job.repository.SeekerSkillsReprository;
import com.job.service.SeekerSkillsService;

@Service
public class SeekerSkillsServiceImpl implements SeekerSkillsService {
	
	

	@Autowired
	SeekerSkillsReprository seekerskillsReprository;
	@Override
	public SeekerSkills findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SeekerSkills> findAll() {
		// TODO Auto-generated method stub
		return seekerskillsReprository.findAll();
	}

	@Override
	public Boolean save(SeekerSkills seekerskills) {
		// TODO Auto-generated method stub
		seekerskillsReprository.save(seekerskills);
		return true;
	}

	@Override
	public Boolean update(SeekerSkills seekerskills) {
		// TODO Auto-generated method stub
		seekerskillsReprository.save(seekerskills);
		return true;
	}

	@Override
	public Boolean delete(Long id) {
		// TODO Auto-generated method stub
		seekerskillsReprository.deleteById(id);
		return true;
	}

}
