<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	
	<head>
		<title>Student confirmation</title>
	</head>
	
	<body>
		
		The student is confirmed : ${student.firstName} ${student.lastName}	
		<br><br>
		
		Country: ${student.country}
		
		<br><br>
		
		Language : ${student.language}
		
		<br><br>
		
		Operating System
		
		<ul>
			<c:forEach var="temp" items="${student.operatingSystem}">
				<li> ${temp} </li>	
			</c:forEach>
		</ul>
		
		Subjects : ${student.subjects}
		
		<br><br>
		
		Postal Code : ${student.postalCode}
		
	</body>
	<!-- 
	jstl-1.2.1
	jstl-api-1.2.1
	 -->
</html>