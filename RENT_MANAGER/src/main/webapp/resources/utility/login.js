$(function() {
	console.log( "ready!" );
/*	$(".navbar-default").hide();
	$("#homePage").hide();
	$("#tenantDetailTable").hide();
	$("#tenantRgtsn").hide();*/
	var userN;
	var pass;
	$(".btn-lg").click(function() {
		userN = $("#email").val();
		pass = $("#password").val();
		var loginData= userN+","+pass;
		$.ajax({
			type : "GET",
			url : 'validateLogin.do',
			data : {
		        "userN" : loginData
		    },
			success : function(data) {
				console.log("SUCCESS: ", data);
				if(data == 1){
					console.log("okkkkkkkkkkkkkkkkk!!!!!!!!!");
				}
				/*$(".login").hide();
				$(".navbar-default").show();
				$("#homePage").show();
				$("#tenantDetailTable").hide();
				$("#tenantRgtsn").hide();*/
			},
			error : function(e) {
				console.log("ERROR: ", e);
				/*$(".login").show();
				$(".navbar-default").hide();
				$("#homePage").hide();
				$("#tenantDetailTable").hide();
				$("#tenantRgtsn").hide();*/
			},
			done : function(e) {
				console.log("DONE");
			}
		});

	}); 

	/*$("#tenantDtl").click(function() {
		$(".login").hide();
		$(".navbar-default").show();
		$("#homePage").hide();
		$("#tenantDetailTable").show();
		$("#tenantRgtsn").hide();
	}); 

	$("#tenantRgst").click(function() {
		$(".login").hide();
		$(".navbar-default").show();
		$("#homePage").hide();
		$("#tenantDetailTable").hide();
		$("#tenantRgtsn").show();

	}); */
});