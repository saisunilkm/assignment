package com.thoughtfocus.MovieDTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="MovieDetails")
public class MovieDTO implements Serializable {
	@Id
	private int id;
	private String name;
	private String language;
	private double budget;
	@Column(name="no_of_Actors")
	private int noOfActor;
	@Column(name="is_Colour")
	private boolean isColour;

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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public int getNoOfActor() {
		return noOfActor;
	}

	public void setNoOfActor(int noOfActor) {
		this.noOfActor = noOfActor;
	}

	public boolean isColour() {
		return isColour;
	}

	public void setColour(boolean isColour) {
		this.isColour = isColour;
	}

	@Override
	public String toString() {
		return "MovieDTO [id=" + id + ", name=" + name + ", language=" + language + ", budget=" + budget
				+ ", noOfActor=" + noOfActor + ", isColour=" + isColour + "]";
	}
	
	

}
