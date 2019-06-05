package com.axelor.service;

import java.util.List;

import com.axelor.domains.ContactDetails;

public interface ContactService {

	void addContact(ContactDetails contactDetails);
	
	List<ContactDetails> getAllcontacts();
	
}
