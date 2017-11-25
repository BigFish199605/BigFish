<%@ page language="java" import="java.util.*"  pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

		<title>我的银行卡</title>

		<link href="${sc}/staticsource/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
		<link href="${sc}/staticsource/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

		<link href="${sc}/staticsource/css/personal.css" rel="stylesheet" type="text/css">


	</head>

	<body>
		<!--头 -->
		<header>
			<article>
				<%@ include file="../home/head.jsp" %>
			</article>
		</header>

		<div class="nav-table">
			<div class="long-title"><span class="all-goods">全部分类</span></div>
			<div class="nav-cont">
				<ul>
					<li class="index"><a href="home">首页</a></li>
					<li class="qc"><a href="#">闪购</a></li>
					<li class="qc"><a href="#">限时抢</a></li>
					<li class="qc"><a href="#">团购</a></li>
					<li class="qc last"><a href="#">大包装</a></li>
				</ul>
				<div class="nav-extra">
					<i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利
					<i class="am-icon-angle-right" style="padding-left: 10px;"></i>
				</div>
			</div>
		</div>
		<b class="line"></b>

		<div class="center">
			<div class="col-main">
				<div class="main-wrap">
					<!--标题 -->
					<div class="am-cf am-padding">
						<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">我的银行卡</strong> / <small>My&nbsp;Credit&nbsp;Card</small></div>
					</div>
					<hr/>
					<div class="card-box-list">
						<ul>
							<li>
								<div class="card-box">
									<div class="card-box-name">
										<span class="bank-logo"><a href="#"><img src="${sc}/statisource/images/bankjh.png"></a></span>
										<span title="中国建设银行" class="bank-name">中国建设银行</span>
										<span class="bank-num4">尾号9098</span>
										<span class="card-type card-type-CC"></span>
									</div>
									<div class="card-box-express">
										<div class="express-status">
											<span class="asset-icon asset-icon-express-s"></span> <span>已开通</span>
										</div>
										<div class="express-else"><a href="#">管理</a></div>
									</div>
									<div class="card-detail">
										<div class="card-detail-list">
											<div class="card-detail-value" title="账单"><a href="billlist.html"><strong>账单</strong><span></span></a></div>
										</div>
									</div>
								</div>
							</li>
							<li>
								<div class="card-box">
									<div class="card-box-name">
										<span class="bank-logo"><a href="#"><img src="${sc}/statisource/images/bankns.png"></a></span>
										<span title="湖北省农村信用合作联社" class="bank-name">湖北省农村信用合作联社</span>
										<span class="bank-num4">尾号8652</span>
										<span class="card-type card-type-DC"></span>
									</div>
									<div class="card-box-express">
										<div class="express-status">
											<span class="asset-icon asset-icon-express-s"></span> <span>已开通</span>
										</div>
										<div class="express-else"><a href="#">管理</a></div>
									</div>
									<div class="card-detail">
										<div class="card-detail-value" title="账单"><a href="billlist.html"><strong>账单</strong><span></span></a></div>
									</div>
								</div>
							</li>
							<li>
								<div class="card-box">
									<div class="card-box-name">
										<span class="bank-logo"><a href="#"><img src="${sc}/statisource/images/bankjh.png"></a></span>
										<span title="中国建设银行" class="bank-name">中国建设银行</span>
										<span class="bank-num4">尾号9098</span>
										<span class="card-type card-type-CC"></span>
									</div>
									<div class="card-box-express">
										<div class="express-status">
											<span class="asset-icon asset-icon-express-s"></span> <span>已开通</span>
										</div>
										<div class="express-else"><a href="#">管理</a></div>
									</div>
									<div class="card-detail">
										<div class="card-detail-list">
											<div class="card-detail-value" title="账单"><a href="billlist.html"><strong>账单</strong><span></span></a></div>
										</div>
									</div>
								</div>
							</li>
							<li>
								<div class="card-box">
									<div class="card-box-name">
										<span class="bank-logo"><a href="#"><img src="${sc}/statisource/images/bankns.png"></a></span>
										<span title="湖北省农村信用合作联社" class="bank-name">湖北省农村信用合作联社</span>
										<span class="bank-num4">尾号8652</span>
										<span class="card-type card-type-DC"></span>
									</div>
									<div class="card-box-express">
										<div class="express-status">
											<span class="asset-icon asset-icon-express-s"></span> <span>已开通</span>
										</div>
										<div class="express-else"><a href="#">管理</a></div>
									</div>
									<div class="card-detail">
										<div class="card-detail-value" title="账单"><a href="#"><strong>账单</strong><span></span></a></div>
									</div>
								</div>
							</li>
							<li>
								<div class="add-card">
									<a href="#" target="_blank"><i class="am-icon-plus"></i>添加银行卡</a>
								</div>
							</li>
						</ul>
					</div>
				</div>
				<!--底部-->
				<%@ include file="../home/foot.jsp" %>
			</div>
		<%@ include file="../home/frame.jsp" %>
		</div>

	</body>

</html>