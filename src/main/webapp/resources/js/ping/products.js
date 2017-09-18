$(document).ready(function() {
	$(".table tbody tr td .btn-danger").click(function(a) {
//		console.log("tt");
//		console.log($(this).val());
//		console.log(a);
		
		$("#id").val($(this).val());
		$("#tooo").submit();	
	});
	
	
	//jqgrid
	$("#productsGrid").jqGrid({
		url:"products/showAllProducts",
		mtype:"POST",
		datatype: "json",
		colModel: [
			{label:'ID', name:'id', hidden:true, hidedlg:true},
			{label:'標題', name:'title'},
			{label:'種類', name:'kind'},
			{label:'價錢', name:'money'},
			{label:'資訊', name:'info'},
			{label:'商品名', name:'name'},
			{label:'數量', name:'count'},
			{label:'狀態', name:'status', hidden:true, hidedlg:true}
			
			],
		width:900,
	//	height:120,
		loadonce: false,
	//	rowNum: 5,
		//rowList: [5, 10, 20, 30],
		pager: "#productsGridPager",
		viewrecords: true,
		caption: "商品"
	});
	$('#productsGrid').navGrid('#productsGridPager',
            { edit: false, add: false, del: false, search: true, refresh: false, view: false, position: "left", cloneToTop: true });
});
function showDetail(id) {
	console.log(id);
	$.ajax({
		success:function() {
			
		}
	});
}
