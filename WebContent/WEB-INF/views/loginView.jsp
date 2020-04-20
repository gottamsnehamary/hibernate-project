<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN PAGE</title>
<link type="text/css" rel="stylesheet" href="./css/style.css">
</head>
<body>

<nav>
<img src="./css/logo.png" alt="logo"/>

<ul>
<li><a href="${pageContext.request.contextPath }/login">Login </a></li>

<li><a href="${pageContext.request.contextPath }/Signup">SingUp</a></li>
</ul>

<div class="login-form">
	<div class="title">Login</div >
	<form action="${pageContext.request.contextPath}/login" method="post">
	<label class="label" for="email">Email</label>
	<input type="text" name="email" id="email" required="required">
	<label class="label" for="password">Password</label>
	<input type="password" name="password" id="password">
	<button class="button" type="submit">Login</button>
	<a class="forgot-password" href="">Forgot Password</a>

	
	</form>
</div>
</nav>
</body>
</html>