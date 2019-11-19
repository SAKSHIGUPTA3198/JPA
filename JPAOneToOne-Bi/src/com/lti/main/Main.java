package com.lti.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.Address;
import com.lti.model.Student;

public class Main {

	public static void main(String[] args) {
	EntityManagerFactory factory =Persistence.createEntityManagerFactory("JPA");
	EntityManager entityManager = factory.createEntityManager();
	
	Address address = new Address("Mumbai","MH","400706");
	Student student = new Student(40,"sakshi",80);
	

	student.setAddress(address);
	entityManager.getTransaction().begin();
	
   entityManager.persist(student);
   entityManager.persist(address);
   entityManager.getTransaction().commit();
   

	}

}
