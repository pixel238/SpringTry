package com.tavisca.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.tavisca.modal.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${dbUsername}")
	private String dbUsername;
	
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
