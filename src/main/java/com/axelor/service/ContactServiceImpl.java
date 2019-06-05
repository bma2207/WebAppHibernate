package com.axelor.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.axelor.domains.ContactDetails;

public class ContactServiceImpl implements ContactService {

	public EntityManager getConnection() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("persistence");
		EntityManager em=emf.createEntityManager();
		return em;
	}
	
	
	@Override
	public void addContact(ContactDetails contactDetails) {
		
		EntityManager entityManager=getConnection();
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(contactDetails);
		
		entityManager.getTransaction().commit();

	}


	@Override
	public List<ContactDetails> getAllcontacts() {
		
		EntityManager entityManager=getConnection();
		
		Query query=entityManager.createQuery("from ContactDetails");
		
		List contactList=query.getResultList();
		
		return contactList;
	}

}
