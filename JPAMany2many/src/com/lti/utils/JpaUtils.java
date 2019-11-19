package com.lti.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtils {
	private static EntityManagerFactory factory;
	private static EntityManager entityManager;
	static{
		factory = Persistence.createEntityManagerFactory("JPA");
	}
	public static EntityManager getEntityManager(){
		if(entityManager ==null || ! entityManager.isOpen())
		entityManager =  factory.createEntityManager();
		return entityManager;
	}

}
