<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

	<!--JQUERY-->
	<script type="text/javascript" src="Libraries/jquery-1.11.2.min.js"></script>
	
	<!--FULL PAGE-->
	<link rel="stylesheet" type="text/css"
		href="Libraries/FullPage/jquery.fullPage.css" />
	<script type="text/javascript"
		src="Libraries/FullPage/jquery.fullPage.js"></script>
	
	<!--SELF (DONT TOUCH THIS)-->
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<!--STYLE IN THIS CSS-->
	<link rel="stylesheet" type="text/css" href="css/signup.css">
	<script type="text/javascript" src="scripts/signup.js"></script>

</head>
<body>
	<form action="SignupController" method="POST">
		<div id="signup">
			<div class="section basic-details-container">
				<p class="description">
					<b>Sign up</b> for the only centralized university/college application system in the Philippines<br>
				</p>
				<div class="register-box">
					<br>
					<label class="register-title">register now6</label><br>
						
					<input placeholder="username" name="username"><br>
					<input placeholder="email address" name="email"><br> 
					<input placeholder="password" type="password" name="password"><br> 
					<input placeholder="confirm password" type="password"><br>

					<br>
					<label class="green-button">Next</label><br><br>
				</div>
				

			</div>
			<div class="section upload-photo-container">
				<div class="top-bar">
					<label class="main-title2">Upload a Picture</label><br> <label
						class="main-title3">Most universities will require a 2x2
						ID picture from their aspiring applicants</label>
				</div>
				<div class="content-container">

					<img src="Assets/Images/avatar.png"><br>
					<br>
					<input type="file" accept="image/*" name="profilePicture">
					<br>
					<br>
					<label class="white-button">Next</label>
				</div>

			</div>
			<div class="section agree-container">
				<div class="content-container">
					<br>
					<label class="main-title1">Almost There9</label><br><br>
					<input type="checkbox" name="termsPoliciesCheck"> I agree to your terms and policies<br><br>
					<input type="checkbox" name="RegisterCheck"> Register me to your newsletters and promotions<br><br>
					<input class="green-button" type="submit" value="Finish Signup">

				</div>
			</div>
		</div>
	</form>
</body>

</html>