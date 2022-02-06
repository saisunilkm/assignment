package com.thoughtfocus.EngineDTO;
import java.io.Serializable;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.thoughtfocus.vehicalDTO.vehicalDTO;
@Entity
@Table(name="Engine_details")
public class EngineDTO implements Serializable {
	@Id
	@Column(name = "engine_id")
	private int id;
	private double capacity;
	@Column(name = "no_of_strokes")
	private int noOfStrokes;
	@OneToOne
	@JoinColumn(name = "v_id")
	vehicalDTO vehicle;



	public vehicalDTO getVehicle() {
	return vehicle;
	}



	public void setVehicle(vehicalDTO vehicle) {
	this.vehicle = vehicle;
	}



	public int getId() {
	return id;
	}



	public void setId(int id) {
	this.id = id;
	}



	public double getCapacity() {
	return capacity;
	}



	public void setCapacity(double capacity) {
	this.capacity = capacity;
	}



	public int getNoOfStrokes() {
	return noOfStrokes;
	}



	public void setNoOfStrokes(int noOfStrokes) {
	this.noOfStrokes = noOfStrokes;
	}



	@Override
	public String toString() {
	return "EngineDto [id=" + id + ", capacity=" + capacity + ", noOfStrokes=" + noOfStrokes + ", vehicle="
	+ vehicle + "]";
	}

}
