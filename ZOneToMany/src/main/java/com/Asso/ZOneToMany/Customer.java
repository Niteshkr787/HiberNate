package com.Asso.ZOneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "MyCustomer")
public class Customer {
	@Id
	private int cId;
	@Column(name = "cName")
	private String cName;
	@Column(name = "cCity")
	private String cCity;
	
	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    private List<Order> order;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Customer(int cId, String cName, String cCity, List<Order> order) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cCity = cCity;
		this.order = order;
	}



	

	

	public Customer(int cId, String cName, String cCity) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cCity = cCity;
	}



	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcCity() {
		return cCity;
	}

	public void setcCity(String cCity) {
		this.cCity = cCity;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", cCity=" + cCity + ", order=" + order + "]";
	}

}
