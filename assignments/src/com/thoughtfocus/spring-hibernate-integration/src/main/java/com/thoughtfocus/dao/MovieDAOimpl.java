package com.thoughtfocus.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.thoughtfocus.DTO.MovieDTO;

@Repository
public class MovieDAOimpl implements MovieDAO{
	@Autowired
	private SessionFactory sessionFactory;
	public void saveMovie(MovieDTO dro) {
		
	}
	

}
