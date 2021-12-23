package com.thoughtfocus.array;

public class Tester {
	public static void main (String[]args) {
		Months months = new Months();
		
		months.save("january");
		months.save("February");
		months.save("March");
		months.save("April");
		months.save("May");
		months.save("june");
		months.save("july");
		months.save("August");
		months.save("September");
		months.save("November");
		months.save("December");
		
		months.printAll();
		System.out.println ("------------------");
		String remove = months.delete("March");
		months.printAll();
	}

}
