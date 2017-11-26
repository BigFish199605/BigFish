<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">			
		<title>全部分类</title>
		<link href="${sc}/staticsource/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />
		<link href="${sc}/staticsource/basic/css/demo.css" rel="stylesheet" type="text/css" />		
		<link href="${sc}/staticsource/css/sortstyle.css" rel="stylesheet" type="text/css" />
		<script src="${sc}/staticsource/AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
	</head>

	<body>
		
			<%@ include file="../home/head.jsp" %>

				<div class="clear"></div>
			</div>		
		
		<!--主体-->
		
		<div id="nav" class="navfull">
			<div class="area clearfix">
				<div class="category-content" id="guide_2">
					<div class="long-title"><span class="all-goods">全部分类</span><span id="meauBack"><a href="home.html">返回</a></span></div>
					<div class="category">
										<ul class="category-list" id="js_climit_li">
											<li class="appliance js_toggle relative first selected">
												<div class="category-info">
													<h3 class="category-name b-category-name"><i><img src="${sc}/staticsource/images/cake.png"></i><a class="ml-22" title="点心">点心/蛋糕</a></h3>
													<em>&gt;</em></div>
												<div class="menu-item menu-in top">
													<div class="area-in">
														<div class="area-bg">
															<div class="menu-srot">
																
																<div class="brand-side">
													              <dl class="dl-sort"><dt><span>为您推荐</span></dt>
													                <img src="${sc}/staticsource/images/TJ.jpg">
													              </dl>
												                </div>																
																
																<div class="sort-side">
																	

																</div>

															</div>
														</div>
													</div>
												</div>
											<b class="arrow"></b>	
											</li>
											<li class="appliance js_toggle relative">
												<div class="category-info">
													<h3 class="category-name b-category-name"><i><img src="${sc}/staticsource/images/cookies.png"></i><a class="ml-22" title="饼干、膨化">饼干/膨化</a></h3>
													<em>&gt;</em></div>
												<div class="menu-item menu-in top">
													<div class="area-in">
														<div class="area-bg">
															<div class="menu-srot">
																<div class="brand-side">
													              <dl class="dl-sort"><dt><span>为您推荐</span></dt>
													                <img src="${sc}/staticsource/images/TJ.jpg">
													              </dl>
												                </div>																	
																<div class="sort-side">
																
												<c:forEach items="${list}" var="prod">
													<div id="prod_div">
														<a href=""> <img
															src="${sc }/staticsource${prod.image}"></img>
														</a>
														<div id="prod_name_div">
																${prod.name }
														</div>
														<div id="prod_price_div">￥${prod.price }元</div>
														<div>
															<div id="gotocart_div">
																加入购物车
															</div>
															<div id="say_div">库存：${prod.num}</div>
														</div>
													</div>
												</c:forEach>
												
																</div>

															</div>
														</div>
													</div>
												</div>
                                             <b class="arrow"></b>
											</li>
											<li class="appliance js_toggle relative">
												<div class="category-info">
													<h3 class="category-name b-category-name"><i><img src="${sc}/staticsource/images/meat.png"></i><a class="ml-22" title="熟食、肉类">熟食/肉类</a></h3>
													<em>&gt;</em></div>
												<div class="menu-item menu-in top">
													<div class="area-in">
														<div class="area-bg">
															<div class="menu-srot">
																<div class="brand-side">
													              <dl class="dl-sort"><dt><span>为您推荐</span></dt>
													                <img src="${sc}/staticsource/images/TJ.jpg">
													              </dl>
												                </div>																	
																<div class="sort-side">
												
																</div>

															</div>
														</div>
													</div>
												</div>
                                            <b class="arrow"></b>
											</li>
											<li class="appliance js_toggle relative">
												<div class="category-info">
													<h3 class="category-name b-category-name"><i><img src="${sc}/staticsource/images/bamboo.png"></i><a class="ml-22" title="素食、卤味">素食/卤味</a></h3>
													<em>&gt;</em></div>
												<div class="menu-item menu-in top">
													<div class="area-in">
														<div class="area-bg">
															<div class="menu-srot">
																<div class="brand-side">
													              <dl class="dl-sort"><dt><span>为您推荐</span></dt>
													                <img src="${sc}/staticsource/images/TJ.jpg">
													              </dl>
																</div>																
																<div class="sort-side">
												
																</div>

															</div>
														</div>
													</div>
												</div>
                                             <b class="arrow"></b>
											</li>
											<li class="appliance js_toggle relative">
												<div class="category-info">
													<h3 class="category-name b-category-name"><i><img src="${sc}/staticsource/images/nut.png"></i><a class="ml-22" title="坚果、炒货">坚果/炒货</a></h3>
													<em>&gt;</em></div>
												<div class="menu-item menu-in top">
													<div class="area-in">
														<div class="area-bg">
															<div class="menu-srot">
																<div class="brand-side">
													              <dl class="dl-sort"><dt><span>为您推荐</span></dt>
													                <img src="${sc}/staticsource/images/TJ.jpg">
													              </dl>
																</div>																
																<div class="sort-side">
																	
																</div>

															</div>
														</div>
													</div>
												</div>
												<b class="arrow"></b>
											</li>
											<li class="appliance js_toggle relative">
												<div class="category-info">
													<h3 class="category-name b-category-name"><i><img src="${sc}/staticsource/images/candy.png"></i><a class="ml-22" title="糖果、蜜饯">糖果/蜜饯</a></h3>
													<em>&gt;</em></div>
												<div class="menu-item menu-in top">
													<div class="area-in">
														<div class="area-bg">
															<div class="menu-srot">
																<div class="brand-side">
													              <dl class="dl-sort"><dt><span>为您推荐</span></dt>
													                <img src="${sc}/staticsource/images/TJ.jpg">
													              </dl>
																</div>																
																<div class="sort-side">
																	
																</div>

															</div>
														</div>
													</div>
												</div>
                                            <b class="arrow"></b>
											</li>
											<li class="appliance js_toggle relative">
												<div class="category-info">
													<h3 class="category-name b-category-name"><i><img src="${sc}/staticsource/images/chocolate.png"></i><a class="ml-22" title="巧克力">巧克力</a></h3>
													<em>&gt;</em></div>
												<div class="menu-item menu-in top">
													<div class="area-in">
														<div class="area-bg">
															<div class="menu-srot">
																<div class="brand-side">
													              <dl class="dl-sort"><dt><span>为您推荐</span></dt>
													                <img src="${sc}/staticsource/images/TJ.jpg">
													              </dl>
																</div>																
																<div class="sort-side">
																	
																</div>

															</div>
														</div>
													</div>
												</div>
												<b class="arrow"></b>
											</li>
											<li class="appliance js_toggle relative">
												<div class="category-info">
													<h3 class="category-name b-category-name"><i><img src="${sc}/staticsource/images/fish.png"></i><a class="ml-22" title="海味、河鲜">海味/河鲜</a></h3>
													<em>&gt;</em></div>
												<div class="menu-item menu-in top">
													<div class="area-in">
														<div class="area-bg">
															<div class="menu-srot">
																<div class="brand-side">
													              <dl class="dl-sort"><dt><span>为您推荐</span></dt>
													                <img src="${sc}/staticsource/images/TJ.jpg">
													              </dl>
																</div>																
																<div class="sort-side">
																	
																</div>

															</div>
														</div>
													</div>
												</div>
                                             <b class="arrow"></b>
											</li>
											<li class="appliance js_toggle relative">
												<div class="category-info">
													<h3 class="category-name b-category-name"><i><img src="${sc}/staticsource/images/tea.png"></i><a class="ml-22" title="花茶、果茶">花茶/果茶</a></h3>
													<em>&gt;</em></div>
												<div class="menu-item menu-in top">
													<div class="area-in">
														<div class="area-bg">
															<div class="menu-srot">
																<div class="brand-side">
													              <dl class="dl-sort"><dt><span>为您推荐</span></dt>
													                <img src="${sc}/staticsource/images/TJ.jpg">
													              </dl>
																</div>																
																<div class="sort-side">
																	
																</div>

															</div>
														</div>
													</div>
												</div>
												<b class="arrow"></b>
											</li>
											<li class="appliance js_toggle relative last">
												<div class="category-info">
													<h3 class="category-name b-category-name"><i><img src="${sc}/staticsource/images/package.png"></i><a class="ml-22" title="品牌、礼包">品牌/礼包</a></h3>
													<em>&gt;</em></div>
												<div class="menu-item menu-in top">
													<div class="area-in">
														<div class="area-bg">
															<div class="menu-srot">
																<div class="brand-side">
													              <dl class="dl-sort"><dt><span>为您推荐</span></dt>
													                <img src="${sc}/staticsource/images/TJ.jpg">
													              </dl>
																</div>																
																<div class="sort-side">
																	
																</div>

															</div>
														</div>
													</div>
												</div>

											</li>
										</ul>
					</div>
				</div>

			</div>
		</div>
		<script type="text/javascript">
			$(document).ready(function() {
		$("li").click(function() {		
		     	$(this).addClass("selected").siblings().removeClass("selected");
	       })
		})
		</script>
		<div class="clear"></div>
		<!--引导 -->
		<div class="navCir">
			<li><a href="home"><i class="am-icon-home "></i>首页</a></li>
			<li  class="active"><a href="sort"><i class="am-icon-list"></i>分类</a></li>
			<li><a href="cart"><i class="am-icon-shopping-basket"></i>购物车</a></li>	
			<li><a href="index"><i class="am-icon-user"></i>我的</a></li>					
		</div>
	</body>

</html>