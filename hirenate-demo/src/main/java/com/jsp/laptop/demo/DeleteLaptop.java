package com.jsp.laptop.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteLaptop {
	public static void main(String[] args) {
		  EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sami");
		  EntityManager entityManager=entityManagerFactory.createEntityManager();
		  EntityTransaction entityTransaction=entityManager.getTransaction();
		  
		 //find by id
		Laptop l1 = entityManager.find(Laptop.class, 6);
		
		entityTransaction.begin();
		entityManager.remove(l1);
		entityTransaction.commit();
		System.out.println(l1.getBrand());
	}

}
