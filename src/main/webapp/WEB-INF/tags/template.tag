<%@ tag language="java" pageEncoding="UTF-8"%>
<%@attribute name="title" fragment="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title><jsp:invoke fragment="title" /></title>
<link href="resources/css/until/jquery-ui.css" rel="stylesheet">

<link href="resources/css/ping/index.css" rel="stylesheet">
<script src="resources/external/jquery/jquery.js"></script>
<script src="resources/js/jquery-ui.min.js"></script>

<!-- 最新編譯和最佳化的 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<!-- 選擇性佈景主題 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<!-- 最新編譯和最佳化的 JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
<link href="resources/css/ping/style.css" rel="stylesheet">

<script src="resources/js/ping/index.js"></script>
</head>
<body>
	<header>
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-4">Welcome</div>
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<select>
						<option>選擇語言</option>
						<option>English</option>
						<option>中文</option>
					</select>
				</div>
			</div>
		</div>
		<div class="top-down">
			<div class="row">
				<div class="col-md-4">Logo</div>
				<div class="col-md-4">Search</div>
				<div class="col-md-4">登入</div>
			</div>
		</div>
	</header>
	<div class="container">
		<div class="row">
				<div class="col-md-3">
					<div style="width:200px;background-color: black;">
					<h2 style="color: white;">Menu</h2>
					<ul style="width:200px;" id="menu">
						<li><div>Item 1</div></li>
						<li><div>Item 2</div></li>
						<li><div>Item 3</div>
							<ul>
								<li><div>Item 3-1</div></li>
								<li><div>Item 3-2</div></li>
								<li><div>Item 3-3</div></li>
								<li><div>Item 3-4</div></li>
								<li><div>Item 3-5</div></li>
							</ul>
						</li>
						<li><div>Item 4</div></li>
						<li><div>Item 5</div></li>
					</ul>
					</div>
				</div>
				<div class="col-md-9">
					<jsp:doBody />
				</div>
		</div>
	</div>
</body>
</html>