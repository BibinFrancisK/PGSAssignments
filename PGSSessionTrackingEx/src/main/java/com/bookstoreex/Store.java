package com.bookstoreex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Store
 */
@WebServlet("/Store")
public class Store extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Store() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session = request.getSession(true);
		session.setAttribute("cart", new ArrayList<Book>());	
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<HTML><HEAD><TITLE>");
		out.println("Duke's Bookstore");
		out.println("</TITLE></HEAD>");
		out.println("<BODY");
		out.println("<H2>Welcome to Duke's Bookstore</H2>");
		out.println("<Please select an option.>");
		out.println("<ul>");
		out.println("<li><a href="+request.getContextPath()+"/Catalog>Catalog</a></li>");
		out.println("<li><A HREF="+request.getContextPath()+"/ShowCart>Shopping cart</A></li>");
		out.println("<li><A HREF="+request.getContextPath()+"/Cashier>Buy your books</a></li>");
		out.println("</ul>");
		out.println("</BODY>");
		out.println("</HTML>");
		
		//System.out.println(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	

}
