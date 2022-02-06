<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<h1>Spring MVC App</h1>
	<pre>
	<form action="reg.do" method="post">
	UserName: <input type="text" name="username">
	Password: <input type="password" name="password">
	ConfirmPassword: <input type="password" name="confirmpassword">
	MobileNo: <input type="text" name="MobileNumber">
	Age: <input type="text" name="age">
	    <input type="submit" value="Register">
	</form>
	</pre>
	<h1>Login Page</h1>
	<pre>
	<form action="login.do" method="post">
	UserName :<input type="text" name="username">
	Password :<input type="password" name="password">
	<input type="submit" value = "Login">
	</form>
	</pre>
</body>
</html>