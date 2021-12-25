package com.thoughtfocus.array.exception.encapsulationarray.crudOperationPractical;

public class Tester {
	public static void main(String[] args) {
		MobileDAO mobiledao = new MobileDAO();
		
		MobileDTO mobiledto = new MobileDTO();
		mobiledto.setBrandName("Redmi");
		mobiledto.setMobileID(58745);
		mobiledto.setMemory(64);
		mobiledto.setNoOfCamera(2);
		mobiledto.setPrice(8000.00);
		mobiledto.setSerialNumber(458894562);
		
		MobileDTO mobiledto1 = new MobileDTO();
		mobiledto1.setBrandName("OnePluse");
		mobiledto1.setMemory(128);
		mobiledto1.setMobileID(5896);
		mobiledto1.setModelName("T series");
		mobiledto1.setNoOfCamera(4);
		mobiledto1.setPrice(35000.00);
		mobiledto1.setSerialNumber(458745652);
		
		mobiledao.getAll();
		try {
			mobiledao.getAllByBrandName("OnePluse");
		}
		catch(DeleteByMobileIDException me) {
			me.getMessage();
		}
		
		mobiledao.UpdateBySerialNumber(458745652, 458789450);
		mobiledao.getAll();
		
		mobiledao.deleteByMobileID(58745);
		mobiledao.getAll();
		
	}

}
