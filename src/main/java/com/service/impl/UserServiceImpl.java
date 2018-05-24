package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.entity.User;
import com.job.repository.UserReprository;
import com.job.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserReprository userReprository;
	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userReprository.findAll();
	}

	@Override
	public Boolean save(User user) {
		// TODO Auto-generated method stub
		userReprository.save(user);
		return true;
	}

	@Override
	public Boolean update(User user) {
		// TODO Auto-generated method stub
		userReprository.save(user);
		return true;
	}

	@Override
	public Boolean delete(Long id) {
		// TODO Auto-generated method stub
		 userReprository.deleteById(id);
		 return true;
	}

}
