package com.app.service;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.dto.CustomerLoginDto;

import com.app.entities.Customer;
import com.app.respository.CustomerRepo;


@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private ModelMapper mapper;
	@Autowired
	private CustomerRepo customerRepo;
	

	
	

	@Override
	public Customer getCustomerByEmail(String email) {
		Customer cust=customerRepo.findByEmail(email);
		return cust;
	}

	
	@Override
	public void addCustomer(CustomerLoginDto dto) {
		System.out.println("in service deto---"+dto);
		Customer cust = mapper.map(dto, Customer.class);
		System.out.println(customerRepo.save(cust));
		
	}

	
	
}
