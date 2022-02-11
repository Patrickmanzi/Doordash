package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Author {

int id;
String name;
String email;
public Author() {
	super();
	// TODO Auto-generated constructor stub
}

public Author(String name, String email) {
	super();
	this.name = name;
	this.email = email;
}
// testGit
@Id
@Column(name="authorId")
@GeneratedValue 
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


@Override
public String toString() {
	return "Author [id=" + id + ", name=" + name + ", email=" + email + "]";
}


}
