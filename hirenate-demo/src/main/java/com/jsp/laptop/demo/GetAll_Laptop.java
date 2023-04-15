package com.jsp.laptop.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAll_Laptop {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sami");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String sql="SELECT s FROM Laptop s";
		Query query =entityManager.createQuery(sql);
		 
	    List<Laptop> laptops	=query.getResultList();
	    for (Laptop l : laptops) {
			System.out.println(l.getId());
			System.out.println(l.getBrand());
			System.out.println(l.getPrice());
			System.out.println("=========================");
			
		}
		

	}

}
