<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="sc" value="${pageContext.request.contextPath}" />

<!doctype html>
<html class="no-js">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>订单列表</title>
<link rel="icon" type="image/png"
	href="${sc}/staticsource/i/favicon.png">
<link rel="apple-touch-icon-precomposed"
	href="${sc}/staticsource/i/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="stylesheet" href="${sc}/staticsource/css/amazeui.min.css" />
<link rel="stylesheet" href="${sc}/staticsource/css/admin.css">
<script src="${sc}/staticsource/js/jquery.min.js"></script>
<script src="${sc}/staticsource/js/app.js"></script>
</head>
<body>
	<!--[if lte IE 9]><p class="browsehappy">升级你的浏览器吧！ <a href="http://se.360.cn/" target="_blank">升级浏览器</a>以获得更好的体验！</p><![endif]-->
</head>

<body>
<!-- 弹出查看订单详情 -->
<div class="am-popup am-popup-inner" id="my-popups">
        <div class="am-popup-hd">
          <h4 class="am-popup-title">详细库存信息（这里包含 销量 库存  损耗，  客服备注  销售的全部金额）</h4>
          <span data-am-modal-close class="am-close">&times;</span> </div>
        <div class="am-popup-bd">
        	
        	
        	
        	
          <form class="am-form tjlanmu">
            <div class="am-form-group am-cf">
              <div class="zuo">销量：</div>
              <div class="you">
                245234523452
              </div>
            </div>
            <div class="am-form-group am-cf">
              <div class="zuo"> 库存：</div>
              <div class="you">
                234523452
              </div>
            </div>


<div class="am-form-group am-cf">
              <div class="zuo"> 损耗：</div>
              <div class="you">
                234523452
              </div>
            </div>

<div class="am-form-group am-cf">
              <div class="zuo"> 购买信息：</div>
              <div class="you">
                234523452
              </div>
            </div>

<div class="am-form-group am-cf">
              <div class="zuo"> 销售金额：</div>
              <div class="you">
                234523452
              </div>
            </div>
            
            
            <div class="am-form-group am-cf">
              <div class="zuo"> 成本：</div>
              <div class="you">
                234523452
              </div>
            </div>
            
                     <div class="am-form-group am-cf">
              <div class="zuo"> 利润：</div>
              <div class="you">
                234523452
              </div>
            </div>

          </form>
        </div>
      </div>
<!-- 删除订单 -->
<!-- 弹出添加页面 -->
	<div class="am-popup am-popup-inner" id="my-popup">

		<div class="am-popup-hd">
			<h4 class="am-popup-title">查看订单详情</h4>
			<span data-am-modal-close class="am-close">&times;</span>
		</div>

		<div class="am-popup-bd">


			<form class="am-form tjlanmu">


				<div class="am-form-group">
					<div class="zuo">栏目名称：</div>
					<div class="you">
						<input type="email" class="am-input-sm" id="doc-ipt-email-1"
							placeholder="请输入标题">
					</div>
				</div>
				<div class="am-form-group">
					<div class="zuo">栏目关键词：</div>
					<div class="you">
						<input type="password" class="am-input-sm" id="doc-ipt-pwd-1"
							placeholder="请输入关键词">
					</div>
				</div>
				<div class="am-form-group am-cf">
					<div class="zuo">栏目描述：</div>
					<div class="you">
						<textarea class="" rows="2" id="doc-ta-1"></textarea>
					</div>
				</div>
				<div class="am-form-group am-cf">
					<div class="zuo">栏目图片：</div>
					<div class="you" style="height: 45px;">
						<input type="file" id="doc-ipt-file-1">
						<p class="am-form-help">请选择要上传的文件...</p>
					</div>
				</div>
				<div class="am-form-group am-cf">
					<div class="zuo">简介：</div>
					<div class="you">
						<textarea class="" rows="2" id="doc-ta-1"></textarea>
					</div>
				</div>
				<div class="am-form-group am-cf">
					<div class="zuo">状态：</div>
					<div class="you" style="margin-top: 3px;">
						<label class="am-checkbox-inline"> <input type="checkbox"
							value="option1"> 显示
						</label> <label class="am-checkbox-inline"> <input type="checkbox"
							value="option2"> 隐藏
						</label>

					</div>
				</div>
				<div class="am-form-group am-cf">
					<div class="you">
						<p>
							<button type="submit" class="am-btn am-btn-success am-radius">提交</button>
						</p>
					</div>
				</div>
			</form>
		</div>
	</div>
