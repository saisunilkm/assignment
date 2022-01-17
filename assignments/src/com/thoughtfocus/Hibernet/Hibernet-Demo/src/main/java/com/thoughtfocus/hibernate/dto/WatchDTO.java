package com.thoughtfocus.hibernate.dto;

public class WatchDTO {
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isUnderwarrenty() {
		return underwarrenty;
	}
	public void setUnderwarrenty(boolean underwarrenty) {
		this.underwarrenty = underwarrenty;
	}
	
	
	private int id;
	private String brand;
	private double price;
	private boolean underwarrenty;
	
	@Override
	public String toString() {
		return "WatchDTO [id=" + id + ", brand=" + brand + ", price=" + price + ", underwarrenty=" + underwarrenty
				+ "]";
	}
	
	

}
