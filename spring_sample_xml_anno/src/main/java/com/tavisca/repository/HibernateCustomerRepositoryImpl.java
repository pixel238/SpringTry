package com.tavisca.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tavisca.modal.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();

		Customer customer = new Customer();

		customer.setFirstname("Chaman");
		customer.setLastname("Chowdhary");

		customers.add(customer);

		return customers;

	}
}
