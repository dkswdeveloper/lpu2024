package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDAO;
import dao.StudentDAOImplDB;
import model.Student;

@WebServlet(description = "It shows all students", urlPatterns = { "/allStudents" })
public class ShowStudentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StudentDAO studentDao = new StudentDAOImplDB();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> list = studentDao.findAll();
		request.setAttribute("students", list);
		request.getRequestDispatcher("show-students.jsp").forward(request, response);
	}

}
