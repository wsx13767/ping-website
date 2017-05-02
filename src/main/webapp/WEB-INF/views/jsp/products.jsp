<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<t:template>
	<jsp:body>
	<link href="resources/css/ping/record.css" rel="stylesheet">
	<script src="resources/js/ping/record.js"></script>
		<h1>所有商品</h1>
		<br/>
		<table class="table table-striped table-hover">
			<thead>
				<tr class="info">
					<th>圖片</th>
					<th>標題</th>
					<th>商品</th>
					<th>資訊</th>
					<th>種類</th>
					<th>數量</th>
					<th>單價</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${products}" var="item">
					<tr>
						<td>${item.img}</td>
						<td>${item.title}</td>
						<td>${item.name}</td>
						<td>${item.info}</td>
						<td>${item.kind}</td>
						<td>${item.count}</td>
						<td>${item.money}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</jsp:body>
</t:template>