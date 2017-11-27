<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>后台管理操作系统</title>
</head>
<frameset rows="52,*" name="topFrameset" border="0" marginwidth="0" marginheight="0">
	<frame name="top_frame" scrolling="no"  target="middleFrameSet" src="title.action" style="z-index:1">	
	<frameset cols="230,*" height="100%" name="middle" frameborder="no" border="0" framespacing="0">
		<frame name="leftFrame" class="leftFrame" target="main" scrolling="no" src="homeLeft.action" style="z-index:1000" />
		<frame name="main" class="rightFrame" src="homeMain.action" style="z-index:1000"/>
	</frameset>
</frameset>

<noframes>
<body>
    <p>此网页使用了框架，但您的浏览器不支持框架。</p>
</body>
</noframes>

</html>