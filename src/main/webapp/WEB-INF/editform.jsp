<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor = "FFB38E">
<jsp:include page="/WEB-INF/welcome.jsp"/>
<br><br>
	<form method="POST" action="./edit">
		<table align="center">
			<tr>
				<td><h3>Employee ID</h3></td>
				<td>${emp.eid}</td>
			</tr>
			
			
			<tr>
				<td><h3>Employee Name</h3></td>
				<td><input type="text" name="ename" value="${emp.ename}"></td>
			</tr>
			
			<tr>
				<td><h3>Employee Salary</h3></td>
				<td><input type="text" name="esal" value="${emp.esal}"></td>
			</tr>
			
			<tr>
				<td><h3>Employee Address</h3></td>
				<td><input type="text" name="eaddr" value="${emp.eaddr}"></td>
			</tr>
			
			<tr>
				<td><h3><input type="submit" value="UPDATE EMPLOYEE"></h3>
				</td>
			</tr>
		</table>
		<input type="hidden" name="eid" value="${emp.eid}"/>
		
	</form>

</body>
</html>