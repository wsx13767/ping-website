<%@ tag language="java" pageEncoding="UTF-8"%>
<%@attribute name="title" fragment="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title><jsp:invoke fragment="title" /></title>
<link href="resources/css/until/jquery-ui.css"
	rel="stylesheet">
<link href="<c:url value="resources/css/index.css"/>" rel="stylesheet">
<script src="<c:url value="resources/external/jquery/jquery.js"/>"></script>
<script src="<c:url value="resources/js/jquery-ui.min.js"/>"></script>

<!-- 最新編譯和最佳化的 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<!-- 選擇性佈景主題 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<!-- 最新編譯和最佳化的 JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

<script src="resources/js/index.js"></script>
</head>
<body>
	<header>
	<div class="container-fluid" style="background-color: #428bca;">
		<div class="row">
			<div class="col-md-12">123</div>
		</div>
	</div>
	</header>
	<jsp:doBody />
</body>
</html>