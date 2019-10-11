package com.jwt.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jwt.model.Company;


public interface CompanyDao{

	public List<Company> getAllCompanies();
	
}


