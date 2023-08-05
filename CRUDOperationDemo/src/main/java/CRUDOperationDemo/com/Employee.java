package CRUDOperationDemo.com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
  int empNo;
  String empName;
  Double empSalary;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
} 
public Employee(int empNo, String empName, Double empSalary) {
	super();
	this.empNo = empNo;
	this.empName = empName;
	this.empSalary = empSalary;
}
public int getEmpNo() {
	return empNo;
}
public void setEmpNo(int empNo) {
	this.empNo = empNo;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public Double getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(Double empSalary) {
	this.empSalary = empSalary;
}
@Override
public String toString() {
	return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSalary=" + empSalary + "]";
}
  
}
