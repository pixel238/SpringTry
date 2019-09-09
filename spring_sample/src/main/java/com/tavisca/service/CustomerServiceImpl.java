package com.tavisca.service;

import java.util.List;

import com.tavisca.modal.Customer;
import com.tavisca.repository.CustomerRepository;
import com.tavisca.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
}
