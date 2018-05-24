package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.entity.UserType;
import com.job.repository.UserTypeReprository;
import com.job.service.UserTypeService;

@Service
public class UserTypeServiceImpl implements UserTypeService {
	
	

	@Autowired
	UserTypeReprository usertypeReprository;
	@Override
	public UserType findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserType> findAll() {
		// TODO Auto-generated method stub
		return usertypeReprository.findAll();
	}

	@Override
	public Boolean save(UserType usertype) {
		// TODO Auto-generated method stub
		usertypeReprository.save(usertype);
		return true;
	}

	@Override
	public Boolean update(UserType usertype) {
		// TODO Auto-generated method stub
		usertypeReprository.save(usertype);
		return true;
	}

	@Override
	public Boolean delete(Long id) {
		// TODO Auto-generated method stub
		usertypeReprository.deleteById(id);
		return true;
	}

}
