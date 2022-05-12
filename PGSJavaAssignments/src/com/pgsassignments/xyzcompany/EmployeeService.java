package com.pgsassignments.xyzcompany;

import java.sql.*;
import java.util.List;

import oracle.jdbc.datasource.impl.OracleDataSource;

public class EmployeeService implements EmployeeDAO {
	
	OracleDataSource ods  = null;
	
	public Connection DBConection() throws SQLException {
			OracleDataSource ods = new OracleDataSource();
			ods.setUser("system");
			ods.setPassword("system");
			ods.setDriverType("thin");
			ods.setNetworkProtocol("tcp");
			ods.setURL("jdbc:oracle:thin:@localhost:1521/orcl");
			Connection con = ods.getConnection();
			return con;		

	}

	@Override
	public boolean addEmployee(Employee employee) {
		try {
			PreparedStatement stmt=DBConection().prepareStatement("insert into Employee values(?,?,?,?,?)");  
			stmt.setInt(1, employee.getEcode());
			stmt.setString(2, employee.getEname());
			stmt.setString(3, employee.getDesignation());
			stmt.setInt(4, employee.getAge());
			stmt.setDouble(5, employee.getSalary().getBasic());
			int i = stmt.executeUpdate();  
			if(i == 1) return true; 	
			} catch (SQLException e) {
				System.out.println(e);
			} 
			return false;
	}

	@Override
	public float getMonthlySalary(int ecode) {
		try {
			PreparedStatement stmt = DBConection()
					.prepareStatement("select ename, basic_pay from employee where ecode = ?");
			stmt.setInt(1, ecode);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println("The total salary of " + rs.getString(1) +" :" );
				Salary empSal = new Salary(rs.getDouble(2));
				double totSal = getTotalSalary(empSal.getBasic());
				System.out.println("Basic: " + empSal.getBasic() + " + DA: " 
							+ empSal.getDa() + " + HRA: " + empSal.getHra() + " = " + totSal);			
			}		
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		Connection con = null;
		
		try {
			con = DBConection();
			con.setAutoCommit(true);
			PreparedStatement stmt1 = 
					con.prepareStatement("update employee set ename = ?, designation = ?, age = ? , basic_pay = ? where ecode = ?");

			stmt1.setString(1, employee.getEname());
			stmt1.setString(2, employee.getDesignation());
			stmt1.setInt(3, employee.getAge());
			stmt1.setDouble(4,employee.getSalary().getBasic());
			stmt1.setInt(5, employee.getEcode());
			
			int i = stmt1.executeUpdate();
			if(i == 1) return true; 	
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public boolean deleteEmployee(int ecode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> getAllEmployees() {
		try {
			Statement stmt = DBConection().createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee");
			System.out.println("CODE--" + "NAME--" 
					+ "DESN.--" + "AGE--" + "TOT_SAL");
			while (rs.next())
				System.out.println(rs.getInt(1) + "--" + rs.getString(2) + "--" 
									+ rs.getString(3) + "--" + rs.getInt(4) + "--" + getTotalSalary(rs.getDouble(5)));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public double getTotalSalary(double basicSal) {	
		Salary salary = new Salary(basicSal);
		return (salary.getBasic() + salary.getDa() + salary.getHra());
	}

}
