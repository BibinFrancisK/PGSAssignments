package example.annotation.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmployeeClient {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeAnnoConfig.xml");
		
		PermanentEmployee empOne = (PermanentEmployee) context.getBean("pemployee");
		empOne.setEmpId(1001);
		empOne.setEmpName("Jake");
		empOne.setDesig("Trainee");
		empOne.setBasicSal(10000.00);
		System.out.println("The salary of permanent employee " 
							+ empOne.getEmpName() + ": " + empOne.getSalary(empOne));
	
	
		
		ContractEmployee empTwo = (ContractEmployee) context.getBean("cemployee");
		empTwo.setEmpId(2001);
		empTwo.setEmpName("Ryan");
		empTwo.setDesig("Contract worker");
		empTwo.setBasicSal(10000.00);
		System.out.println("The salary of contract employee " 
							+ empTwo.getEmpName() + ": " + empTwo.getSalary(empTwo));
	
		
	
	}

}
