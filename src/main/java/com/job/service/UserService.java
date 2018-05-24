package com.job.service;

import java.util.List;

import com.cy.entity.User;



public interface UserService {
	public User findById(Long id);
	public List<User> findAll();
	public Boolean save(User user);
	public Boolean update(User user);
	public Boolean delete(Long id);

}
