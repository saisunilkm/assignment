package com.thoughtfocus.Runner;

import com.thoughtfocus.MovieDAO.MovieDAO;
import com.thoughtfocus.MovieDTO.MovieDTO;
import com.thoughtfocus.MovieHqlDAO.MovieHqlDAO;

public class MovieRunner {
	public static void main(String[]args) {
		MovieDTO dto = new MovieDTO();
		
		MovieDAO dao = new MovieDAO();
		
		dto.setId(1);
		dto.setName("Pushpa");
		dto.setLanguage("Telugu");
		dto.setBudget(70.00);
		dto.setNoOfActor(5);
		dto.setColour(true);
		
		//dao.savemovie(dto);
		
		MovieDTO dto1 = new MovieDTO();
		dto1.setId(2);
		dto1.setName("Darling");
		dto1.setLanguage("Telugu");
		dto1.setBudget(100.00);
		dto1.setNoOfActor(9);
		dto1.setColour(false);		
		dao.savemovie(dto1);
		
//		MovieDTO dto2 = new MovieDTO();
//		dto2.setId(2);
//		dto2.setName("Darling");
//		dto2.setLanguage("Telugu");
//		dto2.setBudget(100.00);
//		dto2.setNoOfActor(9);
//		dto2.setColour(false);		
//		dao.savemovie(dto2);
		
		MovieDTO dto3 = new MovieDTO();
		dto3.setId(3);
		dto3.setName("Mirchi");
		dto3.setLanguage("Telugu");
		dto3.setBudget(100.00);
		dto3.setNoOfActor(3);
		dto3.setColour(false);		
		dao.savemovie(dto3);
		
		MovieDTO dto4 = new MovieDTO();
		dto4.setId(4);
		dto4.setName("Bhahuballi1");
		dto4.setLanguage("Telugu");
		dto4.setBudget(105.00);
		dto4.setNoOfActor(50);
		dto4.setColour(true);		
		dao.savemovie(dto4);
		
		MovieDTO dto5 = new MovieDTO();
		dto5.setId(5);
		dto5.setName("Bhahuballi2");
		dto5.setLanguage("Telugu");
		dto5.setBudget(120.00);
		dto5.setNoOfActor(9);
		dto5.setColour(true);		
		dao.savemovie(dto5);
		
		MovieDTO dto6 = new MovieDTO();
		dto6.setId(6);
		dto6.setName("Kalaja");
		dto6.setLanguage("Telugu");
		dto6.setBudget(50.00);
		dto6.setNoOfActor(4);
		dto6.setColour(false);		
		dao.savemovie(dto6);
		
		MovieDTO dto7 = new MovieDTO();
		dto7.setId(7);
		dto7.setName("Chathrapathi");
		dto7.setLanguage("Telugu");
		dto7.setBudget(30.00);
		dto7.setNoOfActor(5);
		dto7.setColour(false);		
		dao.savemovie(dto7);
		
		MovieDTO dto8 = new MovieDTO();
		dto8.setId(8);
		dto8.setName("Chakram");
		dto8.setLanguage("Telugu");
		dto8.setBudget(30.00);
		dto8.setNoOfActor(2);
		dto8.setColour(true);		
		dao.savemovie(dto8);
		
		MovieDTO dto9 = new MovieDTO();
		dto9.setId(9);
		dto9.setName("Sahoo");
		dto9.setLanguage("Telugu");
		dto9.setBudget(100.00);
		dto9.setNoOfActor(55);
		dto9.setColour(true);		
		dao.savemovie(dto9);
	}
	
	
	MovieHqlDAO hql = new MovieHqlDAO();
	System.out.println("Budget:"+ hql.getBudgetByName("Sahoo"));
	Object str[] = hql.getLanguageAndActorCountById(5);
	

}
