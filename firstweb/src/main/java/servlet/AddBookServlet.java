package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Book;
import service.BookService;
import service.BookServiceImpl;

/**
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/addBook")
public class AddBookServlet extends HttpServlet {
	BookService bookService  = new BookServiceImpl();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String publisher = request.getParameter("publisher");
		Book b = bookService.add(title, author, publisher);
		PrintWriter writer = response.getWriter();
		
		
//		writer.append("Added successfully : " + b.toString());
		request.setAttribute("bookAdded", b);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("show-book.jsp");
		requestDispatcher.forward(request, response);
	
	
	
	
	}

}
