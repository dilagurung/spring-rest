package com.cy.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="seeker_profile")
public class SeekerProfile extends Parent {
	private int user_account_id;
	private int skill_set_id;
	private String photo;
	private String first_name;
	private String last_name;
	private String phone1;
	private String phone2;
	private String email;
	private int current_salary;
	private String is_anually_monthly;
	private String currency;
	private String job_location;
	private String parnament_address;
	private String temporary_address;
	private int education_detail_id;
	private int user_id;
	public int getUser_account_id() {
		return user_account_id;
	}
	public void setUser_account_id(int user_account_id) {
		this.user_account_id = user_account_id;
	}
	public int getSkill_set_id() {
		return skill_set_id;
	}
	public void setSkill_set_id(int skill_set_id) {
		this.skill_set_id = skill_set_id;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCurrent_salary() {
		return current_salary;
	}
	public void setCurrent_salary(int current_salary) {
		this.current_salary = current_salary;
	}
	public String getIs_anually_monthly() {
		return is_anually_monthly;
	}
	public void setIs_anually_monthly(String is_anually_monthly) {
		this.is_anually_monthly = is_anually_monthly;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getJob_location() {
		return job_location;
	}
	public void setJob_location(String job_location) {
		this.job_location = job_location;
	}
	public String getParnament_address() {
		return parnament_address;
	}
	public void setParnament_address(String parnament_address) {
		this.parnament_address = parnament_address;
	}
	public String getTemporary_address() {
		return temporary_address;
	}
	public void setTemporary_address(String temporary_address) {
		this.temporary_address = temporary_address;
	}
	public int getEducation_detail_id() {
		return education_detail_id;
	}
	public void setEducation_detail_id(int education_detail_id) {
		this.education_detail_id = education_detail_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public void save(SeekerProfile seekerprofile) {
		// TODO Auto-generated method stub
		
	}
	
	

}
