<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/bootstrap-select.css">
<script src="resources/vendor/jquery.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<script src="resources/js/bootstrap-select.js"></script>
<!--  <script src="resources/utility/login.js"></script> -->
<title>Login</title>
</head>
<body>
	<br><br>
	<div class="login">
		<div class="row vertical-offset-100">
			<div class="col-md-4 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Please Log in</h3>
					</div>
					<div class="panel-body">
						<form:form accept-charset="UTF-8" role="form" action="login.do" modelAttribute="loginForm" method="POST">
							<fieldset>
								<div class="form-group">
									<form:input path="userName" class="form-control" placeholder="E-mail" name="username"
										id="username" type="text" required="required"/>
								</div>
								<div class="form-group">
									<form:input path="password" class="form-control" placeholder="Password"
										name="password" id="password" type="password" required="required"/>
								</div>

								<input class="btn btn-lg btn-primary btn-block" type="submit"
									value="Login">
							</fieldset>
							
						</form:form>
						<p class="text-center"><a href="register.do">Create an Account</a></p>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>