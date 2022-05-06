package com.pgsassignments.rec;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;

public class Employee implements Computation{
	
	//Data validation needs to be done
	//UseEmployee class needs to be created
	
	private int employeeID;
	private String firstName;
	private String lastName;
	private String address;
	private long contactNo;
	private Date dateOfBirth;
	private Date dateOfHire;
	private int deptId;
	private Salary salary;
	
	public Employee(int employeeID, String firstName, String lastName, String address, long contactNo, Date dateOfBirth,
			Date dateOfHire, int deptId, Salary salary) {
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.contactNo = contactNo;
		this.dateOfBirth = dateOfBirth;
		this.dateOfHire = dateOfHire;
		this.deptId = deptId;
		this.salary = salary;
	}

	public Employee() {
		//super();
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
			this.employeeID = employeeID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) throws EmployeeException {
		if(firstName.length() == 0) throw new EmployeeException();
		else this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) throws EmployeeException {
		if(lastName.length() == 0) throw new EmployeeException();
		else this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfHire() {
		return dateOfHire;
	}

	public void setDateOfHire(Date dateOfHire) {
		this.dateOfHire = dateOfHire;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	
	//************************************
	// Custom methods
	
	public int calcExperience() {
		LocalDate currDate = LocalDate.now();
		LocalDate dateHired = LocalDate.parse((CharSequence) dateOfHire);
		int yearsOfExp = dateHired.until(currDate).getYears();
		return yearsOfExp;		
	}
	
	public int calcAge() {
		LocalDate currDate = LocalDate.now();
		LocalDate birthDate = LocalDate.parse((CharSequence) dateOfBirth);
		int age = birthDate.until(currDate).getYears();
		return age;		
	}
	
	public LocalDate calcRetirementDate() {	
		LocalDate retirmentDate = LocalDate.parse((CharSequence) dateOfBirth).plusYears(58);		
		return retirmentDate;
	} 
	
	public boolean probationStatus() {
		if(calcExperience() > 1)
			return true;		
		return false;
	}

	@Override
	public Salary computeSalary(Employee e) {
		return e.salary;
	}

	@Override
	public String showPaySlip(Employee e, Date d) {
		return "Payslip for "+ d.toString()
		+"\nEmployeeID: " + e.employeeID
		+"\nName: " + e.firstName +" "+ e.lastName
		+"\nDeptID: " + e.deptId
		+"\nSalary: "+"\t\tBasic:  "+ e.salary.getBasicSalary() + "\t\tHRA:  " + e.salary.getHra() + "\t\tDA:  " + e.salary.getHra()
		;
	}

	public String compareExperience(Employee e1, Employee e2) {
		if(e1.dateOfHire.compareTo(e2.dateOfHire) < 0)
			return e1.firstName + "  " + e1.lastName +" is more experienced";
		else if (e1.dateOfHire.compareTo(e2.dateOfHire) > 0)
			return e2.firstName + "  " + e2.lastName +" is more experienced";
		else if (e1.dateOfHire.compareTo(e2.dateOfHire) == 0)
			return "Both are equally experienced";
		return "Something went wrong!";
	}
	

}
