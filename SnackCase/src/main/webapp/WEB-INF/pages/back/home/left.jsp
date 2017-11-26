<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../base.jsp" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
</head>
 
<body id="left_frame">
<div class="nav-navicon admin-main admin-sidebar">
    
    
    
    <div class="sideMenu">
      <h3 class="am-icon-flag"><em></em>商品管理</h3>
      <ul>
        <li><a href="">商品列表</a></li>
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href="itemManage">添加新商品</a></li>
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href="itemKind">商品分类</a></li>
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href="itemPerson">用户评论</a></li>
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href="itemState">商品回收站</a></li>
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href="itemNumber">库存管理</a> </li>
      </ul>
      <h3 class="am-icon-cart-plus"><em></em>  订单管理</h3>
      <ul>
      	<!-- 所有用户的订单列表 -->
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href="orderList">订单列表</a></li>
        <!-- 指定用户的订单 -->
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href="orderUser">用户订单</a></li>
        <!-- 已完成支付的用户订单列表 -->
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href="orderComplete">发货单列表</a></li>
        <!-- 类似easymall表单下载 -->
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href="orderDownload">订单打印</a></li>
      </ul>
      <h3 class="am-icon-users"><em></em>会员界面</h3>
      <ul>
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href="user">会员列表</a> </li>
        <!-- 会员是否启用和一般信息修改 -->
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href="userInfo">会员信息</a></li>
        <!-- 角色模块 -->
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href="userLevel">会员等级</a></li>
        <!-- 权限模块 -->
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href="levelInfo">等级权限</a></li>
      </ul>
      <h3 class="am-icon-users"><em></em>员工界面</h3>
      <ul>
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href="staff">员工列表</a> </li>
        <!-- 员工的一般信息修改 -->
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href="staffInfo">员工信息</a></li>
        <!-- 添加新员工 -->
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href="staffAdd">添加新员工信息</a></li>
        <!-- 角色模块 -->
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href="staffJob">员工职位</a></li>
        <!-- 权限模块 -->
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href="jobInfo">角色权限</a></li>
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