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
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'>
        <a href="${sc}/back/item/add" onclick="linkHighlighted(this)" target="main">添加新商品</a></li>
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'>
        <a href="${sc}/back/item/kind" onclick="linkHighlighted(this)" target="main">商品分类</a></li>
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'>
        <a href="${sc}/back/item/comment" onclick="linkHighlighted(this)" target="main">用户评论</a></li>
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href="itemState">商品回收站</a></li>
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'>
        <a href="${sc}/back/item/num" onclick="linkHighlighted(this)" target="main">库存管理</a> </li>
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