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
	if (location.href.endsWith(registerLogin)) {
		$("#registerLogin").show();
		$("#logout").hide();
	} else {
		$("#registerLogin").hide();
		$("#logout").show();
	}
});
function logout() {
	$("#logout").submit();
}