package com.cy.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="job")
public class Job extends Parent {
	private int posted_by_id;
	private int job_type_id;
	private int company_id;
	private String job_location;
	private Date deleted_at;
	private Date valid_till;
	private int job_location_id;
	private int companies_id;
	private int user_id;
	
	@ManyToOne(fetch =FetchType.EAGER)
	@JoinColumn(name="user")
	private User user;

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getPosted_by_id() {
		return posted_by_id;
	}
	public void setPosted_by_id(int posted_by_id) {
		this.posted_by_id = posted_by_id;
	}
	public int getJob_type_id() {
		return job_type_id;
	}
	public void setJob_type_id(int job_type_id) {
		this.job_type_id = job_type_id;
	}
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	public String getJob_location() {
		return job_location;
	}
	public void setJob_location(String job_location) {
		this.job_location = job_location;
	}
	public Date getDeleted_at() {
		return deleted_at;
	}
	public void setDeleted_at(Date deleted_at) {
		this.deleted_at = deleted_at;
	}
	public Date getValid_till() {
		return valid_till;
	}
	public void setValid_till(Date valid_till) {
		this.valid_till = valid_till;
	}
	public int getJob_location_id() {
		return job_location_id;
	}
	public void setJob_location_id(int job_location_id) {
		this.job_location_id = job_location_id;
	}
	public int getCompanies_id() {
		return companies_id;
	}
	public void setCompanies_id(int companies_id) {
		this.companies_id = companies_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	
	
	

}
