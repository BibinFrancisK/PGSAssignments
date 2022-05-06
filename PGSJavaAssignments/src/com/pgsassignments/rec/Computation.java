package com.pgsassignments.rec;

import java.util.Date;

public interface Computation {
	
	public Salary computeSalary(Employee e);
	public String showPaySlip(Employee e, Date d);
	

}
