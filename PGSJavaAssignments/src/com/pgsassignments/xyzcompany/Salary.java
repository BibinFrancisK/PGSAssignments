package com.pgsassignments.xyzcompany;

public class Salary {

	private double basic;
	private double da;
	private double hra;
	
	public Salary(double basic) {
		this.basic = basic;
		this.da = 0.15 * basic;
		this.hra = 0.2 * basic;
	}
	
	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}
	

	public double getDa() {
		return da;
	}

	public double getHra() {
		return hra;
	}

	@Override
	public String toString() {
		return "Salary [basic=" + basic + ", da=" + da + ", hra=" + hra + "]";
	}
	
	

}
