package com.thoughtfocus.array.exception.encapsulationarray;

public class TraineeDetails {
	private int TraineeId;
	private String name;
	private long ContactNumber;
	
	
	public int getTraineeId() {
		return TraineeId;
	}
	public void setTraineeId(int traineeId) {
		TraineeId = traineeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(long contactNumber) {
		ContactNumber = contactNumber;
	}
	@Override
	public String toString() {

		return "TraineeDetails[TraineeId" + TraineeId + ",name=" +name + ",ContactNumber=" +ContactNumber + "]";
	}
	
	
	
	

}
