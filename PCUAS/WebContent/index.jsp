<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<!--JQUERY-->
<script type="text/javascript" src="Libraries/jquery-1.11.2.min.js"></script>

<!--SELF (DONT TOUCH THIS)-->
<link rel="stylesheet" type="text/css" href="css/style.css">
<!--STYLE IN THIS CSS-->
<link rel="stylesheet" type="text/css" href="css/index.css">

<script src="js/prefixfree.min.js"></script>
<title>Log In</title>
</head>
<body>
	<a href="signup.jsp" class="signup-button">Sign Up</a>


	<div class="login">
		<label class="main-title1">Animo-app.ly9</label><br>
		<br>
		<br>
		<br>
		<form action="LoginController" method="POST">
			<input type="text" placeholder="username" name="username"><br>
			<input type="password" placeholder="password" name="password"><br>
			<input type="submit" value="Login">
		</form>


		<img class="bg" src="Assets/Images/login-ribbon.png">
	</div>



	<script src='http://codepen.io/assets/libs/fullpage/jquery.js'></script>





</body>

</html>