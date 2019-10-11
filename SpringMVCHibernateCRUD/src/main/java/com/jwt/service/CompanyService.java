package com.jwt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jwt.model.Company;

public interface CompanyService {

	
	public List<Company> getAllCompanies();
}
