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
			<div class="top-up">
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
			<%-- 
			<div class="top-down">
				<div class="row">
					<div class="col-md-4">Logo</div>
					<div class="col-md-4">Search</div>
					<div class="col-md-4">登入</div>
				</div>
			</div>--%>
		</div>
<div class="bar">
	<ul class="bar-oo">
		<li class="dropdown bar-inline">
			<a href="#" class="dropdown-toggle" data-toggle="dropdown">dddd<b class="caret"></b></a>
			<ul class="dropdown-menu">
				<li><a href="#">a</a></li>
				<li><a href="#">a</a></li>
			</ul>
		</li>
		<li class="bar-inline">aaa</li>
		
	</ul>
	<ul class="bar-oo bar-search">
		<li class="bar-inline">
			<input type="text" style="height: 30px;border-radius:15px 15px 15px 15px;padding-left: 10px;outline: none;" placeholder="搜尋">
		</li>
		<li class="bar-inline"><button class="btn btn-primary" style="">dd</button></li>
	</ul>
</div>
	</header>
	<div class="container">
		<div class="row">
				<div class="col-md-3">
					<ul style="width:130px;" id="menu">
						<li><div>個人資訊<span class="ui-icon ui-icon-person"></span></div></li>
						<li><div>商品<span class="ui-icon ui-icon-cart"></span></div>
							<ul style="width: 110px;">
								<li><div>Item 3-1</div></li>
								<li><div>Item 3-2</div></li>
								<li><div>Item 3-3</div></li>
								<li><div>Item 3-4</div></li>
								<li><div>Item 3-5</div></li>
							</ul>
						</li>
						<li><div>介紹<span class="ui-icon ui-icon-comment"></span></div></li>
						<li><div>聯絡我們<span class="ui-icon ui-icon-mail-closed"></span></div></li>
					</ul>
				</div>
				<div class="col-md-9">
					<jsp:doBody />
				</div>
		</div>
	</div>
</body>
</html>