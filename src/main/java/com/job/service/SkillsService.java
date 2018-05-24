package com.job.service;

import java.util.List;
import com.cy.entity.Skills;

public interface SkillsService {
	public Skills findById(Long id);
	public List<Skills> findAll();
	public Boolean save(Skills skills);
	public Boolean update(Skills skills);
	public Boolean delete(Long id);

}
