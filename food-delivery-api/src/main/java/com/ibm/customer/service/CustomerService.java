package com.ibm.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.customer.Customer;
import com.ibm.customer.dao.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository repo;
	
//	Iterable<Customer> getAllCustomers(){
//		return repo.findAll();
//	}
	
	public void addNewCustomer(Customer theCustomer) {
		repo.save(theCustomer);
	}
	
	public void updateCustomer(Customer theCustomer) {
		repo.save(theCustomer);
	}
	
}
