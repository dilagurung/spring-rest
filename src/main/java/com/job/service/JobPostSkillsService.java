package com.job.service;

import java.util.List;
import com.cy.entity.JobPostSkills;

public interface JobPostSkillsService {
	public JobPostSkills findById(Long id);
	public List<JobPostSkills> findAll();
	public Boolean save(JobPostSkills jobpostskills);
	public Boolean update(JobPostSkills jobpostskills);
	public Boolean delete(Long id);

}
