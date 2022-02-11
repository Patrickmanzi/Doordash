package com;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Book {

	int id;
	String title;
	String description;
	Author author;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Book(String title, String description, Author author) {
		super();
		this.title = title;
		this.description = description;
		this.author = author;
	}



	@Id
	@GeneratedValue
	@Column(name="Book_Id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="author_id")
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", description=" + description + ", author=" + author + "]";
	}
	
	

}
