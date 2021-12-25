package com.thoughtfocus.array.exception.encapsulationarray.crudOperationPractical;

public class MobileDTO {
	private long mobileID; 
	private String modelName; 
	private double price; 
	private int memory;
	private String brandName; 
	private long serialNumber; 
	private int NoOfCamera;
	
	public MobileDTO() {
		
	}
	public long getMobileID() {
		return mobileID;
	}
	public void setMobileID(long mobileID) {
		this.mobileID = mobileID;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public long getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}
	public int getNoOfCamera() {
		return NoOfCamera;
	}
	public void setNoOfCamera(int noOfCamera) {
		NoOfCamera = noOfCamera;
	}
	@Override
	public String toString() {
		return "Mobile [mobileID=" + mobileID+ ",modelName=" + modelName +",price=" +price+",memory=" +memory+", brandName=" +brandName +", serialNumber=" + serialNumber+",NoOfCamera=" + NoOfCamera+"]";
	}
	
	


}
