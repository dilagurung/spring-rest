package com.cy.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="job_type")
public class JobType extends Parent{
	private String job_type;

	public String getJob_type() {
		return job_type;
	}

	public void setJob_type(String job_type) {
		this.job_type = job_type;
	}

	
}
