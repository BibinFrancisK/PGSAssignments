package com.bookstoreex;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

/**
 * Servlet implementation class Catalog
 */
@WebServlet("/Catalog")
public class Catalog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Catalog() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Connection conn = null;
		Statement stmt = null;
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String query = "select * from bookdetail";
		try {
		
			Context ic = new InitialContext();
			DataSource dso = (DataSource)ic.lookup("java:comp/env/jdbc/myoracle");
			conn = null;
			HttpSession session = request.getSession();
			ArrayList<Book> books = new ArrayList<Book>();
			session.setAttribute("books", books);
			conn = dso.getConnection();
			Statement so = conn.createStatement();
			ResultSet rso = so.executeQuery(query);
			out.println("<HTML><HEAD><TITLE>");
			out.println("Duke's Bookstore");
			out.println("</TITLE></HEAD>");
			out.println("<BODY>");
			out.println("<H2>Book Catalog</H2>");
			out.println("<TABLE BORDER=1>");
			out.println("<TR><TH>Book ID</TH><TH>Name</TH><TH>Author</TH><TH>Desc.</TH><TH>Price</TH><TH>Cart</TH></TR>");
			
			while(rso.next()) {
				
				Book book = new Book();
				session.setAttribute("book", book);					
				book.setBookId(rso.getInt(1));
				book.setBookName(rso.getString(2));
				book.setAuthor(rso.getString(3));
				book.setDesc(rso.getString(4));
				book.setPrice(rso.getDouble(5));
				books.add(book);
				
				out.println("<TR>");
				out.print("<TD>"+book.getBookId()+"</TD>"+
						"<TD>"+book.getBookName()+"</TD>"+
						"<TD>"+book.getAuthor()+"</TD>"+
						"<TD>"+book.getDesc()+"</TD>"+
						"<TD>"+book.getPrice()+"</TD>"+
						"<TD><A HREF="+request.getContextPath()+"/AddToCart?bookid="+book.getBookId()+">Add to cart</A></TD>"
						);
				out.println("</TR>");
				//out.println("<BR>");
			}
			out.println("</TABLE>");
			out.println("<BR>");
			out.println("<A HREF="+request.getContextPath()+"/ShowCart>Show cart</A>");
			out.println("</BODY>");
			out.println("</HTML>");
			conn = null;
			//System.out.println(request.getContextPath());
		}
		catch(Exception e) {
			System.out.println("Exception: \n");
			e.printStackTrace();
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
