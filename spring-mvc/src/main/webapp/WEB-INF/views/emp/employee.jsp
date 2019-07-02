<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<ul>
		<li>employeeId : ${employee.empId }"</li>
		<li>name : ${employee.firstName } ${employee.lastName }</li>
		<li>email : ${employee.email }</li>
		<li>phoneNumber : ${employee.phone }</li>
		<li>hireDate : ${employee.hireDate }</li>
		<li>jobId : ${employee.jobId }</li>
		<li>salary : ${employee.salary }</li>
		<li>commission : ${employee.commission }</li>
		<li>managerId : ${employee.managerId }</li>
		<li>deptId : ${employee.deptId }</li>
	</ul>

</body>
</html>