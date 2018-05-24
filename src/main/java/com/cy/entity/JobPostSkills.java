package com.cy.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="job_post_skills")
public class JobPostSkills extends Parent {
	private int skill_id;
	private int job_post_id;
	private int skill_level;
	private int skills_id;
	private int job_id;
	public int getSkill_id() {
		return skill_id;
	}
	public void setSkill_id(int skill_id) {
		this.skill_id = skill_id;
	}
	public int getJob_post_id() {
		return job_post_id;
	}
	public void setJob_post_id(int job_post_id) {
		this.job_post_id = job_post_id;
	}
	public int getSkill_level() {
		return skill_level;
	}
	public void setSkill_level(int skill_level) {
		this.skill_level = skill_level;
	}
	public int getSkills_id() {
		return skills_id;
	}
	public void setSkills_id(int skills_id) {
		this.skills_id = skills_id;
	}
	public int getJob_id() {
		return job_id;
	}
	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}
	
	

}
