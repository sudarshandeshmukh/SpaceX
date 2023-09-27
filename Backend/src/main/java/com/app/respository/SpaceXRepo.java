package com.app.respository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.app.entities.SpaceXVehicles;

public interface SpaceXRepo extends JpaRepository<SpaceXVehicles,Long> {
	
	List<SpaceXVehicles> findAll();
	
	
}
