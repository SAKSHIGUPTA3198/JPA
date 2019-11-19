package com.lti.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.Student;

public class Main {
	public static void main(String[] args) {
		Student student = new Student(6,"Sakshi",60.5);
		//JPA Api
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA");
		 EntityManager entityManager =  factory.createEntityManager();
		 entityManager.getTransaction().begin();
		 entityManager.persist(student);
		 entityManager.getTransaction().commit();
		 System.out.println("student object saved");
		 
		 System.out.println(" after saving Student object saved");
		 
		 Student student2 = entityManager.find(Student.class,student.getRollNumber());
		 System.out.println(student2);
		 
		 student2.setAvgScore(65.5);
		 System.out.println("after update student object");
		 entityManager.getTransaction().begin();
		 entityManager.merge(student2);
		 entityManager.getTransaction().commit();
		 
		 student2 = entityManager.find(Student.class,student.getRollNumber());
		 System.out.println(student2);
		 System.out.println("after remove student object");
		 entityManager.getTransaction().begin();
		 entityManager.remove(student2);
		 entityManager.getTransaction().commit();
		 student2 = entityManager.find(Student.class, student.getRollNumber());
		 System.out.println(student2);
		 
	}

}
