package com.hibernate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity 
@PrimaryKeyJoinColumn (name="Sid")
public class WeekdayStudent extends CurrentStudent {
private int yop;
private double percentage;
private String qulification;
public WeekdayStudent() {
	super();
	
}
public WeekdayStudent(double feebal, String timings, String trainer) {
	super(feebal, timings, trainer);

}
public WeekdayStudent(int sid, String sname, String semail, int sphone) {
	super(sid, sname, semail, sphone);
	
}
public WeekdayStudent(int yop, double percentage, String qulification) {
	super();
	this.yop = yop;
	this.percentage = percentage;
	this.qulification = qulification;
}

public WeekdayStudent(String sname, String semail, int sphone, double feebal, String timings, String trainer, int yop,
		double percentage, String qulification) {
	super(sname, semail, sphone, feebal, timings, trainer);
	this.yop = yop;
	this.percentage = percentage;
	this.qulification = qulification;
}
public int getYop() {
	return yop;
}
public void setYop(int yop) {
	this.yop = yop;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
public String getQulification() {
	return qulification;
}
public void setQulification(String qulification) {
	this.qulification = qulification;
}

}
