package com.cy.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="education_details")
public class EducationalDetails extends Parent{
	private int user_account_id;
	private String certificate_degree_name;
	private String institue_university_name;
	private Date starting_date;
	private Date end_at;
	private int percentage;
	private int cgpa;
	private int seeker_profile;
	public int getUser_account_id() {
		return user_account_id;
	}
	public void setUser_account_id(int user_account_id) {
		this.user_account_id = user_account_id;
	}
	public String getCertificate_degree_name() {
		return certificate_degree_name;
	}
	public void setCertificate_degree_name(String certificate_degree_name) {
		this.certificate_degree_name = certificate_degree_name;
	}
	public String getInstitue_university_name() {
		return institue_university_name;
	}
	public void setInstitue_university_name(String institue_university_name) {
		this.institue_university_name = institue_university_name;
	}
	public Date getStarting_date() {
		return starting_date;
	}
	public void setStarting_date(Date starting_date) {
		this.starting_date = starting_date;
	}
	public Date getEnd_at() {
		return end_at;
	}
	public void setEnd_at(Date end_at) {
		this.end_at = end_at;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public int getCgpa() {
		return cgpa;
	}
	public void setCgpa(int cgpa) {
		this.cgpa = cgpa;
	}
	public int getSeeker_profile() {
		return seeker_profile;
	}
	public void setSeeker_profile(int seeker_profile) {
		this.seeker_profile = seeker_profile;
	}
	
	
	
	

}
