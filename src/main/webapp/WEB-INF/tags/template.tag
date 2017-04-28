<%@ tag language="java" pageEncoding="UTF-8"%>
<%@attribute name="title" fragment="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title><jsp:invoke fragment="title" /></title>
<link href="<c:url value="/resources/css/until/jquery-ui.css"/>" rel="stylesheet">
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
					<div class="col-md-4"><a href="/ping-website/">Welcome</a></div>
					<div class="col-md-5"></div>
					<div class="col-md-1">
					<% if (session.getAttribute("sessionUser") == null) { %>
						<a id="registerLogin" href="<c:url value="/views/registerLogin"/>">註冊|登入</a>
					<%	} else if (session.getAttribute("sessionUser") != null) { %>		
						<form id="logout" action="<c:url value="/views/registerLogin/logout"/>"  method="post">
							<a href="#" onclick="logout()">
								登出
							</a>
						</form>
					<% } %>
					</div>
					<div class="col-md-2">
						<select>
							<option>選擇語言</option>
							<option>English</option>
							<option>中文</option>
						</select>
					</div>
				</div>
			</div>
		</div>
		<div class="bar">
			<ul class="bar-ul">
				<li class="dropdown bar-inline">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown">訂購資訊<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="#">訂單管理</a></li>
						<li><a href="<c:url value="/views/record"/>">購買紀錄</a></li>
					</ul>
				</li>
				<li class="bar-inline"><a>所有商品</a></li>
				<li class="bar-inline"><a href="<c:url value="/views/cart"/>">購物車</a></li>
			</ul>
			<ul class="bar-ul bar-search">
				<li class="bar-inline">
					<input type="text" placeholder="搜尋商品">
				</li>
				<li class="bar-inline"><button class="btn btn-primary">搜尋</button></li>
			</ul>
		</div>
	</header>
	
	<%-- 內容 --%>
	<div class="container">
		<div class="row"><div class="col-md-12" style="height:20px;"></div></div>
		<div class="row">
				<div class="col-md-2">
				<%if (session.getAttribute("sessionUser") != null) { %>
					<div class="menu-box">
						<div>Menu</div>
						<div>
							<ul style="width:130px;" id="menu">
								<li><div><a href="<c:url value="/views/user"/>">個人資訊<span class="ui-icon ui-icon-person"></span></a></div></li>
								<li data-toggle="modal" data-target="#build-order"><div>建立團購<span class="ui-icon ui-icon-cart"></span></div></li>
								<li><div>介紹<span class="ui-icon ui-icon-comment"></span></div></li>
								<li><div>聯絡我們<span class="ui-icon ui-icon-mail-closed"></span></div></li>
							</ul>
						</div>
					</div>
				<% } %>
				</div>
				<div class="col-md-10">
					<jsp:doBody />
				</div>
		</div>
	</div>
	<div class="modal fade" role="dialog" id="build-order" data-backdrop="false">
		<div class="modal-dialog">
			<form class="form-horizontal" action="<c:url value="/orderBuild"/>" method="post">
				<div class="modal-content panel panel-default">
      				<div class="modal-header panel-heading">
        				<h2 class="modal-title">建立團購</h2>
      				</div>
      				<div class="modal-body">
	      				<div class="form-group">
	      					<label class="col-md-2 control-label">標題</label>
	      					<div class="col-md-8"><input name="title" type="text" class="form-control"></div>
	      				</div>
	      				<div class="form-group">
	      					<label class="col-md-2 control-label">數量</label>
	      					<div class="col-md-2"><input name="maxCount" type="number" class="form-control"></div>
	      				</div>
						<div class="form-group">
							<label class="col-md-2 control-label">商品名稱</label>
							<div class="col-md-4"><input name="itemName" type="text" class="form-control"></div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label">介紹</label>
							<div class="col-md-4">
								<textarea name="itemInfo" rows="6" cols="30" class="form-control" style="resize: none;"></textarea>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label">種類</label>
							<div class="col-md-7">
								<label class="radio-inline">
									<input type="radio" name="kind" value="food">食品
								</label>
								<label class="radio-inline">
									<input type="radio" name="kind" value="drink">飲品
								</label>
							</div>
						</div>
						<fieldset disabled>
							<div class="form-group">
								<label class="col-md-2 control-label">甜度</label> 
								<div class="col-md-7">
									<label class="radio-inline">
										<input type="radio" name="suger" value="normal">正常
									</label>
									<label class="radio-inline">
										<input type="radio" name="suger" value="half">半糖
									</label>
									<label class="radio-inline">
										<input type="radio" name="suger" value="micro">微糖
									</label>
									<label class="radio-inline">
										<input type="radio" name="suger" value="no">無糖
									</label>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-2 control-label">大小</label> 
								<div class="col-md-7">
									<label class="radio-inline">
										<input type="radio" name="size" value="big">大
									</label>
									<label class="radio-inline">
										<input type="radio" name="size" value="middle">中
									</label>
									<label class="radio-inline">
										<input type="radio" name="size" value="small">小
									</label>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-2 control-label">冰塊</label> 
								<div class="col-md-7">
									<label class="radio-inline">
										<input type="radio" name="ice" value="full">正常
									</label>
									<label class="radio-inline">
										<input type="radio" name="ice" value="less">少冰
									</label>
									<label class="radio-inline">
										<input type="radio" name="ice" value="no">去冰
									</label>
									<label class="radio-inline">
										<input type="radio" name="ice" value="normal">常溫
									</label>
									<label class="radio-inline">
										<input type="radio" name="ice" value="hot">熱
									</label>
								</div>
							</div>
						</fieldset>
      				</div>
      				<div class="modal-footer">
        				<button type="button" class="btn btn-default" data-dismiss="modal" onclick="resetOrder()">Close</button>
        				<button type="submit" class="btn btn-primary">送出</button>
      				</div>
    			</div><!-- /.modal-content -->
    		</form>
  		</div><!-- /.modal-dialog -->
	</div><!-- /.modal -->
	
	
	
</body>
</html>