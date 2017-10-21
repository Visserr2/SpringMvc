<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	
		<h2>Hello World of Spring</h2>
		<!-- Get parameter directly from http request -->
		<p>Student name: ${param.studentName}</p>
		<!-- Get data from the model -->
		<p>The message: ${message}</p>
		<hr />
		<a href="/SpringMvcDemo">Go back</a> 
	
	</body>
</html>