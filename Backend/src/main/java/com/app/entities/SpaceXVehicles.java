package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity 
@Table(name = "spacex_vehicles") 
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SpaceXVehicles {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "spacex_vehicles_id")
	private Long spacexVehiclesId;
	
	private String vehicleName;
	
	private String vehicleStatus;

	private String vehicleLaunch;
	
	private String vehicleType;

	public SpaceXVehicles(Long spacexVehiclesId, String vehicleName, String vehicleStatus, String vehicleLaunch,
			String vehicleType) {
		super();
		this.spacexVehiclesId = spacexVehiclesId;
		this.vehicleName = vehicleName;
		this.vehicleStatus = vehicleStatus;
		this.vehicleLaunch = vehicleLaunch;
		this.vehicleType = vehicleType;
	}
		
	
	
}
