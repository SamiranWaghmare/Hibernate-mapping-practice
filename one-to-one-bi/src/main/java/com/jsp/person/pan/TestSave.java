package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sami");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person person = new Person();
		person.setName("santy");
		person.setEmail("santy@mail.com");
	
		
		Pan pan = new Pan();
		pan.setGst_number("dfs324");
		pan.setPerson(person);
		person.setPan(pan);
		
		et.begin();
		em.persist(person);
		em.persist(pan);
		et.commit();
		
		
	}

}
