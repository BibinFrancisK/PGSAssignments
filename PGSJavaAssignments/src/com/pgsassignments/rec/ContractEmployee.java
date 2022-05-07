//Q33

package com.pgsassignments.rec;

import java.util.Date;

public class ContractEmployee extends Employee {
	
	private double wage;
	
	public ContractEmployee(int employeeID, String firstName, String lastName, String address, long contactNo,
			Date dateOfBirth, Date dateOfHire, int deptId, Salary salary, double wage) {
		super(employeeID, firstName, lastName, address, contactNo, dateOfBirth, dateOfHire, deptId, salary);
		this.wage = wage;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}
	
	
	
	

}
