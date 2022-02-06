package com.thoughtfocus.spring.bean;

public class RefrigeratorBean {
	public RefrigeratorBean() {
		System.out.println(this.getClass().getSimpleName()+"obj created!");
	}
	public void maintainTeamperature() {
		System.out.println("Maintaining the temperature");
	}

}
