package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity 
@Inheritance (strategy = InheritanceType.JOINED)
public class Student {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
private int Sid;
private String Sname;
private String Semail;
private int Sphone;
public Student() {
	super();
	
}

public Student(String sname, String semail, int sphone) {
	super();
	Sname = sname;
	Semail = semail;
	Sphone = sphone;
}

public Student(int sid, String sname, String semail, int sphone) {
	super();
	Sid = sid;
	Sname = sname;
	Semail = semail;
	Sphone = sphone;
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
public String getSemail() {
	return Semail;
}
public void setSemail(String semail) {
	Semail = semail;
}
public int getSphone() {
	return Sphone;
}
public void setSphone(int sphone) {
	Sphone = sphone;
}
@Override
public String toString() {
	return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Semail=" + Semail + ", Sphone=" + Sphone + "]";
}

}
