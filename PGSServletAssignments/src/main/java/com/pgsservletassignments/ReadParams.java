package com.pgsservletassignments;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadParams
 */
@WebServlet("/ReadParams")
public class ReadParams extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadParams() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//http://localhost:8080/PGSServletAssignments/ReadParams?txtParam1=a&txtParam2=b&txtParam3=c
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String txtParam1 = request.getParameter("txtParam1");
		String txtParam2 = request.getParameter("txtParam2");
		String txtParam3 = request.getParameter("txtParam3");
		out.println("<HTML><HEAD>");
		out.println("<TITLE>List of parameters</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("<UL>");
		out.println("<LI>"+ txtParam1 +"</LI>");
		out.println("<LI>"+ txtParam2 +"</LI>");
		out.println("<LI>"+ txtParam3 +"</LI>");
		out.println("</UL>");
		out.println("</BODY>");
		out.println("</HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		//http://localhost:8080/PGSServletAssignments/Parameter.html
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String txtParam1 = request.getParameter("txtParam1");
		String txtParam2 = request.getParameter("txtParam2");
		String txtParam3 = request.getParameter("txtParam3");
		out.println("<HTML><HEAD>");
		out.println("<TITLE>List of parameters</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("<UL>");
		out.println("<LI>"+ txtParam1 +"</LI>");
		out.println("<LI>"+ txtParam2 +"</LI>");
		out.println("<LI>"+ txtParam3 +"</LI>");
		out.println("</UL>");
		out.println("</BODY>");
		out.println("</HTML>");
	}

}
