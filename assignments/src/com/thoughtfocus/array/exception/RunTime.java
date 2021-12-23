package com.thoughtfocus.array.exception;

public class RunTime {
	static int k=100;
	public static void main (String[]args) {
		try {
			int a =0,b=0;
			int z=a/b;
			System.out.println(z);
		}
		catch(ArithmeticException ex) {
			ex.printStackTrace();
		}
		System.out.println (k);
	}

}
