package com.jsp.bank.branch;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sami");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Bank bank=new Bank();
		bank.setName("SBI");
		
		
		Branch branch1=new Branch();
		branch1.setName("SBI-Vashi");
		branch1.setIFSC("SBI89689");
		
		Branch branch2=new Branch();
		branch2.setName("SBI-Panvel");
		branch2.setIFSC("SBI125");
		
		Branch branch3=new Branch();
		branch3.setName("SBI-Ulwe");
		branch3.setIFSC("SBI2737");
		
		ArrayList<Branch> branchs=new ArrayList<Branch>();
		branchs.add(branch1);
		branchs.add(branch2);
		branchs.add(branch3);
		
		bank.setBranchs(branchs);
		branch1.setBank(bank);
		branch2.setBank(bank);
		branch3.setBank(bank);
		
		
	    entityTransaction.begin();
	    entityManager.persist(bank);
	    entityManager.persist(branch1);
	    entityManager.persist(branch2);
	    entityManager.persist(branch3);
	    entityTransaction.commit();
	    

	}

}
