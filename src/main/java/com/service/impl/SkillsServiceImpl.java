package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.entity.Skills;
import com.job.repository.SkillsReprository;
import com.job.service.SkillsService;
@Service
public class SkillsServiceImpl implements SkillsService {

	@Autowired
	SkillsReprository skillsReprository;
	@Override
	public Skills findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Skills> findAll() {
		// TODO Auto-generated method stub
		return skillsReprository.findAll();
	}

	@Override
	public Boolean save(Skills skills) {
		// TODO Auto-generated method stub
		skillsReprository.save(skills);
		return true;
	}

	@Override
	public Boolean update(Skills skills) {
		// TODO Auto-generated method stub
		skillsReprository.save(skills);
		return true;
	}

	@Override
	public Boolean delete(Long id) {
		// TODO Auto-generated method stub
		skillsReprository.deleteById(id);
		return true;
	}

}
