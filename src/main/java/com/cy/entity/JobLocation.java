package com.cy.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="job_location")

public class JobLocation extends Parent{

	private String street_location;
	private String city;
	private String state;
	private String country;
	private String zip_code;
	public String getStreet_location() {
		return street_location;
	}
	public void setStreet_location(String street_location) {
		this.street_location = street_location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	
	
}
