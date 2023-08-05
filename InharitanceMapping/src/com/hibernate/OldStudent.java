package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="Sid")
public class OldStudent extends Student {
private double Osalary;
private String OcompanyName;
private String Oemail;
public OldStudent() {
	super();
	// TODO Auto-generated constructor stub
}
public OldStudent(int sid, String sname, String semail, int sphone) {
	super(sid, sname, semail, sphone);
	// TODO Auto-generated constructor stub
}


public OldStudent(String sname, String semail, int sphone, double osalary, String ocompanyName, String oemail) {
	super(sname, semail, sphone);
	Osalary = osalary;
	OcompanyName = ocompanyName;
	Oemail = oemail;
}
public double getOsalary() {
	return Osalary;
}
public void setOsalary(double osalary) {
	Osalary = osalary;
}
public String getOcompanyName() {
	return OcompanyName;
}
public void setOcompanyName(String ocompanyName) {
	OcompanyName = ocompanyName;
}
public String getOemail() {
	return Oemail;
}
public void setOemail(String oemail) {
	Oemail = oemail;
}
public OldStudent(double osalary, String ocompanyName, String oemail) {
	super();
	Osalary = osalary;
	OcompanyName = ocompanyName;
	Oemail = oemail;
}

}
