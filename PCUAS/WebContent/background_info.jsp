<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="models.*"%>
	
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
				<br> <label class="main-title2">Background Information</label>

				<div class="information-container">
					<form action="BackgroundInfoController" method="POST">
						<br> <br>
						<div>
							<label class="main-title3">PERSONAL DATA</label><br> 
							<input class="firstname" name="firstname" type="text" placeholder="FIRST NAME/S">
							<input class="middlename" name="middlename" type="text" placeholder="MIDDLE NAME"><br>
							<input class="lastname" name="lastname" type="text" placeholder="LAST NAME">
							<input class="nickname" name="nickname" type="text" placeholder="NICKNAME"><br>
							
							<select class="gender" name="gender">
								<option class="gender-option" value="unselected" selected disabled>GENDER</option>
								<option class="option" value="male">MALE</option>
								<option class="option" value="female">FEMALE</option>
							</select> 
							
							<select class="civilstatus" name="civilstatus">
								<option class="civilstatus-option" value="unselected" selected disabled>CIVIL STATUS</option>
								<option class="option" value="single">SINGLE</option>
								<option class="option" value="married">MARRIED</option>
								<option class="option" value="widowed">WIDOWED</option>
								<option class="option" value="legallyseparated">LEGALLY SEPARATED</option>
								<option class="option" value="divorced">DIVORCED</option>
							</select><br> 
							
							<select class="religion" name="religion">
								<option class="religion-option" value="unselected" selected disabled>RELIGION</option>
								<option class="option" value="protestant">PROTESTANT</option>
								<option class="option" value="romancatholic">ROMAN CATHOLIC</option>
								<option class="option" value="islam">ISLAM</option>
							</select> 
							
							<input class="dateofbirth" name="dateofbirth" type="date" placeholder="DATE OF BIRTH mm/dd/yyyy"><br> 
							
							<select class="citizenship" name="citizenshipcountry">
								<option class="citizenship-option" value="unselected" selected disabled>COUNTRY OF CITIZENSHIP</option>
								<option class="option" value="china">CHINA</option>
								<option class="option" value="philippines">PHILIPPINES</option>
								<option class="option" value="southkorea">SOUTH KOREA</option>
								<option class="option" value="usa">UNITED STATES OF AMERICA</option>
							</select> 
							
							<select class="citizenship-wdc" name="dualcitizenship">
								<option class="citizenship-wdc-option" value="unselected" selected disabled>WITH DUAL CITIZENSHIP?</option>
								<option class="option" value="yes">YES</option>
								<option class="option" value="no">NO</option>
							</select><br> 
							
							<input class="placeofbirth-city" name="pobcity" type="text" placeholder="PLACE OF BIRTH - CITY/TOWN"> 
							
							<input class="placeofbirth-province" name="pobprovince" type="text" placeholder="PLACE OF BIRTH - PROVINCE/REGION/STATE"><br>
							
							<select class="placeofbirth-country" name="pobcountry">
								<option class="placeofbirth-country-option" value="unselected" selected disabled>PLACE OF BIRTH - COUNTRY</option>
								<option class="option" value="china">CHINA</option>
								<option class="option" value="philippines">PHILIPPINES</option>
								<option class="option" value="southkorea">SOUTH KOREA</option>
								<option class="option" value="usa">UNITED STATES OF AMERICA</option>
							</select>
						
						</div>
						<br> <br> <br> <br>
						
						<div>
							<label class="main-title3">CONTACT DETAILS</label><br> 
							
							<input class="mobilephone" name="mobilephone" type="number" placeholder="MOBILE PHONE"><br>
							<input class="unitaddress" type="text" placeholder="PERMANENT ADDRESS - UNIT ADDRESS"> 
							<input class="streetaddress" type="text" placeholder="PERMANENT ADDRESS - STREET ADDRESS"><br>
							<input class="districtaddress" type="text" placeholder="PERMANENT ADDRESS - DISTRICT ADDRESS"> 
								
							<select class="permanentaddress-country">
								<option class="permanentaddress-country-option" value="unselected" selected disabled>PERMANENT ADDRESS - COUNTRY</option>
								<option class="option" value="china">CHINA</option>
								<option class="option" value="philippines">PHILIPPINES</option>
								<option class="option" value="southkorea">SOUTH KOREA</option>
								<option class="option" value="usa">UNITED STATES OF AMERICA</option>
							</select><br> 
							
							<input class="postalcode" type="number" placeholder="POSTAL CODE"> 
								
							<input class="telephone" type="number" placeholder="TELEPHONE"><br> 
							
							<select class="currentaddress-yn">
								<option class="currentaddress-yn-option" selected disabled>CURRENT SIMILAR TO PERMANENT ADDRESS?</option>
								<option class="option" value="yes">YES</option>
								<option class="option" value="no">NO</option>
							</select> 
							
							<select class="mailingaddress">
								<option class="mailingaddress-option" selected disabled>MAILING SIMILAR TO PERMANENT ADDRESS?</option>
								<option class="option" value="yes">YES</option>
								<option class="option" value="no">NO</option>
							</select>
						</div>
						<br> <br> <br> <br>
						
						
						<div>
							<label class="main-title3">FAMILY BACKGROUND - FATHER</label><br>
							
							<input class="father-givenname" type="text" placeholder="GIVEN NAME/S"> 
							<input class="father-middlename" type="text" placeholder="MIDDLE NAME"><br>
							<input class="father-lastname" type="text" placeholder="LAST NAME"> 
							
							<select class="father-civilstatus">
								<option class="father-civilstatus-option" value="unselected" selected disabled>CIVIL STATUS</option>
								<option class="option" value="single">SINGLE</option>
								<option class="option" value="married">MARRIED</option>
								<option class="option" value="widowed">WIDOWED</option>
								<option class="option" value="legallyseparated">LEGALLY SEPARATED</option>
								<option class="option" value="divorced">DIVORCED</option>
							</select><br> 
							
							<select class="father-income">
								<option class="father-income-option" value="unselected" selected disabled>ANNUAL INCOME/COMPENSATION</option>
								<option class="option" value="income1">PHP 800,001 AND ABOVE</option>
								<option class="option" value="income2">PHP 650,001 - 800,000</option>
								<option class="option" value="income3">PHP 500,001 - 650,000</option>
								<option class="option" value="income4">PHP 500,000 AND BELOW</option>
								<option class="option" value="none">NOT APPLICABLE</option>
							</select><br> 
							
							<select class="father-employment-yn">
								<option class="father-employment-yn-option" value="unselected" selected disabled>EMPLOYEE OF A UNIVERSITY?</option>
								<option class="option" value="yes-currently">YES, CURRENTLY</option>
								<option class="option" value="yes-retired">YES, RESIGNED/RETIRED</option>
								<option class="option" value="no">NO</option>
							</select> 
							
							<input class="father-employment-university" placeholder="UNIVERSITY OF EMPLYMENT">
							
							
						</div>
						<br> <br> <br> <br>
						
						
						<div>
							<label class="main-title3">FAMILY BACKGROUND - MOTHER</label><br>
							
							<input class="mother-givenname" type="text" placeholder="GIVEN NAME/S"> 
							<input class="mother-middlename" type="text" placeholder="MIDDLE NAME"><br>
							<input class="mother-lastname" type="text" placeholder="LAST NAME"> 
								
							<select class="mother-civilstatus">
								<option class="mother-civilstatus-option" value="unselected" selected disabled>CIVIL STATUS</option>
								<option class="option" value="single">SINGLE</option>
								<option class="option" value="married">MARRIED</option>
								<option class="option" value="widowed">WIDOWED</option>
								<option class="option" value="legallyseparated">LEGALLY SEPARATED</option>
								<option class="option" value="divorced">DIVORCED</option>
							</select><br> 
							
							<select class="mother-income">
								<option class="mother-income-option" value="unselected" selected disabled>ANNUAL INCOME/COMPENSATION</option>
								<option class="option" value="income1">PHP 800,001 AND ABOVE</option>
								<option class="option" value="income2">PHP 650,001 - 800,000</option>
								<option class="option" value="income3">PHP 500,001 - 650,000</option>
								<option class="option" value="income4">PHP 500,000 AND BELOW</option>
								<option class="option" value="none">NOT APPLICABLE</option>
							</select><br> 
							
							<select class="mother-employment-yn" name="mother-employment-yn">
								<option class="mother-employment-yn-option" value="unselected" selected disabled>EMPLOYEE OF A UNIVERSITY?</option>
								<option class="option" value="yes-currently">YES, CURRENTLY</option>
								<option class="option" value="yes-retired">YES, RESIGNED/RETIRED</option>
								<option class="option" value="no">NO</option>
							</select> 
							
							<input class="mother-employment-university" name="mother-employment-university" placeholder="UNIVERSITY OF EMPLYMENT">
						</div>
						<br> <br> <br> <br>
						<div>
							<label class="main-title3">FAMILY BACKGROUND - GUARDIAN</label><br>
							
							<select class="guardian-living" name="livingwithparents">
								<option class="guardian-living-option" value="unselected" selected disabled>LIVING WITH PARENTS?</option>
								<option class="option" value="yes">YES</option>
								<option class="option" value="no">NO</option>
							</select> <br>
							
							<div id="guardian-details">
								<input class="guardian-givenname" name="guardianGivenname" type="text" placeholder="GIVEN NAME/S"> 
								<input class="guardian-middlename" name="guardianMiddlename" type="text" placeholder="MIDDLE NAME"><br> 
								<input class="guardian-lastname" name="guardianLastname" type="text" placeholder="LAST NAME">
								
								<select class="guardian-relationship" name="guardianRelationship">
									<option class="guardian-relationship-option" value="guardian" selected disabled>RELATIONSHIP</option>
									<option class="option" value="brother">BROTHER</option>
									<option class="option" value="sister">SISTER</option>
									<option class="option" value="others">OTHERS</option>
								</select>
							</div>
						</div>
						<br> <br> <br> <br>
						<div>

							<label class="main-title3">DECLARATIONS</label><br> 
							
							<select class="sat" name="sat">
								<option class="sat-option" value="unselected" selected disabled>SUBMIT SAT SCORES IN LEU OF THE DCAT?</option>
								<option class="option" value="yes">YES</option>
								<option class="option" value="no">NO</option>
							</select> 
							
							<select class="finance" name="finance">
								<option class="finance-option" value="unselected" selected disabled>HOW WILL YOUR STUDIES BE FINANCED?</option>
								<option class="option" value="finance1">PARENTS</option>
								<option class="option" value="finance2">RELATIVES</option>
								<option class="option" value="finance3">SELF</option>
								<option class="option" value="finance4">NON-DLSU SCHOLARSHIP</option>
								<option class="option" value="finance5">PRE-NEED PLAN</option>
								<option class="option" value="finance6">DLSU SCHOLARSHIP</option>
							</select><br> 
							
							<select class="physicalcondition" name="physical-condition">
								<option class="physicalcondition-option" value="unselected" selected disabled>ANY PHYSICAL CONDITIONS?</option>
								<option class="option" value="yes">YES</option>
								<option class="option" value="no">NO</option>
							</select> 
							
							<select class="behavioralcondition" name="behavioral-condition">
								<option class="behavioralcondition-option" value="unselected" selected disabled>ANY BEHAVIORAL CONDITIONS?</option>
								<option class="option" value="yes">YES</option>
								<option class="option" value="no">NO</option>
							</select> 
							
							<select class="disciplinary-action" name="disciplinary-action">
								<option class="disciplinary-action-option" value="unselected" selected disabled>SUBJECTED TO DISCIPLINARY ACTION?</option>
								<option class="option" value="yes">YES</option>
								<option class="option" value="no">NO</option>
							</select>
						</div>
						<br> <br> <input class="submit" type="submit" value="SUBMIT"> <br> <br> <br> <br>
					</form>
				</div>
			</div>
		</div>

	</div>

	<c:if test="${gUInfo != null}">
		<script>
			$('.firstname').val('${gUInfo.firstname}');
			$('.lastname').val('${gUInfo.lastname}');
			$('.religion').val('${gUInfo.religion}');
			$('.middlename').val('${gUInfo.middlename}');
			$('.nickname').val('${gUInfo.nickname}');
			$('.gender').val('${gUInfo.gender}');
			$('.dateofbirth').val('${gUInfo.birthdate}');
			$('.civilstatus').val('${gUInfo.civilstatus}');
			$('.guardian-living').val('${gUInfo.livingwithparents}');
		</script>
	</c:if>
	
	<c:if test="${citizenship != null}">
		<script>
	    	$('.citizenship').val('${citizenship.citizenshipcountry}');
	    	$('.citizenship-wdc').val('${citizenship.dualcitizenship}');
	    	$('.placeofbirth-city').val('${citizenship.pobcity}');
	    	$('.placeofbirth-province').val('${citizenship.pobprovince}');
	    	$('.placeofbirth-country').val('${citizenship.pobcountry}');
	    	
			
		</script>
	</c:if>
	<c:if test="${contactDetails !=null }">
		<script>
			$('.mobilephone').val('${contactDetails.mobilephone}');
		</script>
	</c:if>
		
	<c:if test="${declaration !=null}">
		<script>
			$('.sat').val('${declaration.submitsat}');
			$('.finance').val('${declaration.financed}');
			$('.physicalcondition').val('${declaration.physicalcondition}');
			$('.behavioralcondition').val('${declaration.behavioralcondition}');
			$('.disciplinary-action').val('${declaration.disciplinaryaction}');
		</script>
	</c:if>
	
	<c:if test="${permanentAddress != null}">
		<script>
			$('.unitaddress').val('${permanentAddress.unit}');
			$('.streetaddress').val('${permanentAddress.street}');
			$('.districtaddress').val('${permanentAddress.district}');
			$('.permanentaddress-country').val('${permanentAddress.country}');
			$('.postalcode').val('${permanentAddress.postalcode}');
			$('.telephone').val('${permanentAddress.telephone}');
			
		</script>
	</c:if>
	
	<c:if test="${fatherBackground != null}">
		<script>
			$('.father-givenname').val('${fatherBackground.givenname}');
			$('.father-middlename').val('${fatherBackground.middlename}');
			$('.father-lastname').val('${fatherBackground.lastname}');
			$('.father-civilstatus').val('${fatherBackground.civilstatus}');
			$('.father-income').val('${fatherBackground.annualincome}');
			$('.father-employment-yn').val('${fatherBackground.employeeofuniversity}');
			$('.father-employment-university').val('${fatherBackground.universityofemployment}');
		</script>
	</c:if>
	
	<c:if test="${motherBackground != null}">
		<script>
			$('.mother-givenname').val('${motherBackground.givenname}');
			$('.mother-middlename').val('${motherBackground.middlename}');
			$('.mother-lastname').val('${motherBackground.lastname}');
			$('.mother-civilstatus').val('${motherBackground.civilstatus}');
			$('.mother-income').val('${motherBackground.annualincome}');
			$('.mother-employment-yn').val('${motherBackground.employeeofuniversity}');
			$('.mother-employment-university').val('${motherBackground.universityofemployment}');
		</script>
	</c:if>

	<c:if test="${guardianBackground != null}">
		<script>
			$('.guardian-givenname').val('${guardianBackground.givenname}');
			$('.guardian-middlename').val('${guardianBackground.middlename}');
			$('.guardian-lastname').val('${guardianBackground.lastname}');
			$('.guardian-civilstatus').val('${guardianBackground.civilstatus}');
			$('.guardian-income').val('${guardianBackground.annualincome}');
			$('.guardian-employment-yn').val('${guardianBackground.employeeofuniversity}');
			$('.guardian-employment-university').val('${guardianBackground.universityofemployment}');
			$('.guardian-relationship').val('${guardianBackground.relationship}');
		</script>
	</c:if>
	
</body>

</html>