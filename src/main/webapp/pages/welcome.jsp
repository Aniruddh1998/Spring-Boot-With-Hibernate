<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%><!-- Used for  -->   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><!-- Used for loops --> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h2>Welcome page</h2>
			<table border="1">
		<tr>
			<th>Id</th>
			<th>Fullname</th>
			<th>Email</th>
			<th>Password</th>
			<th>Action</th>
		</tr>
		
		<c:forEach var="s" items="${data}">
			<tr>
				<td>${s.id}</td>
				<td>${s.fullname}</td>
				<td>${s.email}</td>
				<td>${s.password}</td>
				<td>
					<a href="edit?id=${s.id}">Edit</a>
					<a href="delete?id=${s.id}">Delete</a>
				</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>