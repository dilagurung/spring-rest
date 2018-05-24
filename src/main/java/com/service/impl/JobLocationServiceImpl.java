package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.entity.JobLocation;
import com.job.repository.JobLocationReprository;
import com.job.service.JobLocationService;
@Service
public class JobLocationServiceImpl implements JobLocationService{

	@Autowired
	JobLocationReprository joblocationReprository;
	@Override
	public JobLocation findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<JobLocation> findAll() {
		// TODO Auto-generated method stub
		
		return joblocationReprository.findAll();
	}

	@Override
	public Boolean save(JobLocation joblocation) {
		// TODO Auto-generated method stub
		joblocationReprository.save(joblocation);
		return true;
	}

	@Override
	public Boolean update(JobLocation joblocation) {
		// TODO Auto-generated method stub
		joblocationReprository.save(joblocation);
		return true;
	}

	@Override
	public Boolean delete(Long id) {
		// TODO Auto-generated method stub
		joblocationReprository.deleteById(id);
		return true;
	}

}
