package com.thoughtfocus.CountryDTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="Country_details")
public class CountryDTO implements Serializable {
	@Id
	@Column(name = "country_id")
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private int cid;
	@Column(name = "country_name")
	private String cname;
	@Column(name = "country_region")
	private String cregion;

	public int getId() {
	return cid;
	}
	public void setId(int cid) {
	this.cid = cid;
	}
	public String getName() {
	return cname;
	}
	public void setName(String cname) {
	this.cname = cname;
	}
	public String getRegion() {
	return cregion;
	}
	public void setRegion(String cregion) {
	this.cregion = cregion;
	}

}
