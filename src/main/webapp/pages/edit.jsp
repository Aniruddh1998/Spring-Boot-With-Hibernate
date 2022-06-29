<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%><!-- Used for  -->   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <!-- Used for loops -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
</head>
<body>
	<h2>Student Profile Edit</h2>
	
	<form:form action="/update" method="post">
		<form:hidden path="id" value="${stud.id}" /><br><br>
		<form:input path="fullname" value="${stud.fullname}"/><br><br>
		<form:input path="email" value="${stud.email}" /><br><br>
		<form:input path="password" value="${stud.password}" /><br><br>
		<button type="submit">Update</button>
	</form:form>
</body>
</html>