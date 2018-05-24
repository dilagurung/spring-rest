package com.job.service;

import java.util.List;
import com.cy.entity.JobType;

public interface JobTypeService {
	public JobType findById(Long id);
	public List<JobType> findAll();
	public Boolean save(JobType jobtype);
	public Boolean update(JobType jobtype);
	public Boolean delete(Long id);

}
