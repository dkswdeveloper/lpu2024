<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List, model.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> All Students</h2>
<% for (int i = 1; i<= 10; i++)
	{
		/* in build objects : reuqest, response, out, appiclation, page, exception ,session , */
		out.println("<br> " + i);
	}
%>
<% List<Student> list = (List<Student>) request.getAttribute("students"); %>
<br/> <br/><h3> Student List</h3>
<ol>
<%
	for(Student s : list)
	{
		out.println("<li> " + s + "</li>");
	}
%>
</ol>
</body>
</html>












