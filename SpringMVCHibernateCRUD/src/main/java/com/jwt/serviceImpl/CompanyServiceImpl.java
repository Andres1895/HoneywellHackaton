package com.jwt.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.dao.CompanyDao;
import com.jwt.model.Company;
import com.jwt.service.CompanyService;


@Service
@Transactional
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	private CompanyDao companyDao;
	
	
	
	@Override
	@Transactional
	public List<Company> getAllCompanies() {
		
		return companyDao.getAllCompanies();
	}
	
	
	

}
