package com.jwt.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="historical")
public class Historical {

	@Id
	@Column(name="")
	Integer idHistorical;
	
	@Column(name="")
	Integer idCompany;	
	
	@Column(name="")
	Date closeTime;
	
	@Column(name="")
	Time closeHour;
	
	@Column(name="")
	Float openValue;
	
	@Column(name="")
	Float closeValue;
	
	
	public Integer getIdHistorical() {
		return idHistorical;
	}
	public void setIdHistorical(Integer idHistorical) {
		this.idHistorical = idHistorical;
	}
	public Integer getIdCompany() {
		return idCompany;
	}
	public void setIdCompany(Integer idCompany) {
		this.idCompany = idCompany;
	}
	public Date getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(Date closeTime) {
		this.closeTime = closeTime;
	}
	public Time getCloseHour() {
		return closeHour;
	}
	public void setCloseHour(Time closeHour) {
		this.closeHour = closeHour;
	}
	public Float getOpenValue() {
		return openValue;
	}
	public void setOpenValue(Float openValue) {
		this.openValue = openValue;
	}
	public Float getCloseValue() {
		return closeValue;
	}
	public void setCloseValue(Float closeValue) {
		this.closeValue = closeValue;
	}
	
	
}
