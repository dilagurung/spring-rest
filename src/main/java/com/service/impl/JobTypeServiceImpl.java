package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.entity.JobType;
import com.job.repository.JobTypeReprository;
import com.job.service.JobTypeService;
@Service
public class JobTypeServiceImpl implements JobTypeService {

	@Autowired
	JobTypeReprository jobtypeReprository;
	@Override
	public JobType findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<JobType> findAll() {
		// TODO Auto-generated method stub
		return jobtypeReprository.findAll();
	}

	@Override
	public Boolean save(JobType jobtype) {
		// TODO Auto-generated method stub
		jobtypeReprository.save(jobtype);
		return true;
	}

	@Override
	public Boolean update(JobType jobtype) {
		// TODO Auto-generated method stub
		jobtypeReprository.save(jobtype);
		return true;
	}

	@Override
	public Boolean delete(Long id) {
		// TODO Auto-generated method stub
		jobtypeReprository.deleteById(id);
		return true;
	}

}
