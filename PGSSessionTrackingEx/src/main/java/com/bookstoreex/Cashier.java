package com.bookstoreex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Cashier
 */
@WebServlet("/Cashier")
public class Cashier extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cashier() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		double totalPrice = (double)session.getAttribute("totalPrice");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<HTML><HEAD><TITLE>");
		out.println("Duke's Bookstore");
		out.println("</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<H2>Payment</H2>");
		out.println("Your total price is: "+ totalPrice);
		out.println("<FORM METHOD=\"POST\" ACTION=" + request.getContextPath() +"/ThankYou>");
		out.println("<P>Enter your name: </P>");
		out.println("<INPUT TYPE=\"TEXT\">");
		out.println("<P>Enter your credit card number: </P>");
		out.println("<INPUT TYPE=\"NUMBER\">");
		out.println("<BR>");
		out.println("<BR>");
		out.println("<BUTTON TYPE=\"SUBMIT\">Make Payment</BUTTON>");
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
