package com.tavisca.repository;

import java.util.ArrayList;
import java.util.List;

import com.tavisca.modal.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		
		customer .setFirstname("Chaman");
		customer.setLastname("Chowdhary");
		
		customers.add(customer);
		
		return customers;
			
	}
}
