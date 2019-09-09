package com.tavisca.repository;

import java.util.List;

import com.tavisca.modal.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}