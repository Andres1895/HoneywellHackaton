package com.jwt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jwt.model.Company;
import com.jwt.service.CompanyService;
import com.sun.istack.internal.logging.Logger;

@Controller
public class CompanyController {
	
	private static final Logger logger = Logger.getLogger(CompanyController.class);

	@Autowired
	private CompanyService companyService;
	
	@RequestMapping(value = "/")
	public List<Company> getAllCompanies() {
		List<Company> listCompanies = new ArrayList<>();
		
		return listCompanies = companyService.getAllCompanies();
		
	}
	

}
