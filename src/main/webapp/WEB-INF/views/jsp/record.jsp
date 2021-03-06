<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<t:template>
	<jsp:body>
	<link href="<c:url value="/resources/css/ping/record.css"/>" rel="stylesheet">
	<script src="<c:url value="/resources/js/ping/record.js"/>"></script>
		<h1>購買紀錄</h1>
		<div class="date-search-div">
			<label>購買日期　</label>
			<form action="<c:url value="/views/record/search"/>" method="post">
				<input type="text" id="date-1" name="date" class="form-control" style="width: 100px;display: inline;">～
				<input type="text" id="date-2" class="form-control" style="width: 100px;display: inline;">
				<button type="submit" class="btn btn-primary"> 查詢</button>
			</form>
		</div>
		<br/>
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>商品圖片</th>
					<th>商品名稱</th>
					<th>數量</th>
					<th>單價</th>
					<th>運費</th>
					<th>小計</th>
					
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>測試</td>
					<td>測試</td>
					<td>測試</td>
					<td>測試</td>
					<td>測試</td>
					<td>測試</td>
				</tr>
				<tr>
					<td>測試</td>
					<td>測試</td>
					<td>測試</td>
					<td>測試</td>
					<td>測試</td>
					<td>測試</td>
				</tr>

			</tbody>
		</table>
	</jsp:body>
</t:template>