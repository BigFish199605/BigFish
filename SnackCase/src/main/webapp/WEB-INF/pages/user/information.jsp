<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

		<title>个人资料</title>

		<link href="${sc}/staticsource/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
		<link href="${sc}/staticsource/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

		<link href="${sc}/staticsource/css/personal.css" rel="stylesheet" type="text/css">
		<link href="${sc}/staticsource/css/infstyle.css" rel="stylesheet" type="text/css">
		<script src="${sc}/staticsource/AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
		<script src="${sc}/staticsource/AmazeUI-2.4.2/assets/js/amazeui.js"></script>			
	</head>

	<body>
		
			<%@ include file="../home/head.jsp" %>

						<div class="clear"></div>
			<b class="line"></b>
		<div class="center">
			<div class="col-main">
				<div class="main-wrap">

					<div class="user-info">
						<!--标题 -->
						<div class="am-cf am-padding">
							<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">个人资料</strong> / <small>Personal&nbsp;information</small></div>
						</div>
						<hr/>

						

						<!--个人信息 -->
						<div class="info-main">
							<form class="am-form am-form-horizontal">

								<div class="am-form-group">
									<label for="user-name2" class="am-form-label">昵称</label>
									<div class="am-form-content">
										小三
                                        
									</div>
								</div>

								<div class="am-form-group">
									<label for="user-name" class="am-form-label">姓名</label>
									<div class="am-form-content">
										小四
                                         
									</div>
								</div>

								<div class="am-form-group">
									<label class="am-form-label">性别</label>
									<div class="am-form-content sex">
										男
									</div>
								</div>

								<div class="am-form-group">
									<label for="user-birth" class="am-form-label">生日</label>
									<div class="am-form-content birth">
										19960521
									</div>
							
								</div>
								<div class="am-form-group">
									<label for="user-phone" class="am-form-label">电话</label>
									<div class="am-form-content">
										123456789

									</div>
								</div>
								<div class="am-form-group">
									<label for="user-email" class="am-form-label">电子邮件</label>
									<div class="am-form-content">
										144852933@qq.com

									</div>
								</div>
								
								
							
							</form>
						</div>

					</div>

				</div>
				
				
				</div>
				
				<%@ include file="../home/frame.jsp" %>
		</div>

	</body>

</html>