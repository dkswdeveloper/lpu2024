<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Add Book</h2>
<form action="addBook" method="post">
	Title <input type="text" name="title" required /> <br><br>
	Author <input type="text" name="author" required /> <br><br>
	Publisher <input type="text" name="publisher" required /> <br><br>
	<input type="submit" value="Add a book" />
</form>
</body>
</html>