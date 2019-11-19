package com.lti.ui;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.Student;

public class Main {
	public static void main(String[] args) {
	
	 EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA");
	 EntityManager entityManager =  factory.createEntityManager();
	 //Transient
	
	Student student = new Student(11,"gayatri",60);
	student.setStudentName("sak");
	student.setAvgScore(70.0);
	
	entityManager.getTransaction().begin();
	entityManager.persist(student);
	entityManager.getTransaction().commit();
	System.out.println("Student is persisted in db");
	
	entityManager.getTransaction().begin();
	entityManager.remove(student);
	entityManager.getTransaction().commit();
	System.out.println("student is removed from db");
	
	
	
	}

}
