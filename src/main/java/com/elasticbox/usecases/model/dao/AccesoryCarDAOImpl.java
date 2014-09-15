package com.elasticbox.usecases.model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.elasticbox.usecases.model.entities.Accesory;

@Repository
public class AccesoryCarDAOImpl implements AccesoryDAO {

	private static final Logger logger = LoggerFactory.getLogger(AccesoryCarDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Accesory> getAllAccesoriesByCarId(long carId) {
		Session session = this.sessionFactory.getCurrentSession();
		List<Accesory> accesoryList = session.createQuery("from Accesory a where a.car.id=" + carId).list();
		for (Accesory a:accesoryList) {
			logger.info("Accesory in list::" + a);
		}
		return accesoryList;
	}

}
