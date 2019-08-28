<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action="GreetingServlet" method="post">
Name:<input type="text" name="uname">
<br>
Gender:
Male<input type="radio" name="gender" value="male" checked>
Female<input type="radio" name="gender" value="female">
<br>
<input type="submit" value="Submit">
<input type="reset" value="Reset"> 
</form>
</body>
</html>