<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<t:template>
	<jsp:body>
		<h1><spring:message code="cart.cart"/></h1>
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th><spring:message code="cart.itemImg"/></th>
					<th><spring:message code="cart.itemName"/></th>
					<th><spring:message code="cart.count"/></th>
					<th><spring:message code="cart.price"/></th>
					<th><spring:message code="cart.total"/></th>
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