$(function() {


	$("#meterfrom").change(function() {
		var from = parseInt($("#meterfrom").val());
		var to = parseInt($("#metertill").val());
		var unit = to-from;
		if(from != "" && to != ""){
			$("#totalunit").val(Math.round(unit));
			$("#electricitybill").val(Math.round(unit*8));
			
		}
	});
	
	$("#metertill").change(function() {
		var from = parseInt($("#meterfrom").val());
		var to = parseInt($("#metertill").val());
		var unit = to-from;
		if(from !="" && to !=""){
			$("#totalunit").val(Math.round(unit));
			$("#electricitybill").val(Math.round(unit*8));
		}
	});
	
	$("#roomrent").change(function() {
		var bill = parseInt($("#electricitybill").val());
		var rent = parseInt($("#roomrent").val());
		var total_rent = bill+rent;
		$("#totalamt").val(total_rent);
	});

	/*
	 * hide rent detail fields 
	 */
	
	$(".rdtlshw").click(function(){
	    alert("The paragraph was clicked.");
	    
	});
	
	

});