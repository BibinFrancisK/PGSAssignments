package com.bookstoreex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddToCart
 */
@WebServlet("/AddToCart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddToCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		ArrayList<Book> cart = (ArrayList<Book>)session.getAttribute("cart");
		ArrayList<Book> books = (ArrayList<Book>)session.getAttribute("books");
		HashMap<Integer, Integer> bookMap = new HashMap<Integer, Integer>();
		session.setAttribute("bookMap",bookMap);
		Integer bookid = Integer.parseInt(request.getParameter("bookid"));
		
		for(Book book : books) {
			if(book.getBookId() == bookid) {
				cart.add(book);	
				if(bookMap.containsKey(bookid))
					bookMap.put(bookid, (bookMap.get(bookid))+1);
				else
					bookMap.put(bookid, 1);
		}}
		
		//System.out.println(bookMap);
		getServletContext().getRequestDispatcher("/Catalog").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
