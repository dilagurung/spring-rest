package com.cy.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="seeker_skills")
public class SeekerSkills extends Parent{
	private int user_account_id;
	private int skill_set_id;
	private int seeker_profile_id;
	private int skill_id;
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
	public int getSeeker_profile_id() {
		return seeker_profile_id;
	}
	public void setSeeker_profile_id(int seeker_profile_id) {
		this.seeker_profile_id = seeker_profile_id;
	}
	public int getSkill_id() {
		return skill_id;
	}
	public void setSkill_id(int skill_id) {
		this.skill_id = skill_id;
	}
	
	
	

}
