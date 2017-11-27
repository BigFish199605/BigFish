<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../base.jsp" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
</head>
 
<body id="left_frame">
<div class="nav-navicon admin-main admin-sidebar">
    
    
    <div class="sideMenu">
      <h3 class="am-icon-cart-plus"><em></em>  订单管理</h3>
      <ul>
      	<!-- 所有用户的订单列表 -->
      	
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'>
        <a href="${sc }/back/order/orderList" onclick="linkHighlighted(this)" target="main">订单列表</a></li>
        <!-- 指定用户的订单 -->
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'>
        <a href="${sc }/back/order/orderUser" onclick="linkHighlighted(this)" target="main">用户订单</a></li>
        <!-- 已完成支付的用户订单列表 -->
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'>
        <a href="${sc }/back/order/orderComplete" onclick="linkHighlighted(this)" target="main">发货单列表</a></li>
        <!-- 类似easymall表单下载 -->
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'>
        <a href="${sc }/back/order/orderDownload" onclick="linkHighlighted(this)" target="main">订单打印</a></li>
      </ul>
     
    </div>
    <!-- sideMenu End --> 
    
    <script type="text/javascript">
			jQuery(".sideMenu").slide({
				titCell:"h3", //鼠标触发对象
				targetCell:"ul", //与titCell一一对应，第n个titCell控制第n个targetCell的显示隐藏
				effect:"slideDown", //targetCell下拉效果
				delayTime:300 , //效果时间
				triggerTime:150, //鼠标延迟触发时间（默认150）
				defaultPlay:true,//默认是否执行效果（默认true）
				returnDefault:true //鼠标从.sideMen移走后返回默认状态（默认false）
				});
		</script> 

    
    
    
    
    
    
    
</div>
<!-- end1 -->
 
</body>
</html>