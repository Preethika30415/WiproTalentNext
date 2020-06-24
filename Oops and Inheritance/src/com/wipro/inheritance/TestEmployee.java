package com.wipro.inheritance;

public class TestEmployee 
{
	public static void main(String[] args) 
	{
		Employee e= new Employee("Preethika",500000,2019,"NRI19276KE");
		e.setAnnualSalary(35000);
		e.setnationalInsuranceNo("DFI23455SE");
		System.out.println("Name of employee is "+e.getName());
		System.out.println("Year of joining is "+e.getYearOfJoining());
		System.out.println("Salary is "+e.getAnnualSalary());
		System.out.println("National Insurance number is "+e.getNationalInsuranceNo());
	}
}
