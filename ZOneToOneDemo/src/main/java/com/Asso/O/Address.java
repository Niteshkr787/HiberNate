package com.Asso.O;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "MyAddress")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aId;
	@Column(name = "Street", nullable = false, unique = true)
	private String Street;
	@Column(name = "City", nullable = false, unique = true)
	private String City;
	
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String city) {
		super();
		Street = street;
		City = city;
	}
	public Address(int aId, String street, String city) {
		super();
		this.aId = aId;
		Street = street;
		City = city;
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Address [aId=" + aId + ", Street=" + Street + ", City=" + City + "]";
	}
	
   
}
