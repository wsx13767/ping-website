<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<t:template>
	<jsp:body>
		<h1>購物車</h1>
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>商品圖片</th>
					<th>商品名稱</th>
					<th>數量</th>
					<th>單價</th>
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
				</tr>
				<tr>
					<td>測試</td>
					<td>測試</td>
					<td>測試</td>
					<td>測試</td>
					<td>測試</td>
				</tr>
				<tr><td colspan="5"></td></tr>
				<tr>
					<td colspan="4">商品總額</td>
					<td>1000000</td>
				</tr>
				<tr>
					<td colspan="4">運費</td>
					<td>100</td>
				</tr>
				<tr>
					<td colspan="4">總計</td>
					<td>100000</td>
				</tr>
			</tbody>
		</table>
	</jsp:body>
</t:template>