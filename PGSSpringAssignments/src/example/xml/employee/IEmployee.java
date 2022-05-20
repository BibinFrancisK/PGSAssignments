package example.xml.employee;

public interface IEmployee {
	
	public void setEmpId(int empid);
	public int getEmpId();
	
	public void setEmpName(String empName);
	public String getEmpName();
	
	public void setDesig(String desig);
	public String getDesig();
	
	public void setBasicSal(double basicSal);
	public double getBasicSal();
	
	public double calculateSalary(double basicSal);
	public double getSalary(IEmployee employee);

}
