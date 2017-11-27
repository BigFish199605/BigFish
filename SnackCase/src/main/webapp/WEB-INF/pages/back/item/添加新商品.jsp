<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="sc" value="${pageContext.request.contextPath}" />
<!doctype html>
<html class="no-js">
<head>
<title>新商品添加</title>
<link rel="icon" type="image/png"
	href="${sc}/staticsource/i/favicon.png">
<link rel="apple-touch-icon-precomposed"
	href="${sc}/staticsource/i/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="stylesheet" href="${sc}/staticsource/css/amazeui.min.css" />
<link rel="stylesheet" href="${sc}/staticsource/css/admin.css">
<script type="text/javascript" src="${sc}/staticsource/js/jquery.min.js"></script>
<script type="text/javascript" src="${sc}/staticsource/js/app.js"></script>
</head>
<body>
	<!--[if lte IE 9]><p class="browsehappy">升级你的浏览器吧！ <a href="http://se.360.cn/" target="_blank">升级浏览器</a>以获得更好的体验！</p><![endif]-->
</head>

<body>




	<div class="admin-biaogelist">

		<div class="listbiaoti am-cf">
			<ul class="am-icon-flag on">栏目名称
			</ul>

			<dl class="am-icon-home" style="float: right;">
				当前位置： 首页 >
				<a href="#">商品列表</a>
			</dl>



		</div>

		<div class="fbneirong">
			<form class="am-form">
				<div class="am-form-group am-cf">
					<div class="zuo">商品名称：</div>
					<div class="you">
						<input type="text" class="am-input-sm" id="doc-ipt-name-1"
							placeholder="请输入商品名称">
					</div>
				</div>
				<div class="am-form-group am-cf">
					<div class="zuo">价格：</div>
					<div class="you">
						<input type="text" class="am-input-sm" id="doc-ipt-price-1"
							placeholder="请输入价格">
					</div>
				</div>
				
				<div class="am-form-group am-cf">
					<div class="zuo">商品数量：</div>
					<div class="you">
						<input type="text" class="am-input-sm" id="doc-ipt-num-1"
							placeholder="请输入商品数量">
					</div>
				</div>

				<div class="am-form-group am-cf">
					<div class="zuo">商品图片：</div>
					<div class="you" style="height: 45px;">
						<input type="file" id="doc-ipt-file-1">
						<p class="am-form-help">请选择要上传的文件...</p>
					</div>
				</div>


				<div class="am-form-group am-cf">
					<div class="zuo">商品状态：</div>
					<div class="you">
					<input type="radio" name="state" value="1" />售出
					<input type="radio" name="state" value="0" />未售出
					
					</div>
				</div>

				<div class="am-form-group am-cf">
					<div class="zuo">上架时间：</div>
					<div class="you">
						<!-- <textarea class="" rows="2" id="doc-ta-1"></textarea> -->
						<input type="date" class="am-input-sm" id="doc-ipt-date-1">
					</div>
				</div>
				<div class="am-form-group am-cf">
					<div class="zuo">商品信息：</div>
					<div class="you">
						<textarea class="" rows="2" id="doc-ta-1"></textarea>
					</div>
				</div>
				<div class="am-form-group am-cf">
					<div class="you" style="margin-left: 11%;">
						<button type="submit" class="am-btn am-btn-success am-radius">发布并关闭窗口</button>
						&nbsp; &raquo; &nbsp;
						<button type="submit" class="am-btn am-btn-secondary am-radius">发布并继续发布</button>

					</div>
				</div>
			</form>
		</div>



		<div class="foods">
			<ul>零食铺子管理系统
			</ul>
			<dl>
				<a href="" title="返回头部" class="am-icon-btn am-icon-arrow-up"></a>
			</dl>
		</div>




	</div>


	<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="${sc}/staticsource/js/polyfill/rem.min.js"></script>
<script src="${sc}/staticsource/js/polyfill/respond.min.js"></script>
<script src="${sc}/staticsource/js/amazeui.legacy.js"></script>
<![endif]-->

	<!--[if (gte IE 9)|!(IE)]><!-->
	<script src="${sc}/staticsource/js/amazeui.min.js"></script>
	<!--<![endif]-->



</body>
</html>