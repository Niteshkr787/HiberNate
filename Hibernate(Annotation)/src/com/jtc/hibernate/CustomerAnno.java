package com.jtc.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name="CustomerA")
public class CustomerAnno {
	
	@Id
	//@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column (name="cid")
	private int cid;
	
	@Column (name="cname")
	private String cnmae;
	
	@Column (name="email")
	private String email;
	
	@Column (name="phone")
	private long phone;
	
	@Column (name="city")
	private String city;
	
	@Column (name="bal")
	private double bal;

	

	
	public CustomerAnno( int cid , String cnmae, String email, long phone, String city, double bal) {
		
		this.cid = cid;
		this.cnmae = cnmae;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.bal = bal;
	}


	


	

	}


