package com.thoughtfocus.runner;

import com.thoughtfocus.EngineDAO.EngineDAO;
import com.thoughtfocus.EngineDTO.EngineDTO;
import com.thoughtfocus.vehicalDAO.vehicalDAO;
import com.thoughtfocus.vehicalDTO.vehicalDTO;

public class Runner {
	public static void main(String[] args) {
		vehicalDTO vdto = new vehicalDTO();



		EngineDTO edto = new EngineDTO();



		vdto.setId(3);
		vdto.setVehicleName("triump");
		vdto.setCost(613000);



		vehicalDAO vdao = new vehicalDAO();

		EngineDAO edao =new EngineDAO();



		//vdao.saveDetails(vdto);



		edto.setId(2);
		edto.setCapacity(650);
		edto.setNoOfStrokes(4);
		edto.setVehicle(vdto);

		edao.saveDetails(vdto, edto);



		}

}
