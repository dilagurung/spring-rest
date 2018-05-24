package com.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cy.entity.User;


public interface UserReprository extends JpaRepository<User,Long>{

}
