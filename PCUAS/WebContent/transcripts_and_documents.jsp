<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<!--JQUERY-->
<script type="text/javascript" src="Libraries/jquery-1.11.2.min.js"></script>

<!--SELF (DONT TOUCH THIS)-->
<link rel="stylesheet" type="text/css" href="css/style.css">
<!--STYLE IN THIS CSS-->
<link rel="stylesheet" type="text/css"
	href="css/transcripts_and_documents.css">

<!--MENU-->
<script type="text/javascript" src="scripts/menu.js"></script>
<link rel="stylesheet" type="text/css" href="css/menu.css">
</head>
<body>

	<div id="main-container">
		<div class="content-container">
			<label class="main-title2">Transcripts And Documents</label> <br>
			<br>
			<form>
				<table id="files-table">
					<tr>
						<td>NSO Birth Certificate</td>
						<td><input type="file"></td>
					</tr>
					<tr>
						<td>Transcript of Records</td>
						<td><input type="file"></td>
					</tr>
					<tr>
						<td>Form 137</td>
						<td><input type="file"></td>
					</tr>
					<tr>
						<td>Secondary Scholastic Record</td>
						<td><input type="file"></td>
					</tr>
					<tr>
						<td>Passport Photograph</td>
						<td><input type="file"></td>
					</tr>
					<tr>
						<td>Scholastic Aptitude Test (SAT) Official Test Results</td>
						<td><input type="file"></td>
					</tr>
					<tr>
						<td>Good Moral Character Certificate</td>
						<td><input type="file"></td>
					</tr>
				</table>

				<input class="green-button" type="submit" value="Save">
			</form>
		</div>
	</div>

</body>

</html>