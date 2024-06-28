<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> First Web Running</h1>
<h4> <a href="add-book.jsp"> Add A Book </a> </h4>
<h4> <a href="allBooks"> Show All Books > </a> </h4>
<h4> <a href="allStudents"> Show All Students > </a> </h4>
<hr/>
<h3> Student Login</h3>
<form action="login" method="post">
	Roll Number : <input type="text" name="roll" /> <br><br>
	Password : <input type="password" name="password" /> <br><br>
	<input type="submit" value="login" />
</form>
<hr/>
<h3> Book Search</h3>
<form action="books" method="get" >
	Enter the bookid <input type="text" name="bid" />
	<input type="submit" value="Submit" />
</form>


</body>
</html>