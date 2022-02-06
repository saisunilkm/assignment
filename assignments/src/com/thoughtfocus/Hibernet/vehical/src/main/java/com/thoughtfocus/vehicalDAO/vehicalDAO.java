package com.thoughtfocus.vehicalDAO;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.thoughtfocus.vehicalDTO.vehicalDTO;

public class vehicalDAO {

	public void savevehical(vehicalDTO dto) {
		Configuration cfg = new Configuration();
		cfg.configure();



		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;



		try {
		sessionFactory = cfg.buildSessionFactory();
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(dto);
		tx.commit();



		} catch (HibernateException e) {
		e.printStackTrace();
		tx.rollback();
		} finally {
		session.close();
		sessionFactory.close();
		}
				
			//session.close();
			//sessionFactory.close();
		}
		
	
	
	public vehicalDTO getVehicalBYId(long registrationNumber) {
		vehicalDTO vehicalDTO = null;
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
       return vehicalDTO;
	}
	
//	public String readVehicalNameByRegistrationNumber(long registrationNumber) {
//		String readData = "SELECT name FROM VehicalDTO WHERE registrationNumber=:reg";
//		Configuration cfg = new Configuration();
//		cfg.configure();
//		SessionFactory sessionFactory = cfg.buildSessionFactory();
//		Session session = null;
//		String str = null;
//		try {
//			session = sessionFactory.openSession();
//			Query query;
//			query = session.createQuery(readData);
//			query.setParameter("reg", registrationNumber);
//			str = (String) query.uniqueResult();
//		}catch(HibernateException e) {
//			e.printStackTrace();
//		}finally {
//			if(session!=null)
//				session.close();
//		}
//		return str;
//		
//		}
//	public Object[] readVehicalNameAndColorByRegistrationNumber(long registrationNumber) {
//		String readData = "SELECT name,color FROM VehicalDTO WHERE registrationNumber=:reg";
//		Configuration cfg = new Configuration();
//		cfg.configure();
//		SessionFactory sessionFactory = cfg.buildSessionFactory();
//		Session session = null;
//		Object str[] = null;
//		try {
//			session = sessionFactory.openSession();
//			Query query;
//			query = session.createQuery(readData);
//			query.setParameter("reg", registrationNumber);
//			str = (Object[]) query.uniqueResult();
//		}catch(HibernateException e) {
//			e.printStackTrace();
//		}finally {
//			if(session!=null)
//				session.close();
//		}
//		return str;
//		
//		}
	
	}


