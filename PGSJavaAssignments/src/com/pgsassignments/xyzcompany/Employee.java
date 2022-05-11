package com.pgsassignments.xyzcompany;

public class Employee {
	
	private int ecode;
	private String ename;
	private String designation;
	private int age;
	private Salary salary;
	
	
	
	public Employee() {
	}


	public Employee(int ecode, String ename, String designation, int age, Salary salary) {
		super();
		this.ecode = ecode;
		this.ename = ename;
		this.designation = designation;
		this.age = age;
		this.salary = salary;
	}


	public int getEcode() {
		return ecode;
	}


	public void setEcode(int ecode) {
		this.ecode = ecode;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Salary getSalary() {
		return salary;
	}


	public void setSalary(Salary salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [ecode=" + ecode + ", ename=" + ename + ", designation=" + designation + ", age=" + age
				+ ", salary=" + salary + "]";
	}
	
	
	
	
	

}
