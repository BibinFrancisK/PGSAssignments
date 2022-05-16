package com.bookstoreex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ThankYou
 */
@WebServlet("/ThankYou")
public class ThankYou extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThankYou() {
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
		HttpSession session = request.getSession();
		double totalPrice = (double)session.getAttribute("totalPrice");
		String custName = request.getParameter("custName");
		Random random = new Random();
		
		out.println("<HTML><HEAD><TITLE>");
		out.println("Duke's Bookstore");
		out.println("</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("<H3>Thank You!</H3>");
		out.println("<H4>Invoice Details</H4>");
		out.println("<HR>");
		out.println("<P>Invoice: #" + random.nextInt() + "</P>");
		out.println("<P>Customer name: " + custName + "</P>");
		out.println("<P>Amount paid: " + totalPrice + "  </P>");	
		out.println("<HR>");
		out.println("<P>Please wait... You will be redirected to store...</P>");
		out.println("</BODY>");
		out.println("</HTML>");
		session.invalidate();
		response.setHeader("Refresh", "5; URL=" + request.getContextPath() + "/Store");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
