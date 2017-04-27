<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<t:template>
	<jsp:body>
		<link href="<c:url value="/resources/css/ping/registerLogin.css"/>" rel="stylesheet">
		<script src="<c:url value="/resources/js/ping/registerLogin.js"/>"></script>
		<div class="row">
			<div class="col-md-5">
				<div class="panel panel-primary">
					<div class="panel-heading">登入</div>
					<div class="panel-body">
						<form role="form" id="loginForm" action="<c:url value="/views/registerLogin/login"/>" method="post">
							<div class="form-group">
								<label>帳號</label><span style="color: red;"> ${error.account} ${error.fail}</span>
								<input type="text" name="account" class="form-control">
								<label>密碼</label><span style="color: red;"> ${error.password}</span>
								<input type="password" name="password" class="form-control">
							</div>
							<button type="submit" class="btn btn-primary">送出</button>
						</form>
					</div>
				</div>
			</div>
			<div class="col-md-5 col-md-offset-1">
				<div class="panel panel-success">
					<div class="panel-heading">註冊</div>
					<div class="panel-body">
						<form role="form" action="<c:url value="/views/registerLogin/register"/>" method="post">
							<div class="form-group">
								<label>帳號</label><span style="color: red;"> ${error.registerAccount}</span>
								<input type="text" name="account" class="form-control">
								<label>密碼</label><span style="color: red;"> ${error.registerPassword}</span>
								<input type="password" name="password" class="form-control">
							</div>
							<div id="register-dialog" class="modal fade bs-example-modal-sm">
								<div class="modal-dialog modal-sm">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
											<h4 class="modal-title">詳細資料</h4>
										</div>
										<div class="modal-body">
											<h3>權益說明</h3>
											<div>
												<textarea rows="6" cols="30" class="form-control" style="resize: none;" disabled="disabled" >
													s
													s
													s
													s
													s
													s
													s
													s
													s
													s
												</textarea>
												<input type="checkbox" id="alreadyRead" />已閱讀
											</div>
											<fieldset disabled>
											<div class="form-group">
												<label>姓名</label><span style="color: red;"> ${error.name}</span>
												<input type="text" name="name" class="form-control">
												<label>Email</label><span style="color: red;"> ${error.email}</span>
												<input type="text" name="email" class="form-control">
												<label>電話</label><span style="color: red;"> ${error.phone}</span>
												<input type="text" name="phone" class="form-control">
											</div>
											<div class="radio">
												<label>
													<input name="sex" type="radio" value="man">男
												</label>
												<label>
													<input name="sex" type="radio" value="moman">女
												</label><span style="color: red;"> ${error.sex}</span>
											</div>
											</fieldset>
										</div>
										<div class="modal-footer">
											<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
											<button type="button" class="btn btn-primary" data-dismiss="modal">Save changes</button>
										</div>
									</div><!-- /.modal-content -->
								</div><!-- /.modal-dialog -->
							</div><!-- /.modal -->
							<button type="button" class="btn btn-default" data-toggle="modal" data-target="#register-dialog">詳細</button>
							<button type="submit" class="btn btn-success">註冊</button>
						</form>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12" style="background-color: blue;height: 100px;"></div>
		</div>
			<%-- 
				<img src="https://drive.google.com/uc?export=view&id=0B3SX0gEI1XudNlN4cURDMk45OEU">
			--%>
		
	</jsp:body>
</t:template>