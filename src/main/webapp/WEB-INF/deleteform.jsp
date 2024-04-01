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
	<form method="post" action="./delete">
		<table align="center">
			<tr>
				<td><h3>Employee ID</h3></td>
				<td><input type="text" name="eid"></td>
			</tr>
			
			<tr>
				<td><h3><input type="submit" value="DELETE EMPLOYEE"></h3></td>
			</tr>
		</table>
		
	</form>

</body>
</html>