package com.jtc.HiberNate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table (name = "Student22")
public class Student {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
private int Sid;
private String Sname;
private long Sphone;
private String Scity;
private  String SAddress;
private Certificate certi;
//private List<Student> course;
public Student() {
	super();
	
}
public Student(int sid, String sname, long sphone, String scity, String sAddress, Certificate certi) {
	super();
	Sid = sid;
	Sname = sname;
	Sphone = sphone;
	Scity = scity;
	SAddress = sAddress;
	this.certi = certi;
}
public int getSid() {
	return Sid;
}
public void setSid(int sid) {
	Sid = sid;
}
public String getSname() {
	return Sname;
}
public void setSname(String sname) {
	Sname = sname;
}
public long getSphone() {
	return Sphone;
}
public void setSphone(long sphone) {
	Sphone = sphone;
}
public String getScity() {
	return Scity;
}
public void setScity(String scity) {
	Scity = scity;
}
public String getSAddress() {
	return SAddress;
}
public void setSAddress(String sAddress) {
	SAddress = sAddress;
}
public Certificate getCerti() {
	return certi;
}
public void setCerti(Certificate certi) {
	this.certi = certi;
}
@Override
public String toString() {
	return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Sphone=" + Sphone + ", Scity=" + Scity + ", SAddress="
			+ SAddress + ", certi=" + certi + "]";
}


}
