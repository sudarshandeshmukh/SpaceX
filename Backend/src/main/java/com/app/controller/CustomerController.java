package com.app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.CustomerLoginDto;
import com.app.entities.Customer;
import com.app.service.CustomerService;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping("/Customer")
@Validated
@CrossOrigin(origins = "http://localhost:3000")
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	
	@PostMapping("/getCustomer")
	public ResponseEntity<?> customerByEmail(@RequestBody CustomerLoginDto dto) {
		System.out.println("in controller--------"+dto);
		Customer cust=customerService.getCustomerByEmail(dto.getEmail());
		System.out.println("in controller cuts--------"+cust);
		if(cust!=null &&  cust.getPassword().equals(dto.getPassword()))
			return ResponseEntity.status(HttpStatus.OK).body("Valid credentials");
		return ResponseEntity.status(HttpStatus.OK).body("invalid");		
	}
	
	@PostMapping("/addCutomer")
	public ResponseEntity<?> addCustomer(@RequestBody CustomerLoginDto dto) {
		System.out.println("in controller--------"+dto);
		customerService.addCustomer(dto);
		return ResponseEntity.status(HttpStatus.CREATED).build();		
	}
	
}
