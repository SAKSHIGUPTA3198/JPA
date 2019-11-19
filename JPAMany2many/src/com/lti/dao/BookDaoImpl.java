package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.lti.model.Author1;
import com.lti.model.Book;

import com.lti.utils.JpaUtils;

public class BookDaoImpl implements BookDao {
	
	private EntityManager entityManager;

	public BookDaoImpl() {
		entityManager = JpaUtils.getEntityManager();
		init();
		
	}
	
	public void init()
	{
		/*
		Book book1 =new Book(123456,"Java Vol-1",569.78);
		Book book2 =new Book(223456,"Cricket Mamories",400.0);
		
		Author1 author1 =new Author1(1,"Cay Horstman");
		Author1 author2 =new Author1(2,"Martin Guptil");
		
		book1.addAuthor1(author1);
		
		book2.addAuthor1(author2);
		book2.addAuthor1(author1);
		
		 entityManager.getTransaction().begin();
		    entityManager.persist(book1);
		    entityManager.persist(book2);
		    entityManager.getTransaction().commit(
		
		*/
		
		
		List<Book> books = null;
		Book book = new Book();
		
		
		book.setISBN(2258963);
		book.setTitle("abc");
		book.setPrice(965);
		

		 entityManager.getTransaction().begin();
		    //entityManager.persist(author);
		    entityManager.persist(book);
		    entityManager.getTransaction().commit();
		
		Author1 author = new Author1();
		
		author.setId(1);
		author.setName("sakshi");
		
		author.addBook(book);
	
		
		 // books= service.findAllBook();
		  //System.out.println(books);
		  
		 // books = service.findBookByPrice(50,1000);
		 // System.out.println(books);
		  
		 
			 entityManager.getTransaction().begin();
			    entityManager.persist(author);
			    entityManager.persist(book);
			    entityManager.getTransaction().commit();
	}

	@Override
	public List<Book> readAllBook() {
		//entityManager.clear();
		String jpql = "Select b From Book b";
		TypedQuery<Book> tquery = entityManager.createQuery(jpql, Book.class);
		List<Book> list = tquery.getResultList();
		return list;
		
		
	}

	@Override
	public List<Book> readBookByAuthorName(String name) {
		String jpql = "Select b From Book b Inner Join b.authors a Where a.name=:name ";
		TypedQuery<Book> tquery = entityManager.createQuery(jpql, Book.class);
		tquery.setParameter("name", name );
		return tquery.getResultList();
		
		
	}

	@Override
	public List<Book> readBookByPrice(double min, double max) {
		String jpql = "Select b From Book b where b.price between :min And :max" ;
		
		TypedQuery<Book> tquery = entityManager.createQuery(jpql, Book.class);
		//List<Book> list = tquery.getResultList();
		tquery.setParameter("min", min );
		tquery.setParameter("max", max);
		
		
		return tquery.getResultList();
		
		
	}

	@Override
	public List<Book> readAuthorByBookId(long ISBN) {
		String jpql = "Select b From Books b where b.ISBN =:ISBN ";
		TypedQuery<Book> tquery = entityManager.createQuery(jpql, Book.class);
		tquery.setParameter("ISBN", ISBN);
		
		List<Book> list = tquery.getResultList();
		return list;
		
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
		
	}

	@Override
	public void rollbackTransaction() {
		entityManager.getTransaction().rollback();
		
		
	}
	

}
