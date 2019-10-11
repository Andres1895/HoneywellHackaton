package com.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jwt.service.CompanyService;
import com.sun.istack.internal.logging.Logger;

@Controller
public class CompanyController {
	
	private static final Logger logger = Logger.getLogger(CompanyController.class);

	@Autowired
	private CompanyService companyService;
	
	@RequestMapping(value = "/")
	public String getAllCompanies() {
		return "hola C:";
	}
	

}
