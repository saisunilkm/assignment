package com.thoughtfocus.vehicalDTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VehicalDetails")
public class vehicalDTO implements Serializable {
	private String name;
	@Column(name="cost")
	private double price;
	@Id
	@Column(name="registration_number")
	private long registrationNumber;
	private boolean insurance;
	@Column(name="number_of_gears")
	private int noOfGears;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(long registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public boolean isInsurance() {
		return insurance;
	}

	public void setInsurance(boolean insurance) {
		this.insurance = insurance;
	}

	public int getNoOfGears() {
		return noOfGears;
	}

	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}

	@Override
	public String toString() {
		return "vehicalDTO [name=" + name + ", price=" + price + ", registrationNumber=" + registrationNumber
				+ ", insurance=" + insurance + ", noOfGears=" + noOfGears + "]";
	}

}
