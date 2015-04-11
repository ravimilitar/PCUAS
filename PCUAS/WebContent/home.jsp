<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<title>Home</title>
		<!--JQUERY-->
		<script type="text/javascript" src="Libraries/jquery-1.11.2.min.js"></script>

		<!--CAPTION HOVER EFFECTS REPLACEMENT-->
		<link rel="stylesheet" type="text/css" href="Libraries/CaptionHoverEffectsReplacement/caption_hover_effects.css">

		<!--SELF (DONT TOUCH THIS)-->
		<link rel="stylesheet" type="text/css" href="css/style.css">
		<!--STYLE IN THIS CSS-->
		<link rel="stylesheet" type="text/css" href="css/home.css">

		<!--MENU-->
		<script type="text/javascript" src="scripts/menu.js"></script>
		<link rel="stylesheet" type="text/css" href="css/menu.css">

	</head>
	<body>
			
		<div id="main-container">
			<br><br>
			<label class="main-title2">Applied Schools</label>
			
			<ul id="schools-list">
				<li>
					<div class="caption-hover-effect">
						<img src="Assets/Images/SchoolLogos/school-logo-dlsu.png">
						<div class="caption">
							<span>Courses Applied</span>
							<ul>
								<li>BS Mechanical Engineering</li>
								<li>BS Mathematics</li>
								<li>BS Computer Science</li>
							</ul>

							<div class="centered"><button>Submit</button></div>
						</div>
					</div>
				</li>

				<li>
					<div class="caption-hover-effect">
						<img src="Assets/Images/SchoolLogos/school-logo-up.png">
						<div class="caption">
							<span>Courses Applied</span>
							<ul>
								<li>BS Mechanical Engineering</li>
								<li>BS Mathematics</li>
								<li>BS Computer Science</li>
							</ul>

							<div class="centered"><button>Submit</button></div>
						</div>
					</div>
				</li>

				<li>
					<div class="caption-hover-effect">
						<img src="Assets/Images/SchoolLogos/school-logo-ust.png">
						<div class="caption">
							<span>Courses Applied</span>
							<ul>
								<li>BS Mechanical Engineering</li>
								<li>BS Mathematics</li>
								<li>BS Computer Science</li>
							</ul>

							<div class="centered"><button>Submit</button></div>
						</div>
					</div>
				</li>

				<li>
					<div class="caption-hover-effect">
						<img src="Assets/Images/SchoolLogos/school-logo-ateneo.png">
						<div class="caption">
							<span>Courses Applied</span>
							<ul>
								<li>BS Mechanical Engineering</li>
								<li>BS Mathematics</li>
								<li>BS Computer Science</li>
							</ul>

							<div class="centered"><button>Submit</button></div>
						</div>
					</div>
				</li>
				<li>
					<div class="caption-hover-effect">
						<img src="Assets/Images/SchoolLogos/school-logo-feu.png">
						<div class="caption">
							<span>Courses Applied</span>
							<ul>
								<li>BS Mechanical Engineering</li>
								<li>BS Mathematics</li>
								<li>BS Computer Science</li>
							</ul>

							<div class="centered"><button>Submit</button></div>
						</div>
					</div>
				</li>
				<li>
					<div>
						<a href="addschool1.jsp"><img src="Assets/Images/SchoolLogos/school-logo-add.png"></a>
						
					</div>
				</div>
				</li>
			</ul>
		</div>
		

	</body>
	
</html>