package com.axelor.service;

import java.util.List;

import com.axelor.domains.ContactDetails;

public interface ContactService {

	void addContact(String fullname,String mobileno);
	
	void updateContact(int cid,String fullname,String mobileno);
	
	List<ContactDetails> getAllcontacts();
	
	void deleteContact(int id);
	
	ContactDetails getContactDetailsById(int id);
	
	
}
