package com.lti.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="Authors")
public class Author1 implements Serializable {
	@Id
	private int id;
	private String name;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="AuthorBook",
	            joinColumns={@JoinColumn(name="id")},
	            inverseJoinColumns={@JoinColumn(name="ISBN")})
	private Set<Book> books = new HashSet<>();
	
	

	public Author1() {
		super();
	}
	public Author1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void addBook(Book book){
		books.add(book);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]";
	}
	

}
