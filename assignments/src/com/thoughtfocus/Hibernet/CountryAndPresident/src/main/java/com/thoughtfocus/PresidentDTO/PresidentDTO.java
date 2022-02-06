package com.thoughtfocus.PresidentDTO;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.thoughtfocus.CountryDTO.CountryDTO;
@Entity
@Table(name="President_details")
public class PresidentDTO implements Serializable {
	@Id
	@Column(name = "president_id")
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private int id;
	@Column(name = "president_name")
	private String name;
	private int age;
	@OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name="c_id")

	CountryDTO country;



	public CountryDTO getCountry() {
	return country;
	}



	public void setCountry(CountryDTO country) {
	this.country = country;
	}



	public int getId() {
	return id;
	}



	public void setId(int id) {
	this.id = id;
	}



	public String getName() {
	return name;
	}



	public void setName(String name) {
	this.name = name;
	}



	public int getAge() {
	return age;
	}



	public void setAge(int age) {
	this.age = age;
	}
	

}
