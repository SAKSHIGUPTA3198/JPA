package com.lti.dao;

import javax.persistence.EntityManager;

import com.lti.utils.JpaUtils;

public class DaoImpl {
	
	EntityManager entityManager;
	public DaoImpl(){
		entityManager = JpaUtils.getEntityManager();
	}

}
