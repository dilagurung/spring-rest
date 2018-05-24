package com.job.service;

import java.util.List;

import com.cy.entity.Job;

public interface JobService {
	public Job findById(Long id);
	public List<Job> findAll();
	public Boolean save(Job job);
	public Boolean update(Job job);
	public Boolean delete(Long id);

}
