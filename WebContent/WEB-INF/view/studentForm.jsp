<%@ taglib prefix ="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<style>
			.error{color:red}
		</style>
	</head>
	<body>
	
		<form:form action="processForm" modelAttribute="student">
			
			First name <form:input path="firstName"/>
			<br><br>
			Last name (*) <form:input path="lastName" />
			<form:errors path="lastName" cssClass="error"/>
			<br><br>
			
			Country: 
			<!-- path="country" == student.setCountry -->
			<form:select path="country">
				<!-- 
				<form:option value="BRA" label="Brasil"/>
				<form:option value="MEX" label="Mexico"/>	
				<form:option value="IND" label="India"/>	
				<form:option value="FRA" label="Francia"/>
				 -->
				 <!-- Other way to fill the options -->
				 <form:options items="${student.countryOptions}"/>						
			</form:select>
			
			<br><br>
			
			Favorite programming language:
			JAVA<form:radiobutton path="language" value="JAVA"/>
			C<form:radiobutton path="language" value="C"/>
			C#<form:radiobutton path="language" value="C#"/>
			
			<br><br>
			
			Operating System:
			
			Linux <form:checkbox path="operatingSystem" value="Linux"/>
			Mac OS <form:checkbox path="operatingSystem" value="MacOS"/>
			Windows <form:checkbox path="operatingSystem" value="Windows"/>
									
			<br><br>
			
			Subject : <form:input path="subjects"/>
			<form:errors path="subjects" cssClass="error"/>
			
			<br><br>
			
			PostalCode : <form:input path="postalCode"/>
			<form:errors path="postalCode" cssClass="error"/>
			<br><br>
			
			<input type="submit" value="submit"/>
		
		</form:form>
		
	</body>
</html>