<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p>부서 정보</p>
	<table>
		<thead>
			<tr>
				<th>deptId</th>
				<th>deptName</th>
				<th>managerId</th>
				<th>locationId</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dept" items="${depts }">
				<tr>
					<td>${dept.deptId }</td>
					<td><a href="employees.do?deptId=${dept.deptId }">${dept.deptName }</a></td>
					<td>${dept.managerId }</td>
					<td>${dept.locationId }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>