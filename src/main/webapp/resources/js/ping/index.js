$(document).ready(function() {
//	$( "#datepicker" ).datepicker({
//		inline: true
//	});
	$( "#datepicker" ).datepicker({
		altField: "#alternate",
		altFormat: "DD, d MM, yy"
	});
	$( "#selectmenu" ).selectmenu();
});