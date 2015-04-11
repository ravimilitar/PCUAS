<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="models.*" %>
	
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<!--JQUERY-->
<script type="text/javascript" src="Libraries/jquery-1.11.2.min.js"></script>

<!--SELF-->
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" type="text/css" href="css/background_info.css">

<!--MENU-->
<script type="text/javascript" src="scripts/menu.js"></script>
<link rel="stylesheet" type="text/css" href="css/menu.css">
</head>
<body>

	<div id="main-container">
		<div class="content-wrapper full">
			<div class="content-container">
				<br> <label class="main-title2">Academic Information</label>

				<div class="information-container">
					<form action="AcadInfoController" method="POST">
						<div class="lefthalf">
							<input class="hs1" name="hs1" type="text" placeholder="HIGH SCHOOL NAME - 1ST YEAR" <c:if test="${acadInfo[1] != null}">value="<c:out value='${acadInfo[1].hs}'></c:out>"</c:if>><br> 
							<input class="country1" name="country1" type="text" placeholder="COUNTRY"><br>
							<input class="year1" name="year1" type="text" placeholder="YEAR ATTENDED yyyy-yyyy"><br>
							<textarea class="address1" name="address1" type="text" placeholder="ADDRESS"></textarea>
						</div>
						<div class="righthalf">
							<input class="hs2" name="hs2" type="text" placeholder="HIGH SCHOOL NAME - 2ND YEAR"><br> 
							<input class="country2" name="country2" type="text" placeholder="COUNTRY"><br>
							<input class="year2" name="year2" type="text" placeholder="YEAR ATTENDED yyyy-yyyy"><br>
							<textarea class="address2" name="address2" type="text" placeholder="ADDRESS"></textarea>
						</div>
						<div class="lefthalf">
							<input class="hs3" name="hs3" type="text" placeholder="HIGH SCHOOL NAME - 3RD YEAR"><br> 
							<input class="country3" name="country3" type="text" placeholder="COUNTRY"><br>
							<input class="year3" name="year3" type="text" placeholder="YEAR ATTENDED yyyy-yyyy"><br>
							<textarea class="address3" name="address3" type="text" placeholder="ADDRESS"></textarea>
						</div>
						<div class="righthalf">
							<input class="hs4" name="hs4" type="text" placeholder="HIGH SCHOOL NAME - 4TH YEAR"><br> 
							<input class="country4" name="country4" type="text" placeholder="COUNTRY"><br>
							<input class="year4" name="year4" type="text" placeholder="YEAR ATTENDED yyyy-yyyy"><br>
							<textarea class="address4" name="address4" type="text" placeholder="ADDRESS"></textarea>
						</div>
						<input class="submit" type="submit" value="SUBMIT"> <br>
						<br>
					</form>
				</div>


			</div>
		</div>

	</div>
	
	<c:forEach var="i" begin="0" end="4">
		<script>
			$('.hs'+'${i+1}').val('${hsInfo[i].schoolname}');
			$('.country'+'${i+1}').val('${hsInfo[i].country}');
			$('.year'+'${i+1}').val('${hsInfo[i].schoolyear}');
			$('.address'+'${i+1}').val('${hsInfo[i].address}');
			
		</script>
		
	</c:forEach>
	

</body>

</html>