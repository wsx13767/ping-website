<%@ tag language="java" pageEncoding="UTF-8"%>
<%@attribute name="title" fragment="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title><jsp:invoke fragment="title" /></title>
<link href="<c:url value="/resources/css/until/jquery-ui.css"/>" rel="stylesheet">
<%-- --%>
<link href="<c:url value="/resources/css/ping/style.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/ping/index.css"/>" rel="stylesheet">
<script src="<c:url value="/resources/external/jquery/jquery.js"/>"></script>
<script src="<c:url value="/resources/js/jquery-ui.min.js"/>"></script>

<!-- 最新編譯和最佳化的 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<!-- 選擇性佈景主題 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<!-- 最新編譯和最佳化的 JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>


<script src="<c:url value="/resources/js/ping/style.js"/>"></script> 
</head>
<body>
	<header>
		<div class="container-fluid">
			<div class="top-up">
				<div class="row">
					<div class="col-md-4"><a href="<c:url value="/" />"><spring:message code="tamplate.welcome"/></a></div>
					<div class="col-md-4"></div>
					<div class="col-md-2">
					<% if (session.getAttribute("sessionUser") == null) { %>
						<a id="registerLogin" href="<c:url value="/views/registerLogin"/>"><spring:message code="tamplate.registerLogin"/></a>
					<%	} else if (session.getAttribute("sessionUser") != null) { %>		
						<form id="logout" action="<c:url value="/views/registerLogin/logout"/>"  method="post">
							<a href="#" onclick="logout()">
								<spring:message code="template.logout"/>
							</a>
						</form>
					<% } %>
					</div>
					<div class="col-md-2">	
						<select id="languageSelect">
							<option value=""><spring:message code="tamplate.languageSelect"/></option>
							<option value="en_US">English</option>
							<option value="zh_TW">中文</option>
						</select>
					</div>
				</div>
			</div>
		</div>
		<div class="bar">
			<ul class="bar-ul">
				<!-- 所有商品 -->
				<li class="bar-inline"><span class="ui-icon ui-icon-script"></span><a href="<c:url value="/views/products"/>"><spring:message code="template.allItems"/></a></li>
				<!-- 訂單管理 -->
				<li class="dropdown bar-inline">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="ui-icon ui-icon-note"></span><spring:message code="template.orderManagement"/><b class="caret"></b></a>
					<ul class="dropdown-menu">
						<!-- 訂購資訊 -->
						<li><a href="#"><spring:message code="template.orderInfo" /></a></li>
						<!-- 購買紀錄 -->
						<li><a href="<c:url value="/views/record"/>"><spring:message code="template.record"/></a></li>
					</ul>
				</li>
				<!-- 會員管理 -->
				<li class="dropdown bar-inline">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="ui-icon ui-icon-person"></span><spring:message code="template.userManagement" /><b class="caret"></b></a>
					<ul class="dropdown-menu">
						<!-- 個人資訊 -->
						<li><a href="<c:url value="/views/user"/>"><spring:message code="template.personalInfo"/></a></li>
					</ul>
				</li>
				<!-- 介紹 -->
				<li class="bar-inline"><a href="#"><span class="ui-icon ui-icon-comment"></span><spring:message code="template.introduction"/></a></li>
				<!-- 聯絡我們 -->
				<li class="bar-inline"><a href="#"><span class="ui-icon ui-icon-mail-closed"></span><spring:message code="template.contactUs"/></a></li>
				<!-- 購物車 -->
				<li class="bar-inline"><a href="<c:url value="/views/cart"/>"><span class="ui-icon ui-icon-cart"></span><spring:message code="template.cart"/></a></li>
			</ul>
			<!-- 搜尋bar -->
			<ul class="bar-ul bar-search">
				<li class="bar-inline">
					<input type="text" placeholder="<spring:message code="template.searchItem"/>">
				</li>
				<li class="bar-inline"><button class="btn btn-primary"><spring:message code="template.search"/></button></li>
			</ul>
		</div>
	</header>
	<form id="languageForm">
		<input name="language" type="hidden">
	</form>
	<%-- 內容 --%>
	<div class="container">
		<div class="row"><div class="col-md-12" style="height:20px;"></div></div>
		<div class="row">
				<div class="col-md-2">
				<%--
				<%if (session.getAttribute("sessionUser") != null) { %>
					<div class="menu-box">
						<div><spring:message code="template.menu"/></div>
						<div>
							<ul style="width:130px;" id="menu">
								<li><div><a href="<c:url value="/views/user"/>"><spring:message code="template.personalInfo"/><span class="ui-icon ui-icon-person"></span></a></div></li>
								<li data-toggle="modal" data-target="#build-order"><div><spring:message code="template.increaseItem"/><span class="ui-icon ui-icon-cart"></span></div></li>
								<li><div><spring:message code="template.introduction"/><span class="ui-icon ui-icon-comment"></span></div></li>
								<li><div><spring:message code="template.contactUs"/><span class="ui-icon ui-icon-mail-closed"></span></div></li>
							</ul>
						</div>
					</div>
				<% } %>
				 --%>
				</div>
				<div class="col-md-10">
					<jsp:doBody />
				</div>
		</div>
	</div>
	<div class="modal fade" role="dialog" id="build-order" data-backdrop="false">
		<div class="modal-dialog">
			<form class="form-horizontal" action="<c:url value="/views/products/productAdd"/>" method="post">
				<div class="modal-content panel panel-default">
      				<div class="modal-header panel-heading">
        				<h2 class="modal-title"><spring:message code="template.increaseItem"/></h2>
      				</div>
      				<div class="modal-body">
	      				<div class="form-group">
	      					<label class="col-md-2 control-label"><spring:message code="template.title"/></label>
	      					<div class="col-md-8"><input name="title" type="text" class="form-control"></div>
	      				</div>
	      				<div class="form-group">
	      					<label class="col-md-2 control-label"><spring:message code="template.count"/></label>
	      					<div class="col-md-2"><input name="count" type="number" class="form-control"></div>
	      				</div>
	      				<div class="form-group">
	      					<label class="col-md-2 control-label"><spring:message code="template.price"/></label>
	      					<div class="col-md-2"><input name="money" type="number" class="form-control"></div>
	      				</div>
						<div class="form-group">
							<label class="col-md-2 control-label"><spring:message code="template.itemName"/></label>
							<div class="col-md-4"><input name="itemName" type="text" class="form-control"></div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label"><spring:message code="template.introduction"/></label>
							<div class="col-md-4">
								<textarea name="itemInfo" rows="6" cols="30" class="form-control" style="resize: none;"></textarea>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label"><spring:message code="template.kinds"/></label>
							<div class="col-md-7">
								<label class="radio-inline">
									<input type="radio" name="kind" value="food"><spring:message code="template.food"/>
								</label>
								<label class="radio-inline">
									<input type="radio" name="kind" value="drink"><spring:message code="template.drink"/>
								</label>
								<label class="radio-inline">
									<input type="radio" name="kind" value="other"><spring:message code="template.other"/>
								</label>
							</div>
						</div>
      				</div>
      				<div class="modal-footer">
        				<button type="button" class="btn btn-default" data-dismiss="modal" onclick="resetOrder()">Close</button>
        				<button type="submit" class="btn btn-primary"><spring:message code="template.submit"/></button>
      				</div>
    			</div><!-- /.modal-content -->
    		</form>
  		</div><!-- /.modal-dialog -->
	</div><!-- /.modal -->
	
	
</body>
</html>