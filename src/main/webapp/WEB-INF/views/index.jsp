<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% String qq = "123"; 
	request.setAttribute("qq", qq);
%>
<t:template>
	<jsp:body>
	<script src="<c:url value="/resources/js/grid/grid.locale-tw.js" />"></script>
	<script src="<c:url value="/resources/js/grid/jquery.jqGrid.min.js" />"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css"> 
	<link rel="stylesheet" href="<c:url value="/resources/css/grid/ui.jqgrid-bootstrap.css"/>"> 
		${qq}
		<script src="<c:url value="/resources/js/ping/index.js"/>"></script>
		${sessionAccount}
		<spring:message code="tamplate.language" />
		<h1>hello</h1>
		<div class="circle"></div>
		<ul class="bar2">
			<li>測試</li>
			<li>測試</li>
			<li>測試</li>
		</ul>
		<h2 class="demoHeaders">Selectmenu</h2>
<select id="selectmenu">
	<option>Slower</option>
	<option>Slow</option>
	<option selected="selected">Medium</option>
	<option>Fast</option>
	<option></option>
</select>
		<!-- Datepicker -->
<h2 class="demoHeaders">Datepicker</h2>
<div id="datepicker"></div><input type="text" id="alternate" size="30" disabled="disabled">
<button type="button" onclick="doClick()">按壓</button>
<div id="testdiv">
			<table id="test"></table>
			<div id="jqGridPager"></div>
		</div>
	<script>
		function doClick() {
			$("#test").jqGrid('clearGridData');
			$("#testdiv").html("<table id=\"test\"></table><div id=\"jqGridPager\"></div>")
			$("#test").jqGrid({
				url:"test",
				mtype:"POST",
				datatype: "json",
				styleUI : 'Bootstrap',
				colModel: [
					{label:'ID', name:'id'},
					{label:'種類', name:'kind'},
					{label:'價錢', name:'money'},
					{label:'資訊', name:'info'},
					{label:'商品名', name:'name'},
					{label:'數量', name:'count'},
					{label:'狀態', name:'status'},
					{label:'標題', name:'title'}
					],
				width:600,
				height:120,
				loadonce: true,
				rowNum: 5,
				rowList: [5, 10, 20, 30],
				pager: "#jqGridPager",
				viewrecords: true,
				caption: "jqGrid with listing"
			});
			
		//	$("#test").setGridParam({url:"products/test"}).trigger('reloadGrid');
		}
	</script>

	</jsp:body>
</t:template>