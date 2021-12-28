package com.thoughtfocus.array.exception.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Tester {
	public static void main(String[] args) {
		LinkedList<School>schoollist = new LinkedList<>();
		School camford = new School ("camford",85,"k51","chittoor");
		School venkataswara = new School ("venkataswara",150,"g51","Tirupati");
		School rayalaseema = new School ("rayalaseema",55,"a25","Tirupati");
		
		schoollist.add(camford);
		schoollist.add(venkataswara);
		schoollist.add(rayalaseema);
		
		System.out.println(schoollist);
		
		Iterator itr = schoollist.iterator();
		while(itr.hasNext()) {
			School school = (School)itr.next();
			if(school.getNoOfStudents()<100) {
				System.out.println(school);
			}
		}
		schoollist.forEach((School)->{
			System.out.println(School.getCode());
			System.out.println(School.getLocation());
			
		});
		
		
			
			
		}
			
}
		
		
		
		



