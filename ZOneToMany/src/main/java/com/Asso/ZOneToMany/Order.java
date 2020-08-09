package com.Asso.ZOneToMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "Myorder")
public class Order {

	@Id
	private int oId;
	private String oName;
	private String oAddress;
	@ManyToOne
	//@JoinColumn(name = "cId")
	private Customer customer;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(String oName, String oAddress, Customer customer) {
		super();
		this.oName = oName;
		this.oAddress = oAddress;
		this.customer = customer;
	}

	public Order(int oId, String oName, String oAddress) {
		super();
		this.oId = oId;
		this.oName = oName;
		this.oAddress = oAddress;
	}

	public Order(String oName, String oAddress) {
		super();
		this.oName = oName;
		this.oAddress = oAddress;
	}

	public Order(int oId, String oName, String oAddress, Customer customer) {
		super();
		this.oId = oId;
		this.oName = oName;
		this.oAddress = oAddress;
		this.customer = customer;
	}

	public int getoId() {
		return oId;
	}

	public void setoId(int oId) {
		this.oId = oId;
	}

	public String getoName() {
		return oName;
	}

	public void setoName(String oName) {
		this.oName = oName;
	}

	public String getoAddress() {
		return oAddress;
	}

	public void setoAddress(String oAddress) {
		this.oAddress = oAddress;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order [oId=" + oId + ", oName=" + oName + ", oAddress=" + oAddress + ", customer=" + customer + "]";
	}

}