<!-- 弹出修改页面 -->
	<div class="am-popup am-popup-inner" id="my-popups">

		<div class="am-popup-hd">
			<h4 class="am-popup-title">修改栏目名称</h4>
			<span data-am-modal-close class="am-close">&times;</span>
		</div>

		<div class="am-popup-bd">


			<form class="am-form tjlanmu">


				<div class="am-form-group">
					<div class="zuo">栏目名称：</div>
					<div class="you">
						<input type="email" class="am-input-sm" id="doc-ipt-email-1"
							placeholder="请输入标题">
					</div>
				</div>
				<div class="am-form-group">
					<div class="zuo">栏目关键词：</div>
					<div class="you">
						<input type="password" class="am-input-sm" id="doc-ipt-pwd-1"
							placeholder="请输入关键词">
					</div>
				</div>
				<div class="am-form-group am-cf">
					<div class="zuo">栏目描述：</div>
					<div class="you">
						<textarea class="" rows="2" id="doc-ta-1"></textarea>
					</div>
				</div>
				<div class="am-form-group am-cf">
					<div class="zuo">栏目图片：</div>
					<div class="you" style="height: 45px;">
						<input type="file" id="doc-ipt-file-1">
						<p class="am-form-help">请选择要上传的文件...</p>
					</div>
				</div>
				<div class="am-form-group am-cf">
					<div class="zuo">简介：</div>
					<div class="you">
						<textarea class="" rows="2" id="doc-ta-1"></textarea>
					</div>
				</div>
				<div class="am-form-group am-cf">
					<div class="zuo">状态：</div>
					<div class="you" style="margin-top: 3px;">
						<label class="am-checkbox-inline"> <input type="checkbox"
							value="option1"> 显示
						</label> <label class="am-checkbox-inline"> <input type="checkbox"
							value="option2"> 隐藏
						</label>

					</div>
				</div>
				<div class="am-form-group am-cf">
					<div class="you">
						<p>
							<button type="submit" class="am-btn am-btn-success am-radius">提交</button>
						</p>
					</div>
				</div>
			</form>

		</div>



	</div>

	<div class="admin-biaogelist">

		<div class="listbiaoti am-cf">
			<ul class="am-icon-flag on">订单列表
			</ul>

			<dl class="am-icon-home" style="float: right;">
				当前位置： 首页 >
				<a href="#">商品列表</a>
			</dl>

			<dl>
				<button type="button"
					class="am-btn am-btn-danger am-round am-btn-xs am-icon-plus">
					补充线订单</button>
			</dl>

		</div>
