<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
<style>
.t1 {
	color: red;
}
</style>
</head>
<body>
	<div class='container'>
		<h3>employee Directory</h3>
		<hr>

		<!-- Add a search form -->





		<form action="/employees/search" class="form-inline">

			<!-- Add a button -->
			<a href="/employees/showFormForAdd"
				class="btn btn-primary btn-sm mb-3"> Add employee </a> <input
				type="search" firstname="firstname" placeholder="firstname"
				class="form-control-sm ml-5 mr-2 mb-3" /> 
				<input type="search"
				lastname="lastname" lastname="lastname" class="form-control-sm mr-2 mb-3" />

			<button type="submit" class="btn btn-success btn-sm mb-3">Search</button>
			<a href="/logout"
				class="btn btn-primary btn-sm mb-3 mx-auto"> Logout </a>

		</form>

		<h1>List Of books</h1>
		<table class="table table-bordered table-striped t1">
			<thead class="thead-dark">
				<tr>
					<th>firstName</th>
					<th>lastname</th>
					<th>email</th>

					<th>Action</th>

				</tr>
			</thead>

			<tbody>
				<c:forEach items="${employee}" var="tempemployee">
					<tr>
						<td><c:out value="${tempemployee.firstname}" /></td>
						<td><c:out value="${tempemployee.lastname}" /></td>
						<td><c:out value="${tempemployee.email}" /></td>

						<td>
							<!-- Add "update" button/link --> <a
							href="/employees/showFormForUpdate?employeeId=${tempeployee.employeeid}"
							class="btn btn-warning btn-sm"> Update </a> <!-- Add "delete" button/link -->
							<a
							href="/employees/delete?employeeId=${tempemployee.employeeid}"
							class="btn btn-danger btn-sm"
							onclick="if (!(confirm('Are you sure you want to delete this employee?'))) return false">
								Delete </a>

						</td>


					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>
</body>
</html>