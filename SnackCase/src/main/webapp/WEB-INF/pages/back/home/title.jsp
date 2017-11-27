<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ include file="../base.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- shiro引入标签 -->
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro"%>
<jsp:useBean id="now" class="java.util.Date" />
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
<script type="text/javascript">
	function toModule(moduleName){
		top.leftFrame.location.href = moduleName+'/Left.action';
		top.main.location.href = moduleName+'/Main.action';
		linkHighlightMenu(this);
	}
	
</script>
</head>

<body><!-- 文档主题部分开始 -->

<header class="am-topbar admin-header">
  <div class="am-topbar-brand"><img src="${sc}/staticsource/i/logo.png"></div>

  <div class="am-collapse am-topbar-collapse" id="topbar-collapse">
  <div class="sideMenu am-icon-dashboard" style="color:#aeb2b7; margin: 10px 0 0 0;"> 欢迎系统管理员：清风抚雪</div>
    <ul class="am-nav am-nav-pills am-topbar-nav admin-header-list">

   <li class="am-dropdown tognzhi" data-am-dropdown>
  <button class="am-btn am-btn-primary am-dropdown-toggle am-btn-xs am-radius am-icon-bell-o" data-am-dropdown-toggle> 消息管理<span class="am-badge am-badge-danger am-round">6</span></button>
  <ul class="am-dropdown-content">
    <li class="am-dropdown-header">所有消息都在这里</li>
    <li><a href="#">未激活会员 <span class="am-badge am-badge-danger am-round">556</span></a></li>
    <li><a href="#">未激活代理 <span class="am-badge am-badge-danger am-round">69</span></a></a></li>
    <li><a href="#">未处理汇款</a></li>
    <li><a href="#">未发放提现</a></li>
    <li><a href="#">未发货订单</a></li>
    <li><a href="#">低库存产品</a></li>
    <li><a href="#">信息反馈</a></li>
  </ul>
</li>

 <li class="kuanjie">
 	
 	<a href="#" onclick="toModule('item');">商品管理</a>          
 	<a href="#" onclick="toModule('order');">订单管理</a> 
 	<a href="#" onclick="toModule('user');">会员管理</a>   
 	<a href="#" onclick="toModule('staff');">员工界面</a> 
 	<a href="#" onclick="toModule('sysadmin');">个人中心</a> 
 </li>

 <li class="soso">
 	
<p class="ycfg"><input type="text" class="am-form-field am-input-sm" placeholder="圆角表单域" /></p>
<p><button class="am-btn am-btn-xs am-btn-default am-xiao"><i class="am-icon-search"></i></button></p>

    </ul>
    
  </div>
</header>

</body>
</html>