<!--这里打开的是新页面-->

		<form class="am-form am-g">
			<table width="100%"
				class="am-table am-table-bordered am-table-radius am-table-striped am-table-hover">
				<thead>
					<tr class="am-success">
						<th class="table-check"><input type="checkbox" /></th>

						<th class="table-title ">物流名称</th>
						<th class="table-title ">物流单号</th>
						<th class="table-title">支付金额</th>
						<th class="table-title">邮费</th>
						<th class="table-title">买家昵称</th>
						<th class="table-date am-hide-sm-only">支付时间</th>
						<th class="table-date am-hide-sm-only">发货时间</th>
						<th class="table-date am-hide-sm-only">交易完成时间</th>
						<th class="table-date am-hide-sm-only">交易关闭时间</th>
						<th class="table-date am-hide-sm-only">创建时间</th>
						<th class="table-date am-hide-sm-only">修改时间</th>
						<th class="table-date am-hide-sm-only">状态</th>
						<th class="table-type">支付类型</th>
						<th class="table-title">买家留言</th>
						<th width="130px" class="table-set">操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${orders }" var="o" varStatus="status">
						<tr>
							<td><input type="checkbox" name="orderId"
								value="${o.orderId }" /></td>

							<td>${o.shippingName }</td>
							<td>${o.shippingCode }</td>
							<td>${o.payment }</td>
							<td class="am-hide-sm-only">${o.postFree }</td>
							<td class="am-hide-sm-only">${o.buyerNick }</td>
							<td class="am-hide-sm-only">${o.paymentTime }</td>
							<td class="am-hide-sm-only">${o.consignTime }</td>
							<td class="am-hide-sm-only">${o.endTime }</td>
							<td class="am-hide-sm-only">${o.closeTime }</td>
							<td class="am-hide-sm-only">${o.createTime }</td>
							<td class="am-hide-sm-only">${o.updateTime }</td>
							<td class="am-hide-sm-only">${o.status }</td>
							<td class="am-hide-sm-only">${o.paymentType }</td>
							<td class="am-hide-sm-only">${o.buyerMessige }</td>
<!-- 查看修改删除按钮 -->
							<td>
								<div class="am-btn-toolbar">
									<div class="am-btn-group am-btn-group-xs">
										<a
											class="am-btn am-btn-default am-btn-xs am-text-success am-round am-icon-file"
											data-am-modal="{target: '#my-popups'}" title="查看订单详情"></a>
										<!-- <button class="am-btn am-btn-default am-btn-xs am-text-success am-round"><span class="am-icon-search" title="查看订单详情"></span> </button> -->
										<button
											class="am-btn am-btn-default am-btn-xs am-text-secondary am-round"
											data-am-modal="{target: '#my-popups'}" title="修改订单">
											<span class="am-icon-pencil-square-o"></span>
										</button>
										<button
											class="am-btn am-btn-default am-btn-xs am-text-danger am-round"
											title="删除订单">
											<span class="am-icon-trash-o"></span>
										</button>
									</div>
								</div>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
<!-- 实现增删改查按钮 -->
			<div class="am-btn-group am-btn-group-xs">
				<button type="button" class="am-btn am-btn-default">
					<span class="am-icon-plus"></span> 删除
				</button>
				<button type="button" class="am-btn am-btn-default">
					<span class="am-icon-save"></span> 上架
				</button>
				<button type="button" class="am-btn am-btn-default">
					<span class="am-icon-save"></span> 下架
				</button>
				<button type="button" class="am-btn am-btn-default">
					<span class="am-icon-save"></span> 移动
				</button>
				<button type="button" class="am-btn am-btn-default">
					<span class="am-icon-plus"></span> 新增
				</button>
				<button type="button" class="am-btn am-btn-default">
					<span class="am-icon-save"></span> 保存
				</button>
				<button type="button" class="am-btn am-btn-default">
					<span class="am-icon-archive"></span> 移动
				</button>
				<button type="button" class="am-btn am-btn-default">
					<span class="am-icon-trash-o"></span> 删除
				</button>
			</div>

			<ul class="am-pagination am-fr">
				<li class="am-disabled"><a href="#">«</a></li>
				<li class="am-active"><a href="#">1</a></li>
				<li><a href="#">2</a></li>
				<li><a href="#">3</a></li>
				<li><a href="#">4</a></li>
				<li><a href="#">5</a></li>
				<li><a href="#">»</a></li>
			</ul>




			<hr />
			<p>注：.....</p>
		</form>




		<div class="foods">
			<ul>零食铺子管理系统
			</ul>
			<dl>
				<a href="" title="返回头部" class="am-icon-btn am-icon-arrow-up"></a>
			</dl>
		</div>




	</div>

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