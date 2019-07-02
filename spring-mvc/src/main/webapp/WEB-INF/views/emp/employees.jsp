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

	<table>
		<thead>
			<tr>
				<th>employeeId</th>
				<th>Name</th>
				<th>email</th>
				<th>phoneNumber</th>
				<th>hireDate</th>
				<th>jobId</th>
				<th>salary</th>
				<th>commissionPct</th>
				<th>managerId</th>
				<th>departmentId</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="emp" items="${employees }">
				<tr>
					<td>${emp.empId }</td>
					<td><a href="employee.do?empId=${emp.empId }">${emp.firstName } ${emp.lastName }</a></td>
					<td>${emp.email }</td>
					<td>${emp.phone }</td>
					<td>${emp.hireDate }</td>
					<td>${emp.jobId }</td>
					<td>${emp.salary }</td>
					<td>${emp.commission }</td>
					<td>${emp.managerId }</td>
					<td>${emp.deptId }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>