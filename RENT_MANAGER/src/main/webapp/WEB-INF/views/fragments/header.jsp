<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<head>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/bootstrap-select.css">
<script src="resources/vendor/jquery.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<script src="resources/js/bootstrap-select.js"></script>
<script type="text/javascript" src="resources/utility/utility.js"></script>
<title></title>
</head>
<spring:url value="/home" var="urlHome" />
<spring:url value="/addRenter" var="urlAddRenter" />
<spring:url value="/logout" var="urlLogout" />

<nav class="navbar navbar-inverse ">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="${urlHome}">Rent Manager</a>
		</div>
		<div id="navbar">
			<ul class="nav navbar-nav navbar-left">
				 <li class=""><a href="${urlAddRenter}">Add Renter</a></li> 
			</ul>
		</div>
				<div id="navbar">
			<ul class="nav navbar-nav navbar-right">
				 <li class=""><a href="${urlLogout}">Logout</a></li> 
			</ul>
		</div>
	</div>
</nav>