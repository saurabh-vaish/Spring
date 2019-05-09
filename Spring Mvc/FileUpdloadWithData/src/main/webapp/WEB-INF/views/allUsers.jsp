<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to user Registration page</h2>

	<c:if test="${!empty user }">

		<table border=1>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>FileName</th>
				<th>View</th>
			</tr>
			<c:forEach items="${user}" var="u">
				<tr>
					<td>${u.id}</td>
					<td>${u.userName}</td>
					<td>${u.userEmail }</td>
					<td>${u.userFileName}</td>
<%-- 					<td><a href="get?uid=${u.id}">View</a></td>
 --%>					<td><img src="get?uid=${u.id}" width=200px height=100px/> </td>
				</tr>

			</c:forEach>
		</table>
	</c:if>

</body>
</html>