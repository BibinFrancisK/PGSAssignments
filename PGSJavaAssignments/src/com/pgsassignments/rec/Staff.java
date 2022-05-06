package com.pgsassignments.rec;

import java.util.Date;

public class Staff {
	
	private int staffCode;
	private String staffName;
	private String designation;
	private int age;
	private Date dateOfBirth;
	
	public Staff() {
		//super();
	}

	public int getStaffCode() {
		return staffCode;
	}

	public void setStaffCode(int staffCode) {
		this.staffCode = staffCode;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Staff [staffCode=" + staffCode + ", staffName=" + staffName + ", designation=" + designation + ", age="
				+ age + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	


}
