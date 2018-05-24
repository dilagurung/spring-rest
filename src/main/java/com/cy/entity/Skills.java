package com.cy.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="skills")
public class Skills extends Parent{
	private String skill_set_name;

	public String getSkill_set_name() {
		return skill_set_name;
	}

	public void setSkill_set_name(String skill_set_name) {
		this.skill_set_name = skill_set_name;
	}
	
	

}
