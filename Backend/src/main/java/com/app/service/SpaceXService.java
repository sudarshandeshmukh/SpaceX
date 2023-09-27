package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.dto.CustomerLoginDto;

import com.app.entities.Customer;
import com.app.entities.SpaceXVehicles;

public interface SpaceXService {
		
		
	List<SpaceXVehicles> getAllSpaceXVehicles();

}
