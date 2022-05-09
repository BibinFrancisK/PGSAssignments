//Q34
//not complete

package com.pgsassignments.rec;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class SerializedEmployee {
	
	public static void addEmployee() {
		
	}
	
	public static void main(String[] args) throws Exception {
		List<Employee> empList = new ArrayList<Employee>();
		Scanner scanner = new Scanner(System.in);
		String dateFormat = "dd/MM/yyyy";
		
		Employee emp = new Employee();
		
		System.out.print("Enter employee ID");
		int empId = scanner.nextInt();
		
	
		System.out.println("Enter employee first name");
		String fname = scanner.nextLine();
		
		System.out.println("Enter employee last name");
		String lname = scanner.nextLine();
		
		System.out.println("Enter employee address");
		String address = scanner.nextLine();
		
		System.out.println("Enter contact number");
		long num = scanner.nextLong();
		
		System.out.println("Enter DOB dd/MM/yyyy");
		Date DOB = (new SimpleDateFormat(dateFormat).parse(scanner.nextLine()));
		
		System.out.println("Enter DOH dd/MM/yyyy");
		Date DOH = (new SimpleDateFormat(dateFormat).parse(scanner.nextLine()));
		
		System.out.println("Enter dept. ID");
		int dept_id = scanner.nextInt();
		
		emp.setEmployeeID(empId);
		emp.setFirstName(fname);
		emp.setLastName(lname);
		emp.setAddress(address);
		emp.setContactNo(num);
		emp.setDateOfBirth(DOB);
		emp.setDateOfBirth(DOH);
		emp.setDeptId(dept_id);
		emp.setSalary(null);
		
		empList.add(emp);
		
		FileOutputStream fileOut =
		         new FileOutputStream("/tmp/EmpRec.dat");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(empList);
        out.close();
        fileOut.close();
        System.out.println("Serialized in /tmp/EmpRec.dat");
		
//		System.out.println("Type YES to continue----");
//		System.out.println("Press any other key to exit ----");
//		choice = scanner.nextLine();
	
		
	}

}
