package com.ibm.customer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.customer.Customer;
import com.ibm.customer.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
//	@GetMapping("/customers")
//	Iterable<Customer> getAllCustomer(){
//		return service.getAllCustomer();
//	}
	
	@PostMapping("/customer")
	void addNewCustomer(@RequestBody Customer theCustomer) {
		service.addNewCustomer(theCustomer);
	}
	
	@PutMapping("/customer/{CustomerId}")
	void updateCustomer(@RequestBody Customer theCustomer) {
		service.updateCustomer(theCustomer);
	}
}
