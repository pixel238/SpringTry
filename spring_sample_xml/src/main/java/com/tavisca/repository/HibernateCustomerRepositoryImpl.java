package com.tavisca.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.tavisca.modal.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	@Value("${dbUsername}")
	public String dbUsername;

	public List<Customer> findAll(){
		System.out.println(dbUsername);
		
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		
		customer .setFirstname("Chaman");
		customer.setLastname("Chowdhary");
		
		customers.add(customer);
		
		return customers;
			
	}
}
