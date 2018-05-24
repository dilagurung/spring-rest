package com.job.service;

import java.util.List;
import com.cy.entity.JobPostActivity;

public interface JobPostActivityService {
	public JobPostActivity findById(Long id);
	public List<JobPostActivity> findAll();
	public Boolean save(JobPostActivity jobpostactivity);
	public Boolean update(JobPostActivity jobpostactivity);
	public Boolean delete(Long id);

}
