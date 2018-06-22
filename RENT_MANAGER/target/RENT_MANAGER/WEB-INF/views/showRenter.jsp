<%@ page session="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details</title>
</head>
<jsp:include page="./fragments/header.jsp" />
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<h1>Renter Details</h1>
				<br />

				<div class="row">
					<label class="col-sm-4">Room No.</label>
					<div class="col-sm-8">${renter.renterId}</div>
				</div>

				<div class="row">
					<label class="col-sm-4">First Name</label>
					<div class="col-sm-8">${renter.firstName}</div>
				</div>

				<div class="row">
					<label class="col-sm-4">Last Name</label>
					<div class="col-sm-8">${renter.lastName}</div>
				</div>

				<div class="row">
					<label class="col-sm-4">Email</label>
					<div class="col-sm-8">${renter.emailId}</div>
				</div>
				<div class="row">
					<label class="col-sm-4">Date of Birth</label>
					<div class="col-sm-8">${renter.dob}</div>
				</div>
				<div class="row">
					<label class="col-sm-4">Aadhaar</label>
					<div class="col-sm-8">${renter.aadhaarNo}</div>
				</div>
				<div class="row">
					<label class="col-sm-4">Phone</label>
					<div class="col-sm-8">${renter.phone}</div>
				</div>
				<div class="row">
					<label class="col-sm-4">Address</label>
					<div class="col-sm-8">${renter.address}</div>
				</div>
				<div class="row">
					<label class="col-sm-4">PinCode</label>
					<div class="col-sm-8">${renter.pincode}</div>
				</div>
				<div class="row">
					<label class="col-sm-4">City</label>
					<div class="col-sm-8">${renter.city}</div>
				</div>
				<div class="row">
					<label class="col-sm-4">State</label>
					<div class="col-sm-8">${renter.state}</div>
				</div>
			</div>




			<div class="col-md-6">
				<h1>Rent Payment</h1>
				<br />
				<spring:url value="/savePaymntDtl" var="userActionUrl" />
				<form:form class="form-horizontal" method="post"
					modelAttribute="rentPaymnt" action="${userActionUrl}">


					<div class="form-group">
						<label class="col-sm-4 control-label">Date:</label>
						<div class="col-sm-8">
							<form:input path="rentdate" id="datepicker" name="rentdate"
								placeholder="Enter Date" type="text" class="form-control " required="required" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">Room No.:</label>
						<div class="col-sm-8">
							<form:input path="roomno" name="roomno"
								placeholder="Enter Room No." type="number" class="form-control "
								value="${renter.renterId}" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">Meter Reading From:</label>
						<div class="col-sm-8">
							<form:input path="meterfrom" id="meterfrom" name="meterfrom"
								placeholder="Enter Meter Reading From" type="number"
								class="form-control " />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">Meter Reading Till:</label>
						<div class="col-sm-8">
							<form:input path="metertill" id="metertill" name="metertill"
								placeholder="Enter Meter Reading To" type="number"
								class="form-control " />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">Total Meter Unit:</label>
						<div class="col-sm-8">
							<form:input path="totalunit" id="totalunit" name="totalunit"
								placeholder="Enter Total Meter Unit" type="number"
								class="form-control " />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">Electricity Bill:</label>
						<div class="col-sm-8">
							<form:input path="electricitybill" id="electricitybill"
								name="electricitybill"
								placeholder="Enter Total Electricity Bill" type="number"
								class="form-control " />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">Room Rent:</label>
						<div class="col-sm-8">
							<form:input path="roomrent" id="roomrent" name="roomrent"
								placeholder="Enter Room Rent" type="number"
								class="form-control " />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">Total Amount Due:</label>
						<div class="col-sm-8">
							<form:input path="totalamt" id="totalamt" name="totalamt"
								placeholder="Enter Total Amount" type="number"
								class="form-control " />
						</div>
					</div>


					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn-lg btn-primary pull-right">Save
								Details</button>
						</div>
					</div>
				</form:form>
			</div>

		</div>
		<table class="table table-striped">
			<h1>Payment History</h1>
			<thead>
				<tr>
					<th>Date</th>
					<th>Room No.</th>
					<th>Unit</th>
					<th>Electricity Bill</th>
					<th>Room Rent</th>
					<th>Total Paid</th>
					<th>Action</th>
				</tr>
			</thead>

			<c:forEach var="rentPay" items="${rentPaymntByRoom}">

				<tr>
					<td>${rentPay.rentdate}</td>
					<td>${rentPay.roomno}</td>
					<td>${rentPay.totalunit}</td>
					<td>${rentPay.electricitybill}</td>
					<td>${rentPay.roomrent}</td>
					<td>${rentPay.totalamt}</td>

					<c:set var = "dat" value = "${fn:replace(rentPay.rentdate, '/', '')}" />

					<td><spring:url value="${dat}${rentPay.roomno}showrdtl" var="rentUrl" /> 
						<spring:url value="${rentPay.roomno}deleterdtl" var="deleterentUrl" /> 
						<spring:url value="${rentPay.roomno}updaterdtl" var="updaterentUrl" />

						<button class="btn btn-info rdtlshw" onclick="location.href='${rentUrl}'">Query</button>
						<button class="btn btn-primary rdtlupdt" onclick="location.href='${rentUrl}'">Update</button>
						<button class="btn btn-danger" onclick="location.href='${deleterentUrl}'">Delete</button></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
<jsp:include page="./fragments/footer.jsp" />
</html>