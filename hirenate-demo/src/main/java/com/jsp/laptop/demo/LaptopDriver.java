package com.jsp.laptop.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class LaptopDriver {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sami");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
	     Laptop laptop=new Laptop();
	     laptop.setBrand("ASUS");
	     laptop.setPrice(80000);
	     entityTransaction.begin();
	     entityManager.persist(laptop);

	     entityTransaction.commit();

	}

}
