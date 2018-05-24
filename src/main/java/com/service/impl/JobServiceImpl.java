package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.entity.Job;
import com.job.repository.JobReprository;
import com.job.service.JobService;

@Service
public class JobServiceImpl implements JobService{
	

	@Autowired
	JobReprository jobReprository;
	@Override
	public Job findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Job> findAll() {
		// TODO Auto-generated method stub
		return jobReprository.findAll();
	}

	@Override
	public Boolean save(Job job) {
		// TODO Auto-generated method stub
		jobReprository.save(job);
		return true;
	}

	@Override
	public Boolean update(Job job) {
		// TODO Auto-generated method stub
		jobReprository.save(job);
		return true;
	}

	@Override
	public Boolean delete(Long id) {
		// TODO Auto-generated method stub
		jobReprository.deleteById(id);
		return true;
	}
	

}
