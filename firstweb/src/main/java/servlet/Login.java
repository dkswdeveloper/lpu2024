package servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Student;
import service.StudentService;
import service.StudentServiceImpl;

/**
 * Servlet implementation class Login
 */
@WebServlet(description = "Login Servlet", urlPatterns = { "/login" })
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentService studentService = new StudentServiceImpl();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String roll = request.getParameter("roll");
		int rollInt = 0;
		try
		{
			rollInt = Integer.parseInt(roll);
		}
		catch(Exception e)
		{
			
		}
		String password = request.getParameter("password");
		System.out.println("roll = " + roll + " password=" + password);
		Student student = studentService.login(rollInt, password);
		if(student == null)
		{
			response.sendRedirect("index.jsp");
			return;
		}
		HttpSession session = request.getSession();
		session.setAttribute("roll", student.getRoll());
		session.setAttribute("loginTime", new Date());
		session.setAttribute("ipAddress", request.getRemoteAddr());
		request.getRequestDispatcher("dataServlet").forward(request, response);
		return;
	}

}
