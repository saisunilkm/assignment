package com.thoughtfocus.PresidentDAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.thoughtfocus.HibernetUtil.HibernetUtil;
import com.thoughtfocus.PresidentDTO.PresidentDTO;

public class PresidentDAO {
	public void savePresidentDetails(PresidentDTO pdto) {

		Session session = null;
		Transaction transaction = null;
		try {
		session = HibernetUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.persist(pdto);
		transaction.commit();
		}catch (HibernateException e) {
		e.printStackTrace();
		transaction.rollback();
		}finally {
		session.close();
		}
		}

}
