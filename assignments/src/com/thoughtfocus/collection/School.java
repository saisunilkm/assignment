package com.thoughtfocus.array.exception.collection;

public class School {
	private String name;
	private int noOfStudents;
	private String code;
	private String location;
	
	public School (String name,int noOfStudents,String code,String location) {
		this.name=name;
		this.noOfStudents=noOfStudents;
		this.code=code;
		this.location=location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "School[name:"+name+",noofstudents:"+noOfStudents+",code:"+code+",location:"+location+"]";
	}

	
	
	

}
