<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ include file="../base.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>导航栏</title>
</head>
<body>

<div class="hmtop">
			<!--顶部导航条 -->
			<div class="am-container header">
				<ul class="message-l">
					<div class="topMessage">
						<div class="menu-hd">
						<div id="common_head">
<<<<<<< HEAD
						
						<c:if test="${!empty user.name}">
	 欢迎${user.name}&nbsp;&nbsp;|<a href="/zhuxiao">注销</a>
						</c:if>
						<c:if test="${empty user.name }">
							<a href="tologin" class="h">亲，请登录</a>
							<a href="toregister" target="_top">免费注册</a>
						</c:if>

					</div>
					</div>
=======
	
		
	<c:if test="${!empty user.name}">
	 欢迎${user.name}&nbsp;&nbsp;|<a href="/zhuxiao">注销</a>
	</c:if>
	<c:if test="${empty user.name }">
		<a href="tologin"  class="h">亲，请登录</a>
		<a href="toregister" target="_top">免费注册</a>
	</c:if>
	
						</div>
>>>>>>> 1c9c78546dbc04ddc37fb0e63e6b46f134a8c8a0
					</div>
				</ul>
				<ul class="message-r">
					<div class="topMessage home">
						<div class="menu-hd"><a href="home" target="_top" class="h">商城首页</a></div>
					</div>
					<div class="topMessage my-shangcheng">
						<div class="menu-hd MyShangcheng"><a href="information" target="_top"><i class="am-icon-user am-icon-fw"></i>个人中心</a></div>
					</div>
					<div class="topMessage mini-cart">
						<div class="menu-hd"><a id="mc-menu-hd" href="cart" target="_top"><i class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum" class="h">0</strong></a></div>
					</div>
					<div class="topMessage favorite">
						<div class="menu-hd"><a href="collection" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a></div>
				</ul>
				</div>
				
				
				<!--悬浮搜索框-->

				<div class="nav white">
					<div class="logoBig">
						<li><img src="${sc}/staticsource/images/logo.png" /></li>
					</div>

					<div class="search-bar pr">
						<a name="index_none_header_sysc" href="search"></a>
						<form>
							<input id="searchInput" name="index_none_header_sysc" type="text" placeholder="搜索" autocomplete="off">
							<input id="ai-topsearch" class="submit am-btn" value="搜索" index="1" type="submit">
						</form>
					</div>
				</div>
				

</body>
</html>