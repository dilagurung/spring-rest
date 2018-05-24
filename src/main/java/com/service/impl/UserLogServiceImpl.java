package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.entity.UserLog;
import com.job.repository.UserLogReprository;
import com.job.service.UserLogService;
@Service
public class UserLogServiceImpl implements UserLogService{

	@Autowired
	UserLogReprository userlogReprository;
	@Override
	public UserLog findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserLog> findAll() {
		// TODO Auto-generated method stub
	return	userlogReprository.findAll();
		
	}

	@Override
	public Boolean save(UserLog userlog) {
		// TODO Auto-generated method stub
		userlogReprository.save(userlog);
		return true;
	}

	@Override
	public Boolean update(UserLog userlog) {
		// TODO Auto-generated method stub
		userlogReprository.save(userlog);
		return true;
	}

	@Override
	public Boolean delete(Long id) {
		// TODO Auto-generated method stub
		userlogReprository.deleteById(id);
		return true;
	}

}
