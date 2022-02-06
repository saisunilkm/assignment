package com.thoughtfocus.EngineDAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.thoughtfocus.EngineDTO.EngineDTO;
import com.thoughtfocus.vehicalDTO.vehicalDTO;

public class EngineDAO {
	public void saveDetails(vehicalDTO vdto, EngineDTO edto) {
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
		session.save(edto);



		transaction.commit();
		} catch (HibernateException e) {
		e.printStackTrace();
		transaction.rollback();



		} finally {
		session.close();
		}
		}

}
