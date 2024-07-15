<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Index.jsp file in webapp</h2>
Rendering is not happening 
JSP not rendered in spring boot application 
Maven Dependency : tomcat embed jasper
<%
	
	for(int i = 1; i<=5; i++)
	{
		out.println(" " + i);
	}
%>
</body>
</html>