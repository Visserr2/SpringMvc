<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
		
		<hr />
		<a href="/SpringMvc">Go back</a> 
		
	</body>
</html>