package xyzcompany;

import java.util.List;

public interface EmployeeDAO {
	
	public boolean addEmployee(Employee employee);
	public float getMonthlySalary(int ecode);
	public boolean updateEmployee(Employee employee);
	public boolean deleteEmployee(int ecode);
	public void getAllEmployees();
	public double getTotalSalary(double basicSal);

}
