<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<form action="Controller" method="post">
First Name:
<input type="text" name="firstname" required><br>
Last Name:
<input type="text" name="lastname" required><br>
Email:
<input type="email" name="emailaddress" required><br>
UserId:
<input type="text" name="id" required>
<input type="submit" value="Submit">
</form>
</body>
</html>