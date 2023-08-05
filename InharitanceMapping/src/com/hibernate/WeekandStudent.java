package com.hibernate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn (name="Sid")
public class WeekandStudent extends CurrentStudent {
private double wesalary;
private String weCompany;
private String weemail;
public WeekandStudent() {
	super();
	// TODO Auto-generated constructor stub
}

public WeekandStudent(String sname, String semail, int sphone, double feebal, String timings, String trainer,
		double wesalary, String weCompany, String weemail) {
	super(sname, semail, sphone, feebal, timings, trainer);
	this.wesalary = wesalary;
	this.weCompany = weCompany;
	this.weemail = weemail;
}

public double getWesalary() {
	return wesalary;
}

public void setWesalary(double wesalary) {
	this.wesalary = wesalary;
}

public String getWeCompany() {
	return weCompany;
}

public void setWeCompany(String weCompany) {
	this.weCompany = weCompany;
}

public String getWeemail() {
	return weemail;
}

public void setWeemail(String weemail) {
	this.weemail = weemail;
}

public WeekandStudent(int sid, String sname, String semail, int sphone) {
	super(sid, sname, semail, sphone);
	// TODO Auto-generated constructor stub
}
public WeekandStudent(String sname, String semail, int sphone, double feebal, String timings, String trainer) {
	super(sname, semail, sphone, feebal, timings, trainer);
	// TODO Auto-generated constructor stub
}
public WeekandStudent(double wesalary, String weCompany, String weemail) {
	super();
	this.wesalary = wesalary;
	this.weCompany = weCompany;
	this.weemail = weemail;
}

}
