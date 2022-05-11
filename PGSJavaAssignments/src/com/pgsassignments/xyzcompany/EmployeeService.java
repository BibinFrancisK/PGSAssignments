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

//			Connection con = null;
//			try {
//				con = ods.getConnection();
//				Statement stmt = con.createStatement();
//				ResultSet rs = stmt.executeQuery("select * from employee");
//				while (rs.next())
//					System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
//			} catch (SQLException e) {
//				System.out.println(e);
//			} finally {
//				con.close();
//			}

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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
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
					+ "DESN.--" + "AGE--" + "B_SAL");
			while (rs.next())
				System.out.println(rs.getInt(1) + "--" + rs.getString(2) + "--" 
									+ rs.getString(3) + "--" + rs.getInt(4) + "--" + rs.getDouble(5));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public float getTotalSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

}
