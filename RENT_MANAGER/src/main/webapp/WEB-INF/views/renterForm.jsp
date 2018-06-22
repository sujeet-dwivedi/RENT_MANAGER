<%@ page session="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Renter Form</title>
</head>
<jsp:include page="./fragments/header.jsp" />
<body>

	<div class="container">
		<h1>Add Renter</h1>
		<br />

		<spring:url value="/saveRenter" var="userActionUrl" />

		<form:form class="form-horizontal" method="post"
			modelAttribute="renterForm" action="${userActionUrl}">

			<div class="form-group">
				<label class="col-sm-2 control-label">Room No.</label>
				<div class="col-sm-10">
					<form:input path="renterId" type="text" class="form-control "
						id="renterId" placeholder="roomNo" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">First Name</label>
				<div class="col-sm-10">
					<form:input path="firstName" type="text" class="form-control "
						id="firstName" placeholder="firstName" />
				</div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label">Last Name</label>
				<div class="col-sm-10">
					<form:input path="lastName" class="form-control" id="lastName"
						placeholder="lastName" />
				</div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label">Email</label>
				<div class="col-sm-10">
					<form:input path="emailId" class="form-control" id="emailId"
						placeholder="emailId" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Date of Birth</label>
				<div class="col-sm-10">
					<form:input path="dob" class="form-control" id="dob"
						placeholder="dob" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Aadhaar</label>
				<div class="col-sm-10">
					<form:input path="aadhaarNo" class="form-control" id="aadhaarNo"
						placeholder="aadhaarNo" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Phone</label>
				<div class="col-sm-10">
					<form:input path="phone" class="form-control" id="phone"
						placeholder="phone" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Address</label>
				<div class="col-sm-10">
					<form:input path="address" class="form-control" id="address"
						placeholder="address" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">PinCode</label>
				<div class="col-sm-10">
					<form:input path="pincode" class="form-control" id="pincode"
						placeholder="pincode" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">City</label>
				<div class="col-sm-10">
					<form:input path="city" class="form-control" id="city"
						placeholder="city" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">State</label>
				<div class="col-sm-10">
					<form:input path="state" class="form-control" id="state"
						placeholder="state" />
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
<jsp:include page="./fragments/footer.jsp" />
</html>