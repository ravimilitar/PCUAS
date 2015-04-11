<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<!--JQUERY-->
<script type="text/javascript" src="Libraries/jquery-1.11.2.min.js"></script>

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
		<div id="add-school-1" class="content-wrapper full">
			<div class="content-container">
				<br>
				<h1 class="main-title2">Add School</h1>

				<div id="steps-container">
					<label id="step-num">Step 1:</label> <label id="step-description">Input
						your school</label>
				</div>

				<div id="searchbox-container">
					<!--form-->
					<input class="searchbox" placeholder="Enter school name here">
					<button class="search-button" onclick="displaySearchResults()">
						<img src="Assets/Images/search.png">
					</button>
					<!--/form-->
				</div>

				<div id="search-results-container"></div>
				<br>
				<br>
				<br>
			</div>
		</div>

	</div>

</body>

</html>