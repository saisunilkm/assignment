package com.thoughtfocus.array.exception.encapsulationarray;

public class Tester {
	public static void main (String[]args) {
		TraineeDetailsDAO dao = new TraineeDetailsDAO();
		TraineeDetails details = new TraineeDetails();
		details.setName("Sunil");
		details.setTraineeId(106580);
		details.setContactNumber(788458855);
		
		TraineeDetails details1 = new TraineeDetails();
		details1.setName("Chaitanya");
		details1.setTraineeId(106583);
		details1.setContactNumber(856497545);
		
		TraineeDetails details2 = new TraineeDetails();
		details2.setName("Syed");
		details2.setTraineeId(10578);
		details2.setContactNumber(985647895);
		
		dao.save(details);
		dao.save(details1);
		dao.save(details2);
		
		dao.PrintAll();
		
		dao.updateName("Sunil", "Rohith");
		dao.PrintAll();
		dao.deleteByName("Syed");
		dao.PrintAll();
		dao.deleteByContactNumber(788458855);
		dao.PrintAll();
		
	}

}
