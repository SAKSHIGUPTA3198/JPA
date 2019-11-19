package com.lti.dao;

import java.util.List;

import com.lti.model.Book;

public interface BookDao {
	public List<Book> readAllBook();
	public List<Book> readBookByAuthorName(String name);
    public List<Book> readBookByPrice(double min, double max);
    public List<Book> readAuthorByBookId( long ISBN);
    public void beginTransaction();
	public void commitTransaction();
	public void rollbackTransaction();

}
