package com.hibernate.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.example.Model.Student;

public class App {

	public static void main(String[] args) {
		
	System.out.println("welcome to hibernate");
	
	Configuration c	=new Configuration();
	c.configure("hibernate.cgf.xml");
	SessionFactory factory = c.buildSessionFactory();
	
	System.out.println(factory);
	System.out.println(factory.isClosed());
	
	Student s1= new Student();
	s1.setId(104);
	s1.setFirstName("vinay");
	s1.setLastName("thakur");
	s1.setEmail("vin@gmail.com");
	
	Session session =factory.openSession();
	
	Transaction tx =session.beginTransaction();
	
	session.save(s1);
	
	tx.commit();
	session.close();

	}

}

