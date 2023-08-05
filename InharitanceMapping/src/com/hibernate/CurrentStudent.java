package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="Sid")
public class CurrentStudent  extends Student{

private double feebal;
private String timings;
private String trainer;
public CurrentStudent() {
	super();
	// TODO Auto-generated constructor stub
}
public CurrentStudent(int sid, String sname, String semail, int sphone) {
	super(sid, sname, semail, sphone);
	// TODO Auto-generated constructor stub
}
public CurrentStudent(double feebal, String timings, String trainer) {
	super();
	this.feebal = feebal;
	this.timings = timings;
	this.trainer = trainer;
}
public CurrentStudent(String sname, String semail, int sphone, double feebal, String timings, String trainer) {
	super(sname, semail, sphone);
	this.feebal = feebal;
	this.timings = timings;
	this.trainer = trainer;
}
public double getFeebal() {
	return feebal;
}
public void setFeebal(double feebal) {
	this.feebal = feebal;
}
public String getTimings() {
	return timings;
}
public void setTimings(String timings) {
	this.timings = timings;
}
public String getTrainer() {
	return trainer;
}
public void setTrainer(String trainer) {
	this.trainer = trainer;
}

}
