package com.pgsservletassignments;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CelsiusFarenheitConverter
 */
@WebServlet("/CelsiusFarenheitConverter")
public class CelsiusFarenheitConverter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CelsiusFarenheitConverter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<HTML><HEAD><TITLE>");
		out.println("Celsius-Farenheit Converter (Two-Way)");
		out.println("</TITLE></HEAD>");
		out.println("<BODY>");
		
		out.println("<H2>Select your choice and enter the temperature.</H2>");
		out.println("<FORM METHOD=\"POST\" ACTION="+ request.getContextPath() +"/CalcTemp>");
		out.println("<INPUT TYPE=\"RADIO\" NAME=\"choice\" VALUE=\"cToF\">Celsius to Farenheit conversion");
		out.println("<BR>");
		out.println("<INPUT TYPE=\"RADIO\" NAME=\"choice\" VALUE=\"fToC\">Farenheit to Celsius conversion");
		out.println("<BR>");
		out.println("<BR>");
		out.print("Enter the input temperature ");
		out.print("<INPUT TYPE=\"NUMBER\" NAME=\"Temp\" REQUIRED>");
		out.println("<BUTTON TYPE=\"SUBMIT\">Convert</BUTTON>");
		out.println("</FORM>");
		
		out.println("</BODY>");
		out.println("</HTML>");
		
	}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
