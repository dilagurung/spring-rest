package com.cy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")

public class Student
{
@Id

private Long id;
@Column(name="teacher")

private String name;
@Column(unique=true)
private String library_id;


public String getLibrary_id() {
	return library_id;
}
public void setLibrary_id(String library_id) {
	this.library_id = library_id;
}
/**
 * @return the id
 */


public Long getId() {
	return id;
}
/**
 * 
 */
public Student() {
}
/**
 * @param id
 * @param name
 */
public Student(Long id, String name) {
	this.id = id;
	this.name = name;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param id the id to set
 */
public void setId(Long id) {
	this.id = id;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}




}
