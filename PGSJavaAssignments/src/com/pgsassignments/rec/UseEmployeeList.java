//Q33

package com.pgsassignments.rec;

import java.util.Date;

public class UseEmployeeList {
	
	public static void main(String[] args) {
		
		EmployeeList empList = new EmployeeList();
		
		ContractEmployee emp1 = new ContractEmployee
				(101, "Bibin", "Francis", "KL, KTM", 012345, new Date(1996,3,1), new Date(2016,3,1), 
				1001, new Salary(25000), 25);
		ContractEmployee emp2 = new ContractEmployee
				(102, "Ryan", "Philip", "BGL, KTK", 012345, new Date(1997,3,1), new Date(2017,3,1), 
				1002, new Salary(15000), 20);
		
		empList.addEmployee(emp1);
		empList.addEmployee(emp2);
		
		System.out.println(empList.getEmployee(101));
		System.out.println(empList.getTotalEmployees());
	}

}
