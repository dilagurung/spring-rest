package com.cy.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="user_log")
public class UserLog extends Parent{
	private int user_account_id;
	private Date last_login;
	private Date last_job_applied;
	private int user_id;
	public int getUser_account_id() {
		return user_account_id;
	}
	public void setUser_account_id(int user_account_id) {
		this.user_account_id = user_account_id;
	}
	public Date getLast_login() {
		return last_login;
	}
	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}
	public Date getLast_job_applied() {
		return last_job_applied;
	}
	public void setLast_job_applied(Date last_job_applied) {
		this.last_job_applied = last_job_applied;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	

}
