<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>1. Add dependency tomcat-embed-jasper in pom.xml</div>
<div>2. Kill the project and restart</div>
<div> 3. add index.jsp in srm/main/webapp (search it in project explorer)</div>
<div> Windwo -> show view -> project explorer (other, then search) </div>
<h2> Index.jsp file in webapp</h2>
Rendering is not happening 
JSP not rendered in spring boot application 
Maven Dependency : tomcat embed jasper
<h3> View Student</h3>
<form action="mvc/students">
	Roll : <input type="number" name="roll" min="1" > <br>
	<input type="submit" > See Student </input>
</form>
<h3>View Book</h3>
<form action="mvc/books">
	Roll : <input type="number" name="bid" min="1"> <br>
	<input type="submit" > See Book </input>
</form>
<%
	
	for(int i = 1; i<=5; i++)
	{
		out.println(" " + i);
	}
%>
</body>
</html>