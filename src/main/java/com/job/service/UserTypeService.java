package com.job.service;

import java.util.List;
import com.cy.entity.UserType;

public interface UserTypeService {
	public UserType findById(Long id);
	public List<UserType> findAll();
	public Boolean save(UserType usertype);
	public Boolean update(UserType usertype);
	public Boolean delete(Long id);

}
