$(document).ready(function() {
	$(".table tbody tr td .btn-danger").click(function(a) {
//		console.log("tt");
		console.log($(this).val());
//		console.log(a);
		
		$("#id").val($(this).val());
		$("#tooo").submit();
		
	});
});
function showDetail(id) {
	console.log(id);
	$.ajax({
		success:function() {
			
		}
	});
}
