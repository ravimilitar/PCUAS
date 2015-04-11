<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<!--JQUERY-->
<script type="text/javascript" src="Libraries/jquery-1.11.2.min.js"></script>

<!--SLICK SLIDER-->
<link rel="stylesheet" type="text/css" href="Libraries/slick/slick.css">
<script type="text/javascript" src="Libraries/slick/slick.min.js"></script>

<!--SELF-->
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" type="text/css" href="css/addschool.css">
<script type="text/javascript" src="scripts/addschool.js"></script>

<!--MENU-->
<script type="text/javascript" src="scripts/menu.js"></script>
<link rel="stylesheet" type="text/css" href="css/menu.css">
</head>
<body>

	<div id="main-container">
		<div id="add-school-2" class="content-wrapper full">
			<div class="content-container">
				<br>
				<h1 class="main-title2">Add School</h1>

				<div id="steps-container">
					<label id="step-num">Step 2:</label> <label id="step-description">Select
						your courses</label>
				</div>

				<div id="school-description-container">
					<div class="logo-container">
						<img src="Assets/Images/SchoolLogos/school-logo-dlsu.png">
					</div>
					<div class="courses-container">
						<div class="select-number-container">
							<ol>
								<li><a href="#">Click to add course . . .</a></li>
								<li><a href="#">Click to add course . . .</a></li>
								<li><a href="#">Click to add course . . .</a></li>
							</ol>
						</div>
						<div class="select-college-container">
							<label class="white-button">Back</label>

							<ol>
								<li><a href="#">College of Computer Studies . . .</a></li>
								<li><a href="#">College of Liberal Arts . . .</a></li>
								<li><a href="#">College of Engineering . . .</a></li>
								<li><a href="#">College of Science . . .</a></li>
								<li><a href="#">College of Business . . .</a></li>
							</ol>
						</div>
						<div class="select-course-container">
							<label class="white-button">Back</label>
							<ol>
								<li><a href="#">BS Computer Science with specialization
										in Software Technology</a></li>
								<li><a href="#">BS Computer Science with specialization
										in Network Engineering</a></li>
								<li><a href="#">BS Computer Science with specialization
										in Instructional Systems Technology</a></li>
								<li><a href="#">BS Computer Systems Engineering</a></li>
								<li><a href="#">BS Information Systems</a></li>
							</ol>
						</div>

					</div>
					<div class="description-container">
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit,
							sed do eiusmod tempor incididunt ut labore et dolore magna
							aliqua. Ut enim ad minim veniam, quis nostrud exercitation
							ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis
							aute irure dolor in reprehenderit in voluptate velit esse cillum
							dolore eu fugiat nulla pariatur. Excepteur sint occaecat
							cupidatat non proident, sunt in culpa qui officia deserunt mollit
							anim id est laborum.</p>
					</div>

					<br>
					<br> <a href="home.jsp" class="green-button">ADD SCHOOL</a> <br>
					<br>
					<br>
				</div>
			</div>
		</div>

	</div>

</body>

</html>