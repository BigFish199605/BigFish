<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

		<title>个人资料</title>

		<link href="${pageContext.request.contextPath}/staticsource/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
		<link href="${pageContext.request.contextPath}/staticsource/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

		<link href="${pageContext.request.contextPath}/staticsource/css/personal.css" rel="stylesheet" type="text/css">
		<link href="${pageContext.request.contextPath}/staticsource/css/infstyle.css" rel="stylesheet" type="text/css">
		<script src="${pageContext.request.contextPath}/staticsource/AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath}/staticsource/AmazeUI-2.4.2/assets/js/amazeui.js"></script>			
	</head>

	<body>
		<!--头 -->
		
<<<<<<< HEAD
			<%@ include file="../home/head.jsp" %>

						<div class="clear"></div>
=======
           
>>>>>>> 1c9c78546dbc04ddc37fb0e63e6b46f134a8c8a0
			<b class="line"></b>
		<div class="center">
			<div class="col-main">
				<div class="main-wrap">

					<div class="user-info">
						<!--标题 -->
						<div class="am-cf am-padding">
							<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">个人资料</strong> / <small>Personal&nbsp;information</small></div>
						</div>
						

<<<<<<< HEAD
=======
						<!--头像 -->
>>>>>>> 1c9c78546dbc04ddc37fb0e63e6b46f134a8c8a0
						

						<!--个人信息 -->
						<div class="info-main">
						
						
							<form action="/update" class="am-form am-form-horizontal" method="post">
							   <tr><td><input name="password" value="${user.password} " type="hidden" ></td></tr><tr>
									<tr><td><input name="email" value="${user.email } " type="hidden" ></td></tr>
									<tr><td><input name="username" value="${user.username} " type="hidden" ></td></tr><tr>
	<tr>
									<div>${msg}</div>
								<div class="am-form-group">
									<label for="user-name2" class="am-form-label" >昵称</label>
									<div class="am-form-content">
<<<<<<< HEAD
										小三
                                        
=======
										<input type="text" id="user-name2" placeholder="nickname" name="nickname">
                                          <small>昵称长度不能超过40个汉字</small>
>>>>>>> 1c9c78546dbc04ddc37fb0e63e6b46f134a8c8a0
									</div>
								</div>

								<div class="am-form-group">
									<label for="user-name" class="am-form-label" >姓名</label>
									<div class="am-form-content">
<<<<<<< HEAD
										小四
                                         
=======
										<input type="text" id="user-name2" placeholder="name" name="name">
										
>>>>>>> 1c9c78546dbc04ddc37fb0e63e6b46f134a8c8a0
									</div>
                                         
								</div>
								
								<label for="user-name" class="am-form-label" >年龄</label>
									<div class="am-form-content">
										<input type="text" id="user-name2" placeholder="age" name="age">
										
									</div>
						

								<div class="am-form-group">
									<label class="am-form-label" name="gender">性别</label>
									<div class="am-form-content sex">
<<<<<<< HEAD
										男
=======
										<label class="am-radio-inline">
											<input type="radio" name="gender" value="male" data-am-ucheck> 男
										</label>
										<label class="am-radio-inline">
											<input type="radio" name="gender" value="female" data-am-ucheck> 女
										</label>
										<label class="am-radio-inline">
											<input type="radio" name="gender" value="secret" data-am-ucheck> 保密
										</label>
>>>>>>> 1c9c78546dbc04ddc37fb0e63e6b46f134a8c8a0
									</div>
								</div>

								<div class="am-form-group">
									
									<div class="am-form-content birth">
<<<<<<< HEAD
										19960521
=======
										<div class="birth-select">
											
											</div>
>>>>>>> 1c9c78546dbc04ddc37fb0e63e6b46f134a8c8a0
									</div>
							
								</div>
								<div class="am-form-group">
									<label for="user-phone" class="am-form-label" >电话</label>
									<div class="am-form-content">
<<<<<<< HEAD
										123456789
=======
										<input id="user-phone" placeholder="telephone" type="tel" name="telephone">
>>>>>>> 1c9c78546dbc04ddc37fb0e63e6b46f134a8c8a0

									</div>
								</div>
								<div class="am-form-group">
									
									<div class="am-form-content">
<<<<<<< HEAD
										144852933@qq.com

									</div>
								</div>
								
								
							
=======
										

									</div>
								</div>
								<div class="am-form-group address">
									<label for="user-address" class="am-form-label">收货地址</label>
									<div class="am-form-content address">
										<a href="address.html">
											<p class="new-mu_l2cw">
												<span class="province">湖北</span>省
												<span class="city">武汉</span>市
												<span class="dist">洪山</span>区
												<span class="street">雄楚大道666号(中南财经政法大学)</span>
												<span class="am-icon-angle-right"></span>
											</p>
										</a>

									</div>
								</div>
								<div class="am-form-group safety">
									<label for="user-safety" class="am-form-label">账号安全</label>
									<div class="am-form-content safety">
										<a href="safety.html">

											<span class="am-icon-angle-right"></span>

										</a>

									</div>
								</div>
								<div class="info-btn">
									<input type="submit" class="am-btn am-btn-danger" value="保存"/>
								</div>

>>>>>>> 1c9c78546dbc04ddc37fb0e63e6b46f134a8c8a0
							</form>
						</div>

					</div>

				</div>
				<!--底部-->
				
<<<<<<< HEAD
				
				</div>
				
				<%@ include file="../home/frame.jsp" %>
=======
			</div>

			<aside class="menu">
				<ul>
					<li class="person active">
						<a href="index.html"><i class="am-icon-user"></i>个人中心</a>
					</li>
					<li class="person">
						<p><i class="am-icon-newspaper-o"></i>个人资料</p>
						<ul>
							<li> <a href="information.html">个人信息</a></li>
							<li> <a href="safety.html">安全设置</a></li>
							<li> <a href="address.html">地址管理</a></li>
							<li> <a href="cardlist.html">快捷支付</a></li>
						</ul>
					</li>
					<li class="person">
						<p><i class="am-icon-balance-scale"></i>我的交易</p>
						<ul>
							<li><a href="order.html">订单管理</a></li>
							<li> <a href="change.html">退款售后</a></li>
							<li> <a href="comment.html">评价商品</a></li>
						</ul>
					</li>
					<li class="person">
						<p><i class="am-icon-dollar"></i>我的资产</p>
						<ul>
							<li> <a href="points.html">我的积分</a></li>
							<li> <a href="coupon.html">优惠券 </a></li>
							<li> <a href="bonus.html">红包</a></li>
							<li> <a href="walletlist.html">账户余额</a></li>
							<li> <a href="bill.html">账单明细</a></li>
						</ul>
					</li>

					<li class="person">
						<p><i class="am-icon-tags"></i>我的收藏</p>
						<ul>
							<li> <a href="collection.html">收藏</a></li>
							<li> <a href="foot.html">足迹</a></li>														
						</ul>
					</li>

					<li class="person">
						<p><i class="am-icon-qq"></i>在线客服</p>
						<ul>
							<li> <a href="consultation.html">商品咨询</a></li>
							<li> <a href="suggest.html">意见反馈</a></li>							
							
							<li> <a href="news.html">我的消息</a></li>
						</ul>
					</li>
				</ul>

			</aside>
>>>>>>> 1c9c78546dbc04ddc37fb0e63e6b46f134a8c8a0
		</div>

	</body>

</html>