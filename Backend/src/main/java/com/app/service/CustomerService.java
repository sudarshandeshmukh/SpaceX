package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.dto.CustomerLoginDto;

import com.app.entities.Customer;

public interface CustomerService {
		
	Customer getCustomerByEmail(String email);
		
	void addCustomer(CustomerLoginDto dto);

}
