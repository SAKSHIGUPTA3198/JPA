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
@Table(name="Books")
public class Book implements Serializable {
	@Id
	private long ISBN;
	private String title;
	private double price;
	@ManyToMany(mappedBy="books")
	private Set<Author1> authors =  new HashSet<>();
	
	
	public Book() {
		super();
	}
	public Book(long iSBN, String title, double price) {
		super();
		ISBN = iSBN;
		this.title = title;
		this.price = price;
	}
	public long getISBN() {
		return ISBN;
	}
	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Author [ISBN=" + ISBN + ", title=" + title + ", price=" + price + "]";
	}
	

}
