package com.cy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student
{
@Id
private Long id;
private String name;
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
