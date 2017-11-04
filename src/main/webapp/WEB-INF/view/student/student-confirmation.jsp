<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Student confirmation page</title>
	</head>
	
	<body>
		
		The student is confirmed: ${student.firstName} ${student.lastName}
		
		<br><br>
		
		Country: ${student.country}
		
		<br><br>
		
		The student favorite language is: ${student.favoriteLanguage}
		
		<br><br>
		
		Experience with operating systems:
			<ul>
				<c:forEach var="os" items="${student.operatingSystems}">
					<li>${os}</li>
				</c:forEach>
			</ul>
		
		<hr />
		<a href="/SpringMvc">Go back</a> 
		
	</body>
</html>