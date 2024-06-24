package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Book;
import service.BookService;
import service.BookServiceImpl;

/**
 * github.com/dkswdeveloper/lpu2024
 * 
 * Servlet implementation class BookServlet
 */
@WebServlet("/books")
public class BookServlet extends HttpServlet {
	private BookService bookService = new BookServiceImpl();
	private static final long serialVersionUID = 1L;
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read bookid from request
  		String bidStr = request.getParameter("bid");
  		//get book from bookService
  		Book book = bookService.find(Integer.parseInt(bidStr));
  		// if null return "no book"
  		PrintWriter writer = response.getWriter();
  		if(book == null) writer.append("No Book Found with id : " + bidStr);
  		// else return the book details
  		else 
  		writer.append(book.toString());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
