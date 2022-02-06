package com.thoughtfocus.PresidentHQLDAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.thoughtfocus.HibernetUtil.HibernetUtil;

public class PresidentHQLDAO {
	public String getCountryNameByPresidentName(String name) {
		String getcountryname = "SELECT country.cname FROM PresidentDTO WHERE name=:nm";
		Session session = null;
		Query query = null;
		String str = null;

		try {
			session = HibernetUtil.getSessionFactory().openSession();
			query = session.createQuery(getcountryname);
			query.setParameter("nm", name);
			str = (String) query.uniqueResult();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
		return str;

	}
}
