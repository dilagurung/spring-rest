package com.cy.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="experience_details")
public class ExperienceDetails extends Parent{
	private int user_account_id;
	private String current_job;
	private Date start_date;
	private Date end_date;
	private String job_title;
	private String company_name;
	private String job_location_city;
	private String job_location_state;
	private String job_location_country;
	private int seeker_profile_id;
	public int getUser_account_id() {
		return user_account_id;
	}
	public void setUser_account_id(int user_account_id) {
		this.user_account_id = user_account_id;
	}
	public String getCurrent_job() {
		return current_job;
	}
	public void setCurrent_job(String current_job) {
		this.current_job = current_job;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getJob_location_city() {
		return job_location_city;
	}
	public void setJob_location_city(String job_location_city) {
		this.job_location_city = job_location_city;
	}
	public String getJob_location_state() {
		return job_location_state;
	}
	public void setJob_location_state(String job_location_state) {
		this.job_location_state = job_location_state;
	}
	public String getJob_location_country() {
		return job_location_country;
	}
	public void setJob_location_country(String job_location_country) {
		this.job_location_country = job_location_country;
	}
	public int getSeeker_profile_id() {
		return seeker_profile_id;
	}
	public void setSeeker_profile_id(int seeker_profile_id) {
		this.seeker_profile_id = seeker_profile_id;
	}
	
	
	
	

}
