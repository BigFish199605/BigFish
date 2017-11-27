<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../base.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<html>
<head>
	<title></title>
	</head>
<body>
 
<div class="admin">
	
   <div class="admin-index">
      <dl data-am-scrollspy="{animation: 'slide-right', delay: 100}">
        <dt class="qs"><i class="am-icon-users"></i></dt>
        <dd>${userNum }</dd>
        <dd class="f12">会员数量</dd>
      </dl>
      <dl data-am-scrollspy="{animation: 'slide-right', delay: 300}">
        <dt class="cs"><i class="am-icon-area-chart"></i></dt>
        <dd>${orderToday }</dd>
        <dd class="f12">今日收入</dd>
      </dl>
      <dl data-am-scrollspy="{animation: 'slide-right', delay: 600}">
        <dt class="hs"><i class="am-icon-shopping-cart"></i></dt>
        <dd>${itemNum }</dd>
        <dd class="f12">商品数量</dd>
      </dl>
      <dl data-am-scrollspy="{animation: 'slide-right', delay: 900}">
        <dt class="ls"><i class="am-icon-cny"></i></dt>
        <dd>${orderSum }</dd>
        <dd class="f12">全部收入</dd>
      </dl>
    </div>
    <div class="admin-biaoge">
      <div class="xinxitj">信息概况</div>
      <table class="am-table">
        <thead>
          <tr>
            <th>会员id</th>
            <th>会员姓名</th>
            <th>会员级别</th>
            <th>会员电话</th>
            <th>会员邮箱</th>
          </tr>
        </thead>
        <tbody>
        <c:forEach items="${users }" var="user">
          <tr>
            <td>${user.userId }</td>
            <td>${user.userInfo.nickname }</td>
            <td>${user.userInfo.level }</td>
            <td>${user.userInfo.tel }</td>
            <td>${user.userInfo.email }</td>
          </tr>
          </c:forEach>
        </tbody>
      </table>
      <table class="am-table">
        <thead>
          <tr>
            <th>商品名称</th>
            <th>商品数量</th>
            <th>商品添加时间</th>
            <th>商品单价</th>
            <th>商品状态</th>
          </tr>
        </thead>
        <tbody>
         <c:forEach items="${items }" var="item">
          <tr>
            <td>${item.name }</td>
            <td>${item.num }</td>
            <td><fmt:formatDate pattern="yyyy-MM-dd" value="${item.createtime}"/></td>
            <td>${item.price }</td>
            <td>${item.status } </td>
          </tr>
          </c:forEach>
        </tbody>
      </table>
      <table class="am-table">
        <thead>
          <tr>
            <th>订单id</th>
            <th>添加时间</th>
            <th>订单状态</th>
            <th>订单金额</th>
            <th>订单邮费</th>
          </tr>
        </thead>
        <tbody>
        <c:forEach items="${ orders}" var="order">
          <tr>
            <td>${order.orderId }</td>
            <td><fmt:formatDate pattern="yyyy-MM-dd" value="${order.createTime}"/></td>
            <td>${order.status }</td>
            <td>${order.payment }</td>
            <td>${order.postFee }</td>
          </tr>
          </c:forEach>
        </tbody>
      </table>
    </div>
    <div class="shuju">
      <div class="shujuone">
        <dl>
          <dt>会员总数：  ${userNum }</dt>
          <dt>销售总额：   ${orderSum }</dt>
          <dt>人均消费：  ${orderSum/userNum }</dt>
        </dl>
        <ul>
          <h2>26.83%</h2>
          <li>相对增长</li>
        </ul>
      </div>
      <div class="slideTxtBox">
        <div class="hd">
          <ul>
            <li>工作进度表</li>
            <li>其他信息</li>
          </ul>
        </div>
        <div class="bd">
          <ul>
            <table width="100%" class="am-table">
              <tbody>
                <tr>
                  <td width="7%"  align="center">1 </td>
                  <td width="83%" >工作进度名称</td>
                  <td width="10%"  align="center"><a href="#">10%</a></td>
                </tr>
                <tr>
                  <td align="center">1 </td>
                  <td>工作进度名称</td>
                  <td  align="center"><a href="#">10%</a></td>
                </tr>
                <tr>
                  <td  align="center">1 </td>
                  <td>工作进度名称</td>
                  <td  align="center"><a href="#">10%</a></td>
                </tr>
                
                <tr>
                  <td  align="center">1 </td>
                  <td>工作进度名称</td>
                  <td  align="center"><a href="#">10%</a></td>
                </tr>
                
                <tr>
                  <td  align="center">1 </td>
                  <td>工作进度名称</td>
                  <td  align="center"><a href="#">10%</a></td>
                </tr>
                
                
                
                
                
                
                
                
              </tbody>
            </table>
          </ul>
          <ul>
            <table class="am-table">
              <tbody>
                <tr>
                  <td>普卡</td>
                  <td>普卡</td>
                  <td><a href="#">4534</a></td>
                  <td>+20</td>
                  <td> 4534 </td>
                </tr>
                <tr>
                  <td>银卡</td>
                  <td>银卡</td>
                  <td>4534</td>
                  <td>+2</td>
                  <td> 4534 </td>
                </tr>
                <tr>
                  <td>钻卡</td>
                  <td>钻卡</td>
                  <td>4534</td>
                  <td>+50</td>
                  <td> 4534 </td>
                </tr>
                <tr>
                  <td>合计</td>
                  <td>合计</td>
                  <td>4534</td>
                  <td>+50</td>
                  <td> 4534 </td>
                </tr>
              </tbody>
            </table>
          </ul>
        </div>
      </div>
      <script type="text/javascript">jQuery(".slideTxtBox").slide();</script> 
   
   
   
   
   
   
   
   
</div>

    <div class="foods">
    	<ul>零食铺子后台管理系统</ul>
    	<dl><a href="" title="返回头部" class="am-icon-btn am-icon-arrow-up"></a></dl>


    	
    </div>

</div>

	
</body>
</html>

