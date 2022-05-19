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
			e.printStackTrace();
		}
    	sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    	return sqlSessionFactory;
	}

	@Override
	public boolean addEmployee(Employee employee) {
		try{
			SqlSession sqlSession = DBConection().openSession();
			sqlSession.insert("Employee.insertEmp", employee);
			sqlSession.commit();
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}			
		return false;

	}

	@Override
	public float getMonthlySalary(int ecode) {
		try {
			SqlSession sqlSession = DBConection().openSession();
			Employee employee = sqlSession.selectOne("Employee.getEmpPay", ecode);
			System.out.println("The total salary of " + employee.getEname() +" :" );
			Salary empSal = new Salary(employee.getBasic_pay());
			double totSal = getTotalSalary(empSal.getBasic());
			System.out.println("Basic: " + empSal.getBasic() + " + DA: " 
					+ empSal.getDa() + " + HRA: " + empSal.getHra() + " = " + totSal);	
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public boolean updateEmployee(Employee employee) {		
		try {
			SqlSession sqlSession = DBConection().openSession();
			int i = sqlSession.update("Employee.updateEmp", employee);
			sqlSession.commit();
			if(i == 1) return true; 		
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteEmployee(int ecode) {
		try {
			SqlSession sqlSession = DBConection().openSession();
			int i = sqlSession.delete("Employee.deleteEmp", ecode);
			sqlSession.commit();
			if(i == 1) return true; 		
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
			
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
