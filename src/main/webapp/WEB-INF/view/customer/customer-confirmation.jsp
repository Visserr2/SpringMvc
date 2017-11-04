<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Customer confirmation page</title>
	</head>
	
	<body>
		
		The customer is confirmed: ${customer.firstName} ${customer.lastName}
		
		<br><br>
		
		Free passes ${customer.freePasses}
		
		<br><br>
		
		Postal code ${customer.postalCode}
		
		<br><br>
		
		<hr />
		<a href="/SpringMvc">Go back</a> 
		
	</body>
</html>