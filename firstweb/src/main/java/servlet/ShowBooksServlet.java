package servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Book;
import service.BookService;
import service.BookServiceImpl;

/**
 * Servlet implementation class ShowBooksServlet
 */
@WebServlet("/allBooks")
public class ShowBooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BookService bookService = new BookServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie[] cookies = request.getCookies();
		int start = 0;
		for(Cookie ck : cookies)
		{
			if(ck.getName().equals("bookStartNumber"))
			{
				String value = ck.getValue();
				start = Integer.parseInt(value);
			}
		}
		
		List<Book> books = bookService.find(start, 2);
		Cookie ck = new Cookie("bookStartNumber", ""+(start + 2) );
		response.addCookie(ck);
		request.setAttribute("books", books);
		request.getRequestDispatcher("show-books.jsp").forward(request, response);
		
	}

}
