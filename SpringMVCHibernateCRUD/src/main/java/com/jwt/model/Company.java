package com.jwt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMPANY")
public class Company {

	@Id
	@Column(name="ID")
	Integer idCompany;
	
	@Column(name="COMPANY_NAME")
	String  companyName;
	
	@Column(name="PLACE")
	String companyPlace;
	
	
	public Integer getIdCompany() {
		return idCompany;
	}
	public void setIdCompany(Integer idCompany) {
		this.idCompany = idCompany;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyPlace() {
		return companyPlace;
	}
	public void setCompanyPlace(String companyPlace) {
		this.companyPlace = companyPlace;
	}
		

}
