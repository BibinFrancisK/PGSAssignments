package xyzcompany;

import java.util.Scanner;

public class UseEmployee {
	
	public static void main(String[] args) {
		int choice = 0;
		EmployeeService service = new EmployeeService();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("EMPLOYEE MANAGEMENT SYSTEM");
		System.out.println("--------------------------");
		System.out.println("Enter your choice: ");
		System.out.println("1. Add a new employee"); //DONE
		System.out.println("2. Calculate monthly salary");  //DONE
		System.out.println("3. Update employee record"); //DONE
		System.out.println("4. Delete employee record"); //DONE USING TRIGGER
		System.out.println("5. List employees along with total salary"); //DONE
		
		try {
		choice = scanner.nextInt();}
		catch(Exception e) {
			System.out.println("Enter a valid choice!\n" + "Error: " + e.getMessage());}
		
		switch (choice) {
		
		case 1:
			//System.out.println("How many employee do you want to add?");
			//int n = scanner.nextInt();
			//Employee empArray[] = new Employee[1];
			Employee emp = null;
			for (int i = 0; i < 1; i++) {
				emp = new Employee();	
				try {
				
				System.out.print("Enter employee code :");
				int ecode = scanner.nextInt();
				if(ecode > 1000 && ecode < 9999) emp.setEcode(ecode);
				else { System.out.println("Employee code must be 4-digit integer!"); System.exit(0);}
				
				System.out.print("Enter employee name :");
				String ename = scanner.next();
				if(ename instanceof String && ename.length() < 21) emp.setEname(ename);
				else { System.out.println("Invalid name!"); System.exit(0);}
				
				System.out.print("Enter employee designation [SS/ SE/ SSE/ SS/ CS only]:");
				String designation = scanner.next();
				if(designation.equals("SS") || designation.equals("SE") || 
						designation.equals("SSE") || designation.equals("SS") || designation.equals("CS"))
				emp.setDesignation(designation);
				else { System.out.println("Please provide a valid designation!"); System.exit(0);}
				
				System.out.print("Enter employee age :");
				int age = scanner.nextInt();
				if(age >= 18 && age <= 80) emp.setAge(age);
				else { System.out.println("Age must be above 18 and below 80"); System.exit(0);}
				
				System.out.print("Enter employee basic salary :");
				float salary = scanner.nextFloat();
				if(salary >= 6000) emp.setBasic_pay(salary);	
				else { System.out.println("Minimum salary is 6000"); System.exit(0); }
				}
				catch(Exception e) { System.out.println("Oops! An error occured\n" + e.getMessage());}
			}
			boolean isAdded = service.addEmployee(emp);
			if(isAdded) System.out.println("Employee added successfully!");
			else { System.out.println("Unable to add employee!"); }		
			break;
			
		case 2:
			Employee empSal = null;
			System.out.println("Enter the e-code of the employee");
			int ecode = scanner.nextInt();
			service.getMonthlySalary(ecode);	
			break;
		case 3:
			Employee employee = null;
			for (int i = 0; i < 1; i++) {
				employee = new Employee();	
				try {
				
				System.out.print("Enter employee code :");
				int empCode = scanner.nextInt();
				if(empCode > 1000 && empCode < 9999) employee.setEcode(empCode);
				else { System.out.println("Invalid e-code!"); System.exit(0);}
				
				System.out.print("Enter updated employee name :");
				String ename = scanner.next();
				if(ename instanceof String && ename.length() < 21) employee.setEname(ename);
				else { System.out.println("Invalid name!"); System.exit(0);}
				
				System.out.print("Enter updated employee designation [SS/ SE/ SSE/ SS/ CS only]:");
				String designation = scanner.next();
				if(designation.equals("SS") || designation.equals("SE") || 
						designation.equals("SSE") || designation.equals("SS") || designation.equals("CS"))
					employee.setDesignation(designation);
				else { System.out.println("Please provide a valid designation!"); System.exit(0);}
				
				System.out.print("Enter updated employee age :");
				int age = scanner.nextInt();
				if(age >= 18 && age <= 80) employee.setAge(age);
				else { System.out.println("Age must be above 18 and below 80"); System.exit(0);}
				
				System.out.print("Enter updated employee basic salary :");
				float salary = scanner.nextFloat();
				if(salary >= 6000) employee.setSalary(new Salary(salary));	
				else { System.out.println("Minimum salary is 6000"); System.exit(0); }
				}
				catch(Exception e) { System.out.println("Oops! An error occured\n" + e.getMessage());}
			}
			boolean isUpdated = service.updateEmployee(employee);
			if(isUpdated) System.out.println("Employee updated successfully!");
			else { System.out.println("Unable to update employee!"); }		
			break;
			
		case 4:
			System.out.println("Enter the e-code of the employee");
			int empCode = scanner.nextInt();
			boolean isDeleted = service.deleteEmployee(empCode);
			if(isDeleted) System.out.println("Employee updated successfully!");
			else { System.out.println("Unable to update employee!"); }		
			break;
			
		case 5:
			service.getAllEmployees();		
			break;
			
		default:
			System.out.println("Enter a valid choice!");
		break;
		
		}
		scanner.close();
		
	}

}
