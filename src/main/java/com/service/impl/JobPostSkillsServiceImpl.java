package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.entity.JobPostSkills;
import com.job.repository.JobPostSkillsReprository;
import com.job.service.JobPostSkillsService;
@Service
public class JobPostSkillsServiceImpl implements JobPostSkillsService{

	@Autowired
	JobPostSkillsReprository jobpostskillsReprository;
	@Override
	public JobPostSkills findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<JobPostSkills> findAll() {
		// TODO Auto-generated method stub
		return jobpostskillsReprository.findAll();
	}

	@Override
	public Boolean save(JobPostSkills jobpostskills) {
		// TODO Auto-generated method stub
		jobpostskillsReprository.save(jobpostskills);
		return true;
	}

	@Override
	public Boolean update(JobPostSkills jobpostskills) {
		// TODO Auto-generated method stub
		jobpostskillsReprository.save(jobpostskills);
		return true;
	}

	@Override
	public Boolean delete(Long id) {
		// TODO Auto-generated method stub
		jobpostskillsReprository.deleteById(id);
		return true;
	}

}
