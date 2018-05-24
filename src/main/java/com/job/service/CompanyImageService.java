package com.job.service;

import java.util.List;
import com.cy.entity.CompanyImage;

public interface CompanyImageService {
	public CompanyImage findById(Long id);
	public List<CompanyImage> findAll();
	public Boolean save(CompanyImage companyimage);
	public Boolean update(CompanyImage companyimage);
	public Boolean delete(Long id);

}
