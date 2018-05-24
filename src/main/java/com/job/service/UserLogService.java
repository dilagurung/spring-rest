package com.job.service;

import java.util.List;

import com.cy.entity.UserLog;

public interface UserLogService {
	public UserLog findById(Long id);
	public List<UserLog> findAll();
	public Boolean save(UserLog userlog);
	public Boolean update(UserLog userlog);
	public Boolean delete(Long id);


}
