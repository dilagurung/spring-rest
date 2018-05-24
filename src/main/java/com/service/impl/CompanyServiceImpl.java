package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.entity.Company;
import com.job.repository.CompanyReprository;
import com.job.service.CompanyService;
@Service
public class CompanyServiceImpl implements CompanyService {
	
@Autowired
	CompanyReprository companyReprository;
	@Override
	public Company findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Company> findAll() {
		// TODO Auto-generated method stub
		return companyReprository.findAll();
	}

	@Override
	public Boolean save(Company company) {
		// TODO Auto-generated method stub
		companyReprository.save(company);
		return true;
	}

	@Override
	public Boolean update(Company company) {
		// TODO Auto-generated method stub
		companyReprository.save(company);
		return true;
	}

	@Override
	public Boolean delete(Long id) {
		// TODO Auto-generated method stub
		companyReprository.deleteById(id);
		return true;
	}

}
