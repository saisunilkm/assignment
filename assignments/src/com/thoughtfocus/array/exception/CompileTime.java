package com.thoughtfocus.array.exception;

public class CompileTime {
	int a;
	public void getData(int a) {
		this.a=a;
		System.out.println(a);
		
		
	}
	public static void main (String[]args) {
		CompileTime compiletime = new CompileTime();
		compiletime.getData(250);
	}

}
