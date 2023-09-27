package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.service.SpaceXService;

@RestController
@RequestMapping("/SpaceX")
@Validated
@CrossOrigin(origins = "http://localhost:3000")
public class SpaceXVehicleController {
	@Autowired
	private SpaceXService service;

	
	@GetMapping
	public ResponseEntity<?> getAllVehicle() {
		return ResponseEntity.status(HttpStatus.OK).body(service.getAllSpaceXVehicles());		
	}
	
}
