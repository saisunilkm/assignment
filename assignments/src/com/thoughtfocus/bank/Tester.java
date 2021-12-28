package com.thoughtfocus.array.exception.CRUDCollection;

public class Tester {
	public static void main (String[]args) {
		AccountHolderDTO dto = new AccountHolderDTO();
		AHolderDAO dao = new AHolderDAO();
		AddressDTO address = new AddressDTO();
		
		dto.setAccountNumber(548466546);
		dto.setContactNumber(895457545);
		dto.setEmail("holder@gmail.com");
		dto.setIFSC("uti00458");
		dto.setName("Ravi");
		dto.setBalance(1500);
		
		address.setArea("bhavani nagar");
		address.setBuilding("a/56");
		address.setCity("Tirupati");
		address.setLandmark("ragana park");
		address.setPincode(517501);
		address.setState("AndhraPradesh");
		
		AccountHolderDTO dto1 = new AccountHolderDTO();
		AddressDTO address1 = new AddressDTO();
		
		dto1.setName("Surya");
		dto1.setAccountNumber(56978415);
		dto1.setContactNumber(56984152);
		dto1.setEmail("surya@gmail.com");
		dto1.setIFSC("uti0058");
		dto1.setBalance(20000);
		
		address1.setBuilding("25G/A1");
		address1.setArea("ngos colony");
		address1.setLandmark("annarav circle");
		address1.setCity("chennai");
		address1.setPincode(256845);
		address1.setState("TamilNadu");
		
		String save = dao.save(dto);
		String save1 = dao.save(dto1);
		
		AccountHolderDTO deleteByName = dao.deleteByName("Surya");
		System.out.println(deleteByName);
		dao.printAll();
		
		AccountHolderDTO updateByName = dao.updateByName("Surya", "Rohith");
		System.out.println(updateByName);
		dao.printAll();
		
		float currentbalance = dao.balance(548466546);
		System.out.println(currentbalance);
		
		float deposit = dao.deposit(1485, 548466546);
		System.out.println (deposit);
		
		float withdraw = dao.withdraw(1500, 548466546);
		System.out.println(withdraw);
		dao.printAll();
		
	}

	

}
