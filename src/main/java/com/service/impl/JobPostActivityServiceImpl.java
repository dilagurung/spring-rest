package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.entity.JobPostActivity;
import com.job.repository.JobPostActivityReprository;
import com.job.service.JobPostActivityService;

@Service
public class JobPostActivityServiceImpl implements JobPostActivityService{

	@Autowired
	JobPostActivityReprository jobpostactivityReprository;
	@Override
	public JobPostActivity findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<JobPostActivity> findAll() {
		// TODO Auto-generated method stub
		return jobpostactivityReprository.findAll();
	}

	@Override
	public Boolean save(JobPostActivity jobpostactivity) {
		// TODO Auto-generated method stub
		jobpostactivityReprository.save(jobpostactivity);
		return true;
	}

	@Override
	public Boolean update(JobPostActivity jobpostactivity) {
		// TODO Auto-generated method stub
		jobpostactivityReprository.save(jobpostactivity);
		return true;
	}

	@Override
	public Boolean delete(Long id) {
		// TODO Auto-generated method stub
		jobpostactivityReprository.deleteById(id);
		return true;
	}

}
