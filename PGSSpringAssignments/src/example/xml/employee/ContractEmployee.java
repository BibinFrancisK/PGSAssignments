package example.xml.employee;

public class ContractEmployee implements IEmployee {

	private int empId;
	private String empName;
	private String desig;
	private double basicSal;
	
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	public double calculateSalary(double basicSal) {
		return basicSal + 0.2*basicSal + 5000;
	}
	
	public double getSalary(IEmployee employee) {
		double salary = calculateSalary(employee.getBasicSal());
		return salary;
	}


}
