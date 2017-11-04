<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

	<head>
		<title>Student Registration Form</title>
	</head>
	
	<body>
		<form:form action="processform" modelAttribute="student">
			
			First name: <form:input path="firstName" />
			
			<br><br>
			
			Last name: <form:input path="lastName" />
			
			<br><br>
			
			Country: <form:select path="country">
						<form:options items="${countryOptions}"  />
					 </form:select>
			
			<br><br>
			
			Favorite language: <form:radiobuttons path="favoriteLanguage" items="${languageOptions}"/>
			
			<br><br>
			
			Operating systems: <form:checkboxes path="operatingSystems" items="${osOptions}"/>
			
			<br><br>
			
			<input type="submit" value="Submit" />
		
		</form:form>
	</body>
</html>