package com.Asso.O;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "MyEmployee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "EId" , length = 10 ,nullable = false)
private int Eid;
	@Column(name="eName" , length =20 , nullable = false , unique = true)
private String eName;
	@Column(name="eEmail" , length = 30 , nullable = false , unique = true)
private String  eEmail;
	@OneToOne(fetch = FetchType.LAZY ,  cascade = CascadeType.ALL)
	@JoinColumn(name = "aId")
private Address Address;
	
	
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteEmail() {
		return eEmail;
	}
	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}
	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		Address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String eName, String eEmail, com.Asso.O.Address address) {
		super();
		Eid = eid;
		this.eName = eName;
		this.eEmail = eEmail;
		Address = address;
	}
	public Employee(String eName, String eEmail, com.Asso.O.Address address) {
		super();
		this.eName = eName;
		this.eEmail = eEmail;
		Address = address;
	}
	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", eName=" + eName + ", eEmail=" + eEmail + ", Address=" + Address + "]";
	}


}
