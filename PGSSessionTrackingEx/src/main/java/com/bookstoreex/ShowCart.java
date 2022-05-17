package com.bookstoreex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShowCart
 */
@WebServlet("/ShowCart")
public class ShowCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Integer qty = 0;
		Double price = 0.0;
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();

		ArrayList<Book> cart = (ArrayList<Book>)session.getAttribute("cart");
		HashMap<Integer, Integer> bookMap = new HashMap<Integer, Integer>();
		for(Book book : cart) {
			if(bookMap.containsKey(book.getBookId()))
				bookMap.put(book.getBookId(), bookMap.get(book.getBookId())+1);
			else
				bookMap.put(book.getBookId(), 1);
		}
		List<Book> distinctBooks = cart.stream()
						                .distinct()
						                .collect(Collectors.toList());
		if(cart.isEmpty()) {
			out.println("<H3>You have nothing in your cart!</H3>");
			out.println("<A HREF="+request.getContextPath()+"/Store>See store</A>");}
		else {
		double totalPrice = 0.0;
		out.println("<HTML><HEAD><TITLE>");
		out.println("Duke's Bookstore");
		out.println("</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<H2>Items in Cart</H2>");
		out.println("<TABLE BORDER=1>");
		out.println("<TR><TH>Book ID</TH><TH>Name</TH><TH>Qty</TH><TH>Unit Price</TH><TH>Remove</TH></TR>");
		
		for(Book book : distinctBooks) {
			qty = bookMap.get(book.getBookId());
			price = book.getPrice() * qty;
			out.println("<TR>");
			out.print("<TD>"+book.getBookId()+"</TD>"+
						"<TD>"+book.getBookName()+"</TD>"+
						"<TD>"+qty+"</TD>"+
						"<TD>"+book.getPrice()+"</TD>"+
						"<TD><A HREF="+request.getContextPath()+"/RemoveFromCart?bookid="+book.getBookId()+">Remove item</A></TD>"
						);
			out.println("</TR>");
			totalPrice += price;
		}
		out.println("</TABLE>");
		out.println("<BR>");
		
		out.println("<P>The total price is: " + totalPrice + "</P>");
		session.setAttribute("totalPrice", totalPrice);
		out.println("<A HREF="+request.getContextPath()+"/Catalog>See catalog</A>");
		out.println("<BR>");
		out.println("<A HREF="+request.getContextPath()+"/RemoveAll>Clear cart</A>");
		out.println("<BR>");
		out.println("<A HREF="+request.getContextPath()+"/Cashier>Buy books</A>");
		out.println("</BODY>");
		out.println("</HTML>");
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
