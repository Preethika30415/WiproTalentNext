package com.wipro.inheritance;
public class Employee extends Person {
private double annualSalary;
private int yearOfJoining;
private String nationalInsuranceNo;
public Employee(String name,double annualsalary,int yearOfjoining,String nationalinsuranceNo) {
	super(name);
	annualSalary=annualsalary;
	yearOfJoining=yearOfjoining;
	nationalInsuranceNo=nationalinsuranceNo;
}
public double getAnnualSalary() {
	return annualSalary;
}
public void setAnnualSalary(double annualSalary) {
	this.annualSalary = annualSalary;
}
public int getYearOfJoining() {
	return yearOfJoining;
}
public void setYearOfJoining(int yearOfJoining) {
	this.yearOfJoining = yearOfJoining;
}
public String getNationalInsuranceNo() {
	return nationalInsuranceNo;
}
public void setnationalInsuranceNo(String nationalInsuranceNo) {
	this.nationalInsuranceNo = nationalInsuranceNo;
}
}