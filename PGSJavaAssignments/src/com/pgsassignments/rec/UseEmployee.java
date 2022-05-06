package com.pgsassignments.rec;

import java.util.Date;

public class UseEmployee {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Employee e1 = new Employee(
				101,
				"Bibin",
				"Francis",
				"KTM, KL",
				123456789,
				new Date(1996,3,1),
				new Date(2022,1,1),
				1001,
				new Salary(85000.00)				
				);
		
		Employee e2 = new Employee(
				102,
				"Dylan",
				"Matthew",
				"EKM, KL",
				987654432,
				new Date(1995,9,8),
				new Date(2015,2,1),
				1005,
				new Salary(65000.00)				
				);

		
		Employee e3 = new Employee(
				103,
				"Ryan",
				"Philip",
				"BAN, KT",
				56789321,
				new Date(1993,4,2),
				new Date(2017,3,5),
				1003,
				new Salary(40000.00)				
				);

		//Checking the methods
		//System.out.println("Experience of " + e1.getFirstName() + " : " + e1.calcExperience());
		//System.out.println("Age of " + e1.getFirstName() + " : " + e1.calcAge());
		//System.out.println("Retirement date of " + e1.getFirstName() + " : " + e1.calcRetirementDate());
		//System.out.println("Is " + e1.getFirstName() + " on probation? : " + e1.probationStatus());
		System.out.println("Salary of " + e1.getFirstName() + " : \n" + e1.computeSalary(e1));
		System.out.println("-------------------------------------------------");
		System.out.println(e1.showPaySlip(e1, new Date(2022-01-01)));
		System.out.println(e1.compareExperience(e1, e2));
		
	}
	
	

}
