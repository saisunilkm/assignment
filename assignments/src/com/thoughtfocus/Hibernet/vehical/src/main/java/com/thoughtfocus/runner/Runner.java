package com.thoughtfocus.runner;

import com.thoughtfocus.vehicalDAO.vehicalDAO;
import com.thoughtfocus.vehicalDTO.vehicalDTO;

public class Runner {
	public static void main(String[]args) {
		vehicalDAO dao = new vehicalDAO();
		vehicalDTO dto = new vehicalDTO();
		dto.setName("FZ");
		dto.setPrice(150000.00);
		dto.setRegistrationNumber(15454);
		dto.setNoOfGears(5);
		dto.setInsurance(true);
		
		dao.savevehical(dto);
		
//		vehicalDTO vehicalDTO = dao.getVehicalBYId(15454);
//		System.out.println("Name:"+vehicalDTO.getName());
//		System.out.println("Price:"+vehicalDTO.getPrice());
//		System.out.println("No of Gears:"+vehicalDTO.getNoOfGears());
//		System.out.println("RegistrationNumber:"+vehicalDTO.getRegistrationNumber());
		
		
	}

}
