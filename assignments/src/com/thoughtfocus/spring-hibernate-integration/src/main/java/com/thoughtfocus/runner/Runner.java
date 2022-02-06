package com.thoughtfocus.runner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thoughtfocus.DTO.MovieDTO;
import com.thoughtfocus.dao.MovieDAO;

public class Runner {
	public static void main (String[]args) {
		MovieDTO movie = new MovieDTO();
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("spring-config.xml");
		MovieDAO bean = container.getBean(MovieDAO.class);
		bean.saveMovie(movie);
		
		movie.setId(1);
		movie.setName("Darling");
		bean.saveMovie(movie);
	}


}
