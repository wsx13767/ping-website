$(document).ready(function() {
	$("#date-1").datepicker({
		changeMonth: true,
		changeYear: true,
		showAnim: "clip",
		dateFormat: "yy-mm-dd"
	}).on("change",function() {
		$("#date-2").datepicker("option","minDate", getDate(this));
	});
	
	$("#date-2").datepicker({
		changeMonth: true,
		changeYear: true,
		showAnim: "clip",
		dateFormat: "yy-mm-dd"
	}).on("change",function() {
		$("#date-1").datepicker("option","maxDate", getDate(this));
	});
	
	
	function getDate( element ) {
		var date;
		try {
			date = $.datepicker.parseDate("yy-mm-dd", element.value );
		} catch( error ) {
			date = null;
		}
		return date;
	}
});