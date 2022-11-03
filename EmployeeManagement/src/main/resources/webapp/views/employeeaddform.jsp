<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">

<title>Save Employee</title>
</head>

<body>

	<div class="container">

		<h3>employee Directory</h3>
		<hr>

		<p class="h4 mb-4">Enter employee</p>

		<form action="/employees/save" method="POST">

			<!-- Add hidden form field to handle update -->
			<input type="hidden" name="employeeid" value="${employee.employeeid}" />

			<div class="form-inline">
				<input type="text" name="name" value="${employee.firstname}"
					class="form-control mb-4 col-4" placeholder="Name">



			</div>

			<div class="form-inline">

				<input type="text" name="lastname" value="${employee.lastname}"
					class="form-control mb-4 col-4" placeholder="lastname">



			</div>

			<div class="form-inline">

				<input type="text" name="email" value="${Employee.email}"
					class="form-control mb-4 col-4" placeholder="email">



			</div>
	<input name="${_csrf.parameterName }"
	 type="hidden" value="${_csrf.token}"/>
			<button type="submit" class="btn btn-info col-2">Save</button>

		</form>

		<hr>
		<a href="/books/list">Back to employee List</a>

	</div>
</body>
</html>