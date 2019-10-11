package com.jwt.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.dao.CompanyDao;
import com.jwt.model.Company;

@Repository
public class CompanyDaoImpl implements CompanyDao {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Company> getAllCompanies() {
		
		return sessionFactory.getCurrentSession().createQuery("  from Company").list();
	}
	


	
	
	
}
