<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<t:template>
	<jsp:body>
		<script src="resources/js/ping/index.js"></script>
		${account}
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

	</jsp:body>
</t:template>