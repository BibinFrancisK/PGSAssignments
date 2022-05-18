package xyzcompany;

public class Employee {
	
	private int ecode;
	private String ename;
	private String designation;
	private int age;
	private Salary salary;
	
	private double basic_pay;
	
	
	
	public Employee() {
	}


	public Employee(int ecode, String ename, String designation, int age, Salary salary) {
		super();
		this.ecode = ecode;
		this.ename = ename;
		this.designation = designation;
		this.age = age;
		this.salary = salary;
	}
	

	
	
	public Employee(int ecode, String ename, String designation, int age, double basic_pay) {
		super();
		this.ecode = ecode;
		this.ename = ename;
		this.designation = designation;
		this.age = age;
		this.basic_pay = basic_pay;
		this.salary = new Salary(basic_pay);
	}
	


	public int getEcode() {
		return ecode;
	}


	public void setEcode(int ecode) {
		this.ecode = ecode;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Salary getSalary() {
		return salary;
	}


	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	
	public double getBasic_pay() {
		return basic_pay;
	}


	public void setBasic_pay(double basic_pay) {
		this.salary = new Salary(basic_pay);
		this.basic_pay = basic_pay;
	}
	


	@Override
	public String toString() {
		return "Employee [ecode=" + ecode + ", ename=" + ename + ", designation=" + designation + ", age=" + age
				+ ", salary=" + salary + "]";
	}



	
	
	
	

}
