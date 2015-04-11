<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<!--JQUERY-->
<script type="text/javascript" src="Libraries/jquery-1.11.2.min.js"></script>

<!--CAPTION HOVER EFFECTS REPLACEMENT-->
<link rel="stylesheet" type="text/css"
	href="Libraries/CaptionHoverEffectsReplacement/caption_hover_effects.css">

<!--SELF (DONT TOUCH THIS)-->
<link rel="stylesheet" type="text/css" href="css/style.css">
<!--STYLE IN THIS CSS-->
<link rel="stylesheet" type="text/css" href="css/background_info.css">


<!--MENU-->
<script type="text/javascript" src="scripts/menu.js"></script>
<link rel="stylesheet" type="text/css" href="css/menu.css">

</head>
<body>
	<div id="main-container">

		<br> <label class="main-title2">Referrals</label> <br>
		<br> <label class="main-title3">Referral 1</label> <br>
		<div class="information-container">
			<form>
				<input placeholder="First Name"> <input
					placeholder="Last Name"> <input placeholder="Email"
					type="email"> <input placeholder="Organization"> <input
					placeholder="Position"> <input placeholder="Mobile Phone">
				<input class="submit" type="submit" value="Save Referrer">
			</form>
		</div>

		<br>
		<br>
		<br> <label class="main-title3">Referral 2</label> <br>
		<div class="information-container">
			<form>
				<input placeholder="First Name"> <input
					placeholder="Last Name"> <input placeholder="Email"
					type="email"> <input placeholder="Organization"> <input
					placeholder="Position"> <input placeholder="Mobile Phone">
				<input class="submit" type="submit" value="Save Referrer">
			</form>
		</div>
		<br>
		<br>
		<br>


	</div>

</body>

</html>