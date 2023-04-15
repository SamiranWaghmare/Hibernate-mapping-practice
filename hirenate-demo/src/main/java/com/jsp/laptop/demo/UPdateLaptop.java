  package com.jsp.laptop.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UPdateLaptop {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sami");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		Laptop l= entityManager.find(Laptop.class, 2);
		l.setPrice(45150);
		entityTransaction.begin();
		entityManager.merge(l);
		entityTransaction.commit();

	}

}
