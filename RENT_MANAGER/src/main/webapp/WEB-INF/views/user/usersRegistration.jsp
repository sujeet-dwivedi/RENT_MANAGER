<%@ page session="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/bootstrap-select.css">
<script src="resources/vendor/jquery.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<script src="resources/js/bootstrap-select.js"></script>
<title>Register</title>
</head>
<body>

<div class="container">

			<h1>Add User</h1>
	<br />

	<spring:url value="/saveUpdateUser" var="userRegisterUrl" />

	<form:form class="form-horizontal" method="post" modelAttribute="user" action="${userRegisterUrl}">

		<form:hidden path="userId" />

			<div class="form-group">
				<label class="col-sm-2 control-label">First Name</label>
				<div class="col-sm-10">
					<form:input path="firstName" type="text" class="form-control " id="firstName" placeholder="firstName" />
				</div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label">Last Name</label>
				<div class="col-sm-10">
					<form:input path="lastName" class="form-control" id="lastName" placeholder="lastName" />
				</div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label">Email</label>
				<div class="col-sm-10">
					<form:input path="emailId" class="form-control" id="emailId" placeholder="emailId" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Phone</label>
				<div class="col-sm-10">
					<form:input path="phone" class="form-control" id="phone" placeholder="phone" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">User Name</label>
				<div class="col-sm-10">
					<form:input path="userName" class="form-control" id="userName" placeholder="userName" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Password</label>
				<div class="col-sm-10">
					<form:password path="password" class="form-control" id="password" placeholder="password" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Re-Enter Password</label>
				<div class="col-sm-10">
					<form:password path="rePassword" class="form-control" id="rePassword" placeholder="rePassword" />
				</div>
			</div>

		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">

						<button type="submit" class="btn-lg btn-primary pull-right">Add</button>

			</div>
		</div>
	</form:form>

</div>

</body>
</html>