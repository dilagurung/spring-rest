package com.cy.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="job_post_activity")
public class JobPostActivity extends Parent {
	private int user_id;
	private int job_id;
	private Date apply_date;
	private int jobs_id;
	private int users_id;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getJob_id() {
		return job_id;
	}
	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}
	public Date getApply_date() {
		return apply_date;
	}
	public void setApply_date(Date apply_date) {
		this.apply_date = apply_date;
	}
	public int getJobs_id() {
		return jobs_id;
	}
	public void setJobs_id(int jobs_id) {
		this.jobs_id = jobs_id;
	}
	public int getUsers_id() {
		return users_id;
	}
	public void setUsers_id(int users_id) {
		this.users_id = users_id;
	}
	
	

}
