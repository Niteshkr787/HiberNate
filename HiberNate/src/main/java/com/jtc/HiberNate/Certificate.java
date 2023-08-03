package com.jtc.HiberNate;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Entity
@Embeddable
public class Certificate {
private int RollNo; 
private String Cname;
private int duration;
public Certificate() {
	super();
	// TODO Auto-generated constructor stub
}
public Certificate(int rollNo, String cname, int duration) {
	super();
	RollNo = rollNo;
	Cname = cname;
	this.duration = duration;
}
public int getRollNo() {
	return RollNo;
}
public void setRollNo(int rollNo) {
	RollNo = rollNo;
}
public String getCname() {
	return Cname;
}
public void setCname(String cname) {
	Cname = cname;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}


}
