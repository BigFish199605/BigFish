<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../base.jsp" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
</head>
 
<body id="left_frame">
<div class="nav-navicon admin-main admin-sidebar">
    
    
    <div class="sideMenu">
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