package com.cy.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="user_type")
public class UserType extends Parent{
private String user_type_name;

public String getUser_type_name() {
	return user_type_name;
}

public void setUser_type_name(String user_type_name) {
	this.user_type_name = user_type_name;
}


}
