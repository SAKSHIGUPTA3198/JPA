package com.lti.service;

import java.util.List;

import com.lti.model.Book;

public interface BookAuthorService {
	public List<Book> findAllBook();
    public List<Book> findBookByAuthorName(String name);
    public List<Book> findBookByPrice(double min, double max);
    public List<Book> findAuthorByBookId( long ISBN);
    

}
