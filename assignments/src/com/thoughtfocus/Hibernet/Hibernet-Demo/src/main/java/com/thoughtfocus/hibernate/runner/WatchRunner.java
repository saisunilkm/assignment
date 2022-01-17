package com.thoughtfocus.hibernate.runner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.thoughtfocus.hibernate.dao.WatchDAO;
import com.thoughtfocus.hibernate.dto.WatchDTO;

public class WatchRunner {
	public static void main (String[]args) {
		WatchDTO dto = new WatchDTO();
		WatchDAO dao = new WatchDAO();
		dto.setId(1);
		dto.setBrand("Titan");
		dto.setPrice(5000.00);
		dto.setUnderwarrenty(true);
	}
	
	public void saveWatch(WatchDTO dto) {
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory sessionFactory = cfg.buildSessionFactory();

		Session session = sessionFactory.openSession();

		session.save(dto);
	}

}
