package com.app.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.SpaceXVehicles;
import com.app.respository.SpaceXRepo;


@Service
@Transactional
public class SpaceXServiceImpl implements SpaceXService{
	@Autowired
	private SpaceXRepo repo;
	
	@Override
	public List<SpaceXVehicles> getAllSpaceXVehicles() {
		return repo.findAll();
	}


	
	
}
