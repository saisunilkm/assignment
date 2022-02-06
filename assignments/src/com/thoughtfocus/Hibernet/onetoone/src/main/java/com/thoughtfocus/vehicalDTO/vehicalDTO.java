package com.thoughtfocus.vehicalDTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Vehical_details")
public class vehicalDTO implements Serializable {
	@Id
	@Column(name = "vehicle_id")
	private int id;
	@Column(name = "vehicle_name")
	private String vehicleName;
	private double cost;



	public int getId() {
	return id;
	}



	public void setId(int id) {
	this.id = id;
	}



	public String getVehicleName() {
	return vehicleName;
	}



	public void setVehicleName(String vehicleName) {
	this.vehicleName = vehicleName;
	}



	public double getCost() {
	return cost;
	}



	public void setCost(double cost) {
	this.cost = cost;
	}



	@Override
	public String toString() {
	return "VehicleDto [id=" + id + ", vehicleName=" + vehicleName + ", cost=" + cost + "]";
	}



	

}
