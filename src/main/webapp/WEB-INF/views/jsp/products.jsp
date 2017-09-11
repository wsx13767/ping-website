<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<t:template>
	<jsp:body>
	<script src="<c:url value="/resources/js/grid/grid.locale-tw.js" />"></script>
	<script src="<c:url value="/resources/js/grid/jquery.jqGrid.min.js" />"></script>
	<link rel="stylesheet" href="<c:url value="/resources/css/grid/ui.jqgrid-bootstrap.css"/>"> 
	<script src="<c:url value="/resources/js/ping/products.js"/>"></script>
		<h1>所有商品</h1>
		<br/>
		<form id="tooo" action="<c:url value="/views/products/deleteProduct"/>" method="post">
			<input type="hidden" name="id" id="id">
		</form>
		<!-- 
		<table class="table table-striped table-hover">
			<thead>
				<tr class="info">
					<th>標題</th>
					<th>商品</th>
					<th>數量</th>
					<th>單價</th>
					<th>刪除</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${products}" var="item">
					<tr onclick="showDetail('${item.id}');">
						<td>${item.title}</td>
						<td>${item.name}</td>
						<td>${item.count}</td>
						<td>${item.money}</td>
						<td><button type="button" class="btn btn-danger" value="${item.id}">x</button></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		 -->
		 <div style="width: 100%;">
		 <table id="productsGrid"></table>
		<div id="productsGridPager"></div>
		</div>
	</jsp:body>
</t:template>