package com.cy.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="company")
public class Company extends Parent{
	private String company_name;
	private String profile_description;
	private String business_stream;
	private Date establishement_date;
	private String company_website_url;
	private Long business_stream_id;
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getProfile_description() {
		return profile_description;
	}
	public void setProfile_description(String profile_description) {
		this.profile_description = profile_description;
	}
	public String getBusiness_stream() {
		return business_stream;
	}
	public void setBusiness_stream(String business_stream) {
		this.business_stream = business_stream;
	}
	public Date getEstablishement_date() {
		return establishement_date;
	}
	public void setEstablishement_date(Date establishement_date) {
		this.establishement_date = establishement_date;
	}
	public String getCompany_website_url() {
		return company_website_url;
	}
	public void setCompany_website_url(String company_website_url) {
		this.company_website_url = company_website_url;
	}
	public Long getBusiness_stream_id() {
		return business_stream_id;
	}
	public void setBusiness_stream_id(Long business_stream_id) {
		this.business_stream_id = business_stream_id;
	}
	
	

}
