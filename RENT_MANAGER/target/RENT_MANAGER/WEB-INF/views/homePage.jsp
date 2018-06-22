<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Home Page</title>
</head>
<jsp:include page="./fragments/header.jsp" />
<body>

	<div class="container">
		<h1>All Renters</h1>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>Room No.</th>
					<th>Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
			</thead>

			<c:forEach var="renter" items="${renters}">
				<tr>
					<td>${renter.renterId}</td>
					<td>${renter.firstName} ${renter.lastName}</td>
					<td>${renter.emailId}</td>

					<td><spring:url value="${renter.renterId}" var="renterUrl" />
						<spring:url value="${renter.renterId}delete" var="deleteUrl" />
						<spring:url value="${renter.renterId}update" var="updateUrl" />

						<button class="btn btn-info"
							onclick="location.href='${renterUrl}'">Query</button>
						<button class="btn btn-primary"
							onclick="location.href='${updateUrl}'">Update</button>
						<button class="btn btn-danger"
							onclick="location.href='${deleteUrl}'">Delete</button></td>
				</tr>
			</c:forEach>
		</table>

	</div>

</body>
<jsp:include page="./fragments/footer.jsp" />
</html>