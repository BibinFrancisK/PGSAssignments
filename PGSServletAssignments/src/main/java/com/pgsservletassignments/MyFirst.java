package com.pgsservletassignments;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyFirst
 */
@WebServlet("/MyFirst")
public class MyFirst extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyFirst() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String name = request.getParameter("name");
		PrintWriter  out = response.getWriter();
		out.println("<HTML><HEAD>");
		out.println("<TITLE>My First Servlet</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY><H3>Hello "+ name +"</H3><H4>This is my first servlet.</H4></BODY>");
		out.println("</HTML>");
		
		
	}

}
