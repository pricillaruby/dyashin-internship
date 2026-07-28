<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <html>
	<head>
		<title>Student Form</title>
		<style>
			.error{color:red;font-size:14px;}
		</style>
	</head>
	<body>
		<h2>Student Registration Form</h2>
		
		<form:form action="processForm" method="post" modelAttribute="student">
			Name: <form:input path="name"/>
			<form:errors path="name" cssClass="error" /><br></br>
			
			Email: <form:input path="email"/>
			<form:errors path="email" cssClass="error" /><br></br>
			
			Course:
			<form:select path="course">
				<form:option value="" label="--Select Course--"/>
				<form:options items="${courses}"/>
			</form:select>
			<form:errors path="course" cssClass="error"/><br></br>
			
			<input type="submit" value="Submit"/>
			
		</form:form>
	</body>
</html>