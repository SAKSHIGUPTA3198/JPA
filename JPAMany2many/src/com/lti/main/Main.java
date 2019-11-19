package com.lti.main;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.Author1;
import com.lti.model.Book;

import com.lti.service.BookAuthorService;
import com.lti.service.BookAuthorServiceImpl;

public class Main {
	
	private static BookAuthorService service = null;
	 static{
		 
		 service = new BookAuthorServiceImpl(); 
		
	 }

	public static void main(String[] args) {
		
		List<Book> books = null;
		
		
		
		
		 // books= service.findAllBook();
		  //System.out.println(books);
		  
		 //books = service.findBookByPrice(50,1000);
		  //System.out.println(books);
		  
		 books = service.findBookByAuthorName("sakshi");
		  System.out.println(books);
		  
		 // books = service.findBookByAuthorName("sakshi");
		  //System.out.println(books);
		  
		  
		  
		
		
		    

	}

}
