package com.thoughtfocus.array.exception.collectionarraylist;

import java.util.ArrayList;

public class ArrayListCollection {
	public static void main (String[]args) {
		ArrayList<String>list = new ArrayList();
		list.add("car");
		list.add("bus");
		list.add("bike");
		list.add("train");
		
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		list.set(2, "buses");
		System.out.println(list);
		list.addAll(list);
		list.add("flight");
		System.out.println(list);
	}

}
