package com.pgsassignments.rec;

public class Salary {
	
	private double basicSalary;
	private double da;
	private double hra;
		
	public Salary(double basicSalary) {
		//super();
		this.basicSalary = basicSalary;
		this.da = 0.25 * basicSalary;
		this.hra = 0.3 * basicSalary;
	}
	
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getDa() {
		return da;
	}
	
//	public void setDa(double da) {
//		this.da = da;
//	}
	
	public double getHra() {
		return hra;
	}

	@Override
	public String toString() {
		return "Salary [basicSalary=" + basicSalary + ", da=" + da + ", hra=" + hra + "]";
	}
	
//	public void setHra(double hra) {
//		this.hra = hra;
//	}
	
	
	
	

}
