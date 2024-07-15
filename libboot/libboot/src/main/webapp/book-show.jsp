<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3> This jsp will be show when user sends a request to 
controller "/mvc/books" and enters a bid as parameter </h3>
<div> Book Received from model (sent by conroller)</div>
<div> ${book} </div>
<div> <%=request.getAttribute("book") %></div>
<p> Parameter in 2 ways : <br> 
	1. in the url http://localhost:8081/mvc/books?bid=101 <br>
	2. create a form input type="number" name="bid" , input submit <br>
</p>
</body>
</html>