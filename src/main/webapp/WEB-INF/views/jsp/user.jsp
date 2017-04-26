<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<t:template>
	<jsp:attribute name="title">個人資訊</jsp:attribute>
	<jsp:body>
		<div class="row">
			<div class="col-md-6 col-md-offset-1">
			<h1>個人資訊</h1>
			<table class="table table-striped table-bordered">
			<tbody>
				<tr>
					<td>帳號</td>
					<td colspan="2">${user.account}</td>
					<td rowspan="2">圖像</td>
				</tr>
				<tr>
					<td>密碼</td>
					<td colspan="2">${user.password}</td>
				</tr>
				<tr>
					<td>email</td>
					<td colspan="3">${user.email}</td>
				</tr>
			</tbody>
		</table>
		</div>
			<div class="col-md-5"></div>
		</div>
	</jsp:body>
</t:template>