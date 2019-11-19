package com.lti.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.Author;


public class Main {

	public static void main(String[] args) {
		Author author = new Author(1,"sakshi","rajesh","gupta",9632);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA1");
		EntityManager entityManager =  factory.createEntityManager();
		 entityManager.getTransaction().begin();
		 entityManager.persist(author);
		 entityManager.getTransaction().commit();
		 System.out.println("author object saved");
		 
		 System.out.println(" after saving author object saved");
		 
		 Author author2 = entityManager.find(Author.class,author.getAuthorId());
		 System.out.println(author2);
		 
		 author2.setPhoneNo(36985);
		 System.out.println("after update author object");
		 entityManager.getTransaction().begin();
		 entityManager.merge(author2);
		 entityManager.getTransaction().commit();
		 
		 author2 = entityManager.find(Author.class,author.getAuthorId());
		 System.out.println(author2);
		 System.out.println("after remove author object");
		 entityManager.getTransaction().begin();
		 entityManager.remove(author2);
		 entityManager.getTransaction().commit();
		 author2 = entityManager.find(Author.class, author.getAuthorId());
		 System.out.println(author2);
		 
		
		

	}

}
