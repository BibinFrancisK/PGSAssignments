package xyzcompany;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import oracle.jdbc.datasource.impl.OracleDataSource;
import xyzcompany.Employee;

public class EmployeeService implements EmployeeDAO {
	
	SqlSessionFactory sqlSessionFactory;
	
	public SqlSessionFactory DBConection(){
		Reader reader = null;
    	try {
			reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    	return sqlSessionFactory;
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
	public void getAllEmployees() {
		System.out.println("CODE--" + "NAME--" 
				+ "DESN.--" + "AGE--" + "TOT_SAL");
		SqlSession sqlSession = DBConection().openSession();
		List<Employee> employeeList = sqlSession.selectList("Employee.getAll");
		Iterator<Employee> itr = employeeList.iterator();
		while(itr.hasNext()) {
			Employee employee = new Employee(itr.next());
			System.out.println(employee.getEcode() + "--" + employee.getEname() + "--" 
					+ employee.getDesignation() + "--" + employee.getAge() + "--" + getTotalSalary(employee.getSalary().getBasic()));
			
		}
	}

	@Override
	public double getTotalSalary(double basicSal) {	
		Salary salary = new Salary(basicSal);
		return (salary.getBasic() + salary.getDa() + salary.getHra());
	}

}
