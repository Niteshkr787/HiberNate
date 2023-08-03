package com.collectionMapping;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table (name = "MyStudent")
public class Student {
	@Id 
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "S_id")
private int Sid;
	@Column (name = "S_name")
private String Sname;
	@Column (name = "S_email")
private String Semail;
	@Column (name = "S_phone")
private int  Sphone;
	
	@ElementCollection
	@CollectionTable (name = "mycourse" , joinColumns=@JoinColumn(name="sid"))
	@OrderColumn (name = "traningOrder")
private String[] courses;
	
	@ElementCollection
	@CollectionTable (name = "myskill" , joinColumns = @JoinColumn(name="sid"))
	@OrderColumn (name = "ExpertiesOrder")
	@Column (name = "SkillsName")
private List<String> slills;
	@ElementCollection
	@CollectionTable (name = "mymarks" , joinColumns = @JoinColumn(name="sid"))
	@OrderColumn (name = "MarksOrder")
	@Column (name = "Mymarks")
private List<String> marks;
	
	@ElementCollection
	@CollectionTable (name = "myInterview" , joinColumns = @JoinColumn(name="sid"))
	//@OrderColumn (name = "MarksOrder")
	@Column (name = "CompanyName")
private Set<String > Sinterview;
	
	@ElementCollection
	@CollectionTable (name = "myref" , joinColumns = @JoinColumn(name="sid"))
	@MapKeyColumn (name="refName")
	@Column (name = "refPhone")
private Map<String, Integer> refs;
public Student() {
	super();
	
}
public Student(int sid, String sname, String semail, int sphone, String[] courses, List<String> slills,
		List<String> marks, Set<String> sinterview, Map<String, Integer> refs) {
	super();
	Sid = sid;
	Sname = sname;
	Semail = semail;
	Sphone = sphone;
	this.courses = courses;
	this.slills = slills;
	this.marks = marks;
	Sinterview = sinterview;
	this.refs = refs;
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
public String[] getCourses() {
	return courses;
}
public void setCourses(String[] courses) {
	this.courses = courses;
}
public List<String> getSlills() {
	return slills;
}
public void setSlills(List<String> slills) {
	this.slills = slills;
}
public List<String> getMarks() {
	return marks;
}
public void setMarks(List<String> marks) {
	this.marks = marks;
}
public Set<String> getSinterview() {
	return Sinterview;
}
public void setSinterview(Set<String> sinterview) {
	Sinterview = sinterview;
}
public Map<String, Integer> getRefs() {
	return refs;
}
public void setRefs(Map<String, Integer> refs) {
	this.refs = refs;
}


}
