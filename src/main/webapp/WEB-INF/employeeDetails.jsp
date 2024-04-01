<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body bgcolor = "FFB38E">
<jsp:include page="/WEB-INF/welcome.jsp"/>
<br><br><br><br>
	
		<table align="center">
			<tr>
				<td><h3>Employee ID</h3></td>
				<td>${emp.eid}</td>
			</tr>
			
			
			<tr>
				<td><h3>Employee Name</h3></td>
				<td>${emp.ename}</td>
			</tr>
			
			<tr>
				<td><h3>Employee Salary</h3></td>
				<td>${emp.esal}</td>
			</tr>
			
			<tr>
				<td><h3>Employee Address</h3></td>
				<td>${emp.eaddr}</td>
			</tr>
			
			
		</table>
		
	

</body>

</body>
</html>