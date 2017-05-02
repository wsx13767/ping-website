$(document).ready(function() {
	$( "#accordion" ).accordion();

	var availableTags = [
		"ActionScript",
		"AppleScript",
		"Asp",
		"BASIC",
		"C",
		"C++",
		"Clojure",
		"COBOL",
		"ColdFusion",
		"Erlang",
		"Fortran",
		"Groovy",
		"Haskell",
		"Java",
		"JavaScript",
		"Lisp",
		"Perl",
		"PHP",
		"Python",
		"Ruby",
		"Scala",
		"Scheme"
	];
	$( "#autocomplete" ).autocomplete({
		source: availableTags
	});



	$( "#button" ).button();
	$( "#button-icon" ).button({
		icon: "ui-icon-gear",
		showLabel: false
	});



	$( "#radioset" ).buttonset();



	$( "#controlgroup" ).controlgroup();



	$( "#tabs" ).tabs();



	$( "#dialog" ).dialog({
		autoOpen: false,
		width: 400,
		buttons: [
			{
				text: "Ok",
				click: function() {
					$( this ).dialog( "close" );
				}
			},
			{
				text: "Cancel",
				click: function() {
					$( this ).dialog( "close" );
				}
			}
		]
	});

	// Link to open the dialog
	$( "#dialog-link" ).click(function( event ) {
		$( "#dialog" ).dialog( "open" );
		event.preventDefault();
	});






	$( "#slider" ).slider({
		range: true,
		values: [ 17, 67 ]
	});



	$( "#progressbar" ).progressbar({
		value: 20
	});



	$( "#spinner" ).spinner();



	$( "#menu" ).menu();



	$( "#tooltip" ).tooltip();

	// Hover states on the static widgets
	$( "#dialog-link, #icons li" ).hover(
		function() {
			$( this ).addClass( "ui-state-hover" );
		},
		function() {
			$( this ).removeClass( "ui-state-hover" );
		}
	);
	
//	$('input[name="kind"]').change(function() {
//		var result = $('input[name="kind"]:checked').val();
//		if (result == "food") {
//			$("fieldset").attr("disabled","true");
//			$('input[name="suger"]').removeAttr("checked");
//			$('input[name="size"]').removeAttr("checked");
//			$('input[name="ice"]').removeAttr("checked");
//		} else if (result == "drink") {
//			$("fieldset").removeAttr("disabled")
//		}
//	});

});

function resetOrder() {
	$('input[name="title"]').val("");
	$('input[name="maxcount"]').val("");
	$('input[name="itemName"]').val("");
	$('textarea[name="itemInfo"]').val("");
	$('input[name="kind"]').removeAttr("checked");
	$('input[name="suger"]').removeAttr("checked");
	$('input[name="size"]').removeAttr("checked");
	$('input[name="ice"]').removeAttr("checked");
}


function logout() {
	$("#logout").submit();
}