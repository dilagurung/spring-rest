package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.entity.CompanyImage;
import com.job.repository.CompanyImageReprository;
import com.job.service.CompanyImageService;

@Service
public class CompanyImageServiceImpl implements CompanyImageService{

	@Autowired
	CompanyImageReprository companyimageReprository;
	@Override
	public CompanyImage findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CompanyImage> findAll() {
		// TODO Auto-generated method stub
		return companyimageReprository.findAll();
	}

	@Override
	public Boolean save(CompanyImage companyimage) {
		// TODO Auto-generated method stub
		companyimageReprository.save(companyimage);
		return true;
	}

	@Override
	public Boolean update(CompanyImage companyimage) {
		// TODO Auto-generated method stub
		companyimageReprository.save(companyimage);
		return true;
	}

	@Override
	public Boolean delete(Long id) {
		// TODO Auto-generated method stub
		companyimageReprository.deleteById(id);
		return true;
	}

}
