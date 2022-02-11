package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {


	public static void main(String[] args) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();		
		Session session = sf.openSession();
		session.beginTransaction();

		Author a1 = new Author("Patrick","p@gmail.com");
		Author a2 = new Author("Manzi","m@gmai.com");
		Author a3 = new Author("Mami","ma@gmai.com");
		Author a4= new Author("Gedeo","g@gmail.com");
		Book b1 = new Book ("Java","Fund",a1);
		Book b2 = new Book ("mysql","de2",a2);
		Book b3 = new Book ("Spring","d3",a3);
		Book b4 = new Book ("C++","d4",a4);
		session.save(b1);
		session.save(b2);
		session.save(b3);
		session.save(b4);
	
		
		
	session.getTransaction().commit();
		session.close();
		
	}

}
