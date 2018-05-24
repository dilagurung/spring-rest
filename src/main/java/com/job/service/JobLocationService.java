package com.job.service;

import java.util.List;
import com.cy.entity.JobLocation;

public interface JobLocationService {
	public JobLocation findById(Long id);
	public List<JobLocation> findAll();
	public Boolean save(JobLocation joblocation);
	public Boolean update(JobLocation joblocation);
	public Boolean delete(Long id);

}
