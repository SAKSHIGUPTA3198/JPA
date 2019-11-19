package com.lti.service;

import java.util.List;

import com.lti.dao.BookDaoImpl;

import com.lti.model.Book;

public class BookAuthorServiceImpl  implements BookAuthorService{
	
	BookDaoImpl dao = null;
	public BookAuthorServiceImpl(){
		dao = new BookDaoImpl();
	}
	

	@Override
	public List<Book> findAllBook() {
		return dao.readAllBook();

	}

	@Override
	public List<Book> findBookByAuthorName(String name) {
		return dao.readBookByAuthorName(name);
	
	}

	@Override
	public List<Book> findBookByPrice(double min, double max) {
		return dao.readBookByPrice(min, max);
		
	}

	@Override
	public List<Book> findAuthorByBookId(long ISBN) {
		
		return null;
	}
	
     

}
