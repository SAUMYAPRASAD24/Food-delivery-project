package com.ibm.customer.dao;

import org.springframework.data.repository.CrudRepository;

import com.ibm.customer.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
