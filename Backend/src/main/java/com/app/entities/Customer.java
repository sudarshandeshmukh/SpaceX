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
@Table(name = "customer") 
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Customer {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private Long customerId;
	
	private String email;
	
	@Column(nullable = false) // =>NOT NULL
	private String password;


		
	public Customer( String email, String password ) {
		this.email = email;
		this.password = password;
	}
	
}
