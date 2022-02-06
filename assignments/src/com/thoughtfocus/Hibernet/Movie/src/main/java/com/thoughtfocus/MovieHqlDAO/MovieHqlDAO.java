package com.thoughtfocus.MovieHqlDAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class MovieHqlDAO {
	public double getBudgetByName(String name) {
		String getBudgetByNameQuery = "SELECT budget FROM MovieDTO WHERE name=:nm";
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = null;
		Double movieDTO = null;
		try {
			session = sessionFactory.openSession();
			Query query;
			query = session.createQuery(getBudgetByNameQuery);
			query.setParameter("nm", name);
			movieDTO = (Double) query.uniqueResult();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
		return movieDTO;

	}

	public Object[] getLanguageAndActorCountById(int id) {
		String getLanguageAndActorCountByIdQuery = "SELECT language,noOfActor FROM MovieDTO WHERE id=:id";
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = null;
		Object[] str = null;
		try {
			session = sessionFactory.openSession();
			Query query;
			query = session.createQuery(getLanguageAndActorCountByIdQuery);
			query.setParameter("id", id);
			str = (Object[]) query.uniqueResult();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
		return str;

	}
	public boolean getColorByNameAndLanguage(String name,String language) {
		String getColorByNameAndLanguageQuery = "SELECT isColor FROM MovieDTO WHERE name=:nm and language=:lan";
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = null;
		Boolean movieDTO = null;
		try {
			session = sessionFactory.openSession();
			Query query;
			query = session.createQuery(getColorByNameAndLanguageQuery);
			query.setParameter("nm", name);
			query.setParameter("lan", language);
			movieDTO = (Boolean) query.uniqueResult();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
				session.close();
				sessionFactory.close();
		}
		return movieDTO;

	}
	public void deleteColorAndActorCount(boolean color,int noOfActor) {
		String deleteColorAndActorCountQuery = "DELETE FROM MovieDTO WHERE isColor=:clr and noOfActor=:act";
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = null;
		Transaction tx = null;
		Query query;
		try {
			cfg = new Configuration();
			cfg.configure();
			sessionFactory = cfg.buildSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			query = session.createQuery(deleteColorAndActorCountQuery);
			query.setParameter("clr",color);
			query.setParameter("act", noOfActor);
			query.executeUpdate();
			
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			 session.close();
				sessionFactory.close();
		}
		return ;
		

	}
	public void deleteById(int id) {
		String deleteByIdQuery = "DELETE FROM MovieDTO WHERE id=:id";
		Configuration cfg = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		Query query;
		try {
			cfg = new Configuration();
			cfg.configure();
			sessionFactory = cfg.buildSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			query = session.createQuery(deleteByIdQuery);
			query.setParameter("id",id);
			query.executeUpdate();
			
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			 session.close();
				sessionFactory.close();
		}
	

	}

}
