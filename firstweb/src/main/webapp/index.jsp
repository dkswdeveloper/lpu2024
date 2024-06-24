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
<h4> <a href="add-book.jsp"> Add A Book</h4>
<h4> <a href="allBooks"> Show All Books</h4>
<form action="login" method="get">
	Username : <input type="text" name="username" /> <br><br>
	Password : <input type="password" name="password" /> <br><br>
	<input type="submit" value="login" />


</form>
<hr/>
<form action="books" method="get" >
	Enter the bookid <input type="text" name="bid" />
	<input type="submit" value="Submit" />
</form>


</body>
</html>