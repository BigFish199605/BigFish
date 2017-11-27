<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<head lang="en">
<meta charset="UTF-8">
<title>登录</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="format-detection" content="telephone=no">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />

<link rel="stylesheet"
	href="${sc}/staticsource/AmazeUI-2.4.2/assets/css/amazeui.min.css" />
<link href="${sc}/staticsource/css/dlstyle.css" rel="stylesheet"
	type="text/css">
<script src="${sc}/staticsource/AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
<script src="${sc}/staticsource/AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>

</head>

<body>

	<div class="login-boxtitle">
		<a href="/home"><img alt=""
			src="${sc}/staticsource/images/logobig.png" /></a>
	</div>

	<div class="res-banner">
		<div class="res-main">
			<div class="login-banner-bg">
				<span></span><img src="${sc}/staticsource/images/big.jpg" />
			</div>
			<div class="login-box">

				<div class="am-tabs" id="doc-my-tabs">
					<ul class="am-tabs-nav am-nav am-nav-tabs am-nav-justify">
						<li class="am-active"><a href="">用户登录</a></li>
					</ul>
					

					<div class="am-tabs-bd">
						<div class="am-tab-panel am-active">
						<span text-align:center>${msg}</span>


							<form action="/login" method="post">
								
								


								<div class="user-email">
									<label for="email"><i class="am-icon-envelope-o"></i></label> <input
										type="email" name="email" id="email" placeholder="请输入邮箱账号">
								</div>
								<div class="user-pass">
									<label for="password"><i class="am-icon-lock"></i></label> <input
										type="password" name="password" id="password"
										placeholder="密码">
								</div>
								

								<div class="am-cf">
									<input type="submit" name="" value="登录"
										class="am-btn am-btn-primary am-btn-sm am-fl">
								</div>
						</div>
						</form>
						
						<script>
							$(function() {
								$('#doc-my-tabs').tabs();
							})
						</script>

					</div>
				</div>

			</div>
		</div>
		<%@ include file="../home/foot.jsp"%>

	</div>
</body>
</html>

