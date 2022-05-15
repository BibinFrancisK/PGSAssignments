package com.pgsservletassignments;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcTemp
 */
@WebServlet("/CalcTemp")
public class CalcTemp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalcTemp() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		String choice = request.getParameter("choice");
		double temp = Double.parseDouble(request.getParameter("Temp"));
		double farenheitTemp = 0.0, celsiusTemp = 0.0;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<HTML><HEAD><TITLE>");
		out.println("Celsius-Farenheit Converter");
		out.println("</TITLE></HEAD>");
		out.println("<BODY>");

		if (choice == null) {
			out.println("<P>Please select a choice!</P>");
		}

		else {
			if (choice.equals("cToF")) {
				celsiusTemp = temp;
				farenheitTemp = (1.8 * celsiusTemp) + 32;
				out.println("<P>" + celsiusTemp + " Celsius is " + farenheitTemp + " Farenheits" + "</P>");

			} else if (choice.equals("fToC")) {
				farenheitTemp = temp;
				celsiusTemp = (farenheitTemp - 32) * 0.555555;
				out.println("<P>" + farenheitTemp + " Farenheits is " + celsiusTemp + " Celsius" + "</P>");

			} else {
				out.println("<P>Invalid choice!</P>");
			}
		}
		
		//getServletContext().getRequestDispatcher("/CelsiusFarenheitConv").include(request, response);
		out.println("<A HREF=" + request.getContextPath() + "/CelsiusFarenheitConverter> Go back </A>");
		out.println("</BODY>");
		out.println("</HTML>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
