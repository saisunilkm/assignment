package com.thoughtfocus.vehicalDAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.thoughtfocus.vehicalDTO.vehicalDTO;

public class vehicalDAO {
	public void saveDetails(vehicalDTO vdto) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		try {
		sessionFactory = cfg.buildSessionFactory();
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();



		session.save(vdto);
		transaction.commit();
		} catch (HibernateException e) {
		e.printStackTrace();
		transaction.rollback();



		} finally {
		session.close();
		}
		}

}
