package com.cy.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User extends Parent {
	private String user_type;
	private String email;
	private String password;
	private String date_of_birth;
	private String gender;
	private String contact;
	private String email_notification;
	private String user_image;
	private Date registration_date;
	private Long user_type_id;
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail_notification() {
		return email_notification;
	}
	public void setEmail_notification(String email_notification) {
		this.email_notification = email_notification;
	}
	public String getUser_image() {
		return user_image;
	}
	public void setUser_image(String user_image) {
		this.user_image = user_image;
	}
	public Date getRegistration_date() {
		return registration_date;
	}
	public void setRegistration_date(Date registration_date) {
		this.registration_date = registration_date;
	}
	public Long getUser_type_id() {
		return user_type_id;
	}
	public void setUser_type_id(Long user_type_id) {
		this.user_type_id = user_type_id;
	}
	
	
	

}
