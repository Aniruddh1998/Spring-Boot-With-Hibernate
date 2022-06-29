<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<h2>Home Page</h2>
	<form action="savedata" method="post">
		<input type="text" name="fullname" placeholder="Full Name"><br><br>
		<input type="email" name="email" placeholder="Email"><br><br>
		<input type="password" name="password" placeholder="Password"><br><br>
		
		<button type="submit">Submit</button>
	</form>
</body>
</html>