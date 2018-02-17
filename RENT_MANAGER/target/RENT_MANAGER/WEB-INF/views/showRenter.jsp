<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details</title>
</head>
<jsp:include page="./fragments/header.jsp" />
<body>
<div class="container">

<%-- 	<c:if test="${not empty msg}">
		<div class="alert alert-${css} alert-dismissible" role="alert">
			<button type="button" class="close" data-dismiss="alert"
                                aria-label="Close">
				<span aria-hidden="true">×</span>
			</button>
			<strong>${msg}</strong>
		</div>
	</c:if> --%>

	<h1>Renter Detail</h1>
	<br />

	<div class="row">
		<label class="col-sm-2">ID</label>
		<div class="col-sm-10">${renter.renterId}</div>
	</div>

	<div class="row">
		<label class="col-sm-2">First Name</label>
		<div class="col-sm-10">${renter.firstName}</div>
	</div>

	<div class="row">
		<label class="col-sm-2">Last Name</label>
		<div class="col-sm-10">${renter.lastName}</div>
	</div>

	<div class="row">
		<label class="col-sm-2">Email</label>
		<div class="col-sm-10">${renter.emailId}</div>
	</div>
	<div class="row">
		<label class="col-sm-2">Date of Birth</label>
		<div class="col-sm-10">${renter.dob}</div>
	</div>
		<div class="row">
		<label class="col-sm-2">Aadhaar</label>
		<div class="col-sm-10">${renter.aadhaarNo}</div>
	</div>
	</div>
		<div class="row">
		<label class="col-sm-2">Phone</label>
		<div class="col-sm-10">${renter.phone}</div>
	</div>
		</div>
		<div class="row">
		<label class="col-sm-2">Address</label>
		<div class="col-sm-10">${renter.address}</div>
	</div>
		</div>
		<div class="row">
		<label class="col-sm-2">PinCode</label>
		<div class="col-sm-10">${renter.pincode}</div>
	</div>
			</div>
		<div class="row">
		<label class="col-sm-2">City</label>
		<div class="col-sm-10">${renter.city}</div>
	</div>
			</div>
		<div class="row">
		<label class="col-sm-2">State</label>
		<div class="col-sm-10">${renter.state}</div>
	</div>

</div>
</body>
<jsp:include page="./fragments/footer.jsp" />
</html>