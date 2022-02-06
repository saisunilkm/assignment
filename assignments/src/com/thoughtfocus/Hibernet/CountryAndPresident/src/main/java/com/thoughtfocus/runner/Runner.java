package com.thoughtfocus.runner;

import com.thoughtfocus.CountryDTO.CountryDTO;
import com.thoughtfocus.PresidentDAO.PresidentDAO;
import com.thoughtfocus.PresidentDTO.PresidentDTO;
import com.thoughtfocus.PresidentHQLDAO.PresidentHQLDAO;

public class Runner {
	public static void main(String[] args) {



		CountryDTO cdto = new CountryDTO();
		PresidentDTO pdto = new PresidentDTO();



		cdto.setName("Russia");
		cdto.setRegion("Asia");



		PresidentDAO pdao = new PresidentDAO();



		pdto.setName("Putin");
		pdto.setAge(55);
		pdto.setCountry(cdto);



		// pdao.savePresidentDetails(pdto);



		PresidentHQLDAO hql = new PresidentHQLDAO();
		// String country = hql.getCountryNameByPresidentName("Putin");
		// System.out.println(country);

	}
}
