package xyzcompany;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

/**
 * Servlet implementation class EmpServ
 */
@WebServlet("/EmpServ")
public class EmpServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SqlSessionFactory sqlSessionFactory;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	Reader reader = null;
    	try {
			reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    }
    
    
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		SqlSession sqlsession = sqlSessionFactory.openSession();
		List<Employee> employeeList = sqlsession.selectList("Employee.getAll");
		Iterator<Employee> itr = employeeList.iterator();
		while(itr.hasNext()) {
			Employee employee = itr.next();
			System.out.println(employee);
		}
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("<HTML><HEAD><TITLE>");
		out.println("Employee Management System");
		out.println("</TITLE></HEAD>");
		out.println("<BODY>");
		
		out.println("<P>Enter your choice: </P>");
		out.println("<P>1. Add a new employee</P>"); 
		out.println("<P>2. Calculate monthly salary</P>"); 
		out.println("<P>3. Update employee record</P>"); 
		out.println("<P>4. Delete employee record</P>");
		out.println("<P>5. <A HREF="+request.getContextPath()+"?choice=seeAllEmployees>List employees along with total salary</A></P>"); 

		out.println("</BODY>");
		out.println("</HTML>");
		
		String choice = request.getParameter("choice");
		switch (choice) {
		case "seeAllEmployees":
			//TBD
			//ITERATE AND PRINT EMPLOYEES
			break;

		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
