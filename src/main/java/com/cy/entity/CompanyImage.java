package com.cy.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="company_image")
public class CompanyImage extends Parent{
	private int company_id;
	private String Company_image;
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	public String getCompany_image() {
		return Company_image;
	}
	public void setCompany_image(String company_image) {
		Company_image = company_image;
	}
	

}
