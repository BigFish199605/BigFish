/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-11-25 09:36:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class information_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/pages/user/../home/head.jsp", Long.valueOf(1511596046280L));
    _jspx_dependants.put("/WEB-INF/pages/user/../home/foot.jsp", Long.valueOf(1511602428210L));
    _jspx_dependants.put("/WEB-INF/pages/user/../home/frame.jsp", Long.valueOf(1511601802248L));
    _jspx_dependants.put("/WEB-INF/pages/user/../home/../base.jsp", Long.valueOf(1511586170000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0\">\r\n");
      out.write("\r\n");
      out.write("\t\t<title>个人资料</title>\r\n");
      out.write("\r\n");
      out.write("\t\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/AmazeUI-2.4.2/assets/css/admin.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\t\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/AmazeUI-2.4.2/assets/css/amazeui.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\t\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/css/personal.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\t\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/css/infstyle.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\t\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/AmazeUI-2.4.2/assets/js/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/AmazeUI-2.4.2/assets/js/amazeui.js\"></script>\t\t\t\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>导航栏</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"hmtop\">\r\n");
      out.write("\t\t\t<!--顶部导航条 -->\r\n");
      out.write("\t\t\t<div class=\"am-container header\">\r\n");
      out.write("\t\t\t\t<ul class=\"message-l\">\r\n");
      out.write("\t\t\t\t\t<div class=\"topMessage\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"menu-hd\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"tologin\"  class=\"h\">亲，请登录</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"toregister\" target=\"_top\">免费注册</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<ul class=\"message-r\">\r\n");
      out.write("\t\t\t\t\t<div class=\"topMessage home\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"menu-hd\"><a href=\"home\" target=\"_top\" class=\"h\">商城首页</a></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"topMessage my-shangcheng\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"menu-hd MyShangcheng\"><a href=\"option\" target=\"_top\"><i class=\"am-icon-user am-icon-fw\"></i>个人中心</a></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"topMessage mini-cart\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"menu-hd\"><a id=\"mc-menu-hd\" href=\"cart\" target=\"_top\"><i class=\"am-icon-shopping-cart  am-icon-fw\"></i><span>购物车</span><strong id=\"J_MiniCartNum\" class=\"h\">0</strong></a></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"topMessage favorite\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"menu-hd\"><a href=\"collection\" target=\"_top\"><i class=\"am-icon-heart am-icon-fw\"></i><span>收藏夹</span></a></div>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!--悬浮搜索框-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"nav white\">\r\n");
      out.write("\t\t\t\t\t<div class=\"logoBig\">\r\n");
      out.write("\t\t\t\t\t\t<li><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/images/logo.png\" /></li>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"search-bar pr\">\r\n");
      out.write("\t\t\t\t\t\t<a name=\"index_none_header_sysc\" href=\"search\"></a>\r\n");
      out.write("\t\t\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"searchInput\" name=\"index_none_header_sysc\" type=\"text\" placeholder=\"搜索\" autocomplete=\"off\">\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"ai-topsearch\" class=\"submit am-btn\" value=\"搜索\" index=\"1\" type=\"submit\">\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</article>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("            <div class=\"nav-table\">\r\n");
      out.write("\t\t\t\t\t   <div class=\"long-title\"><span class=\"all-goods\">全部分类</span></div>\r\n");
      out.write("\t\t\t\t\t   <div class=\"nav-cont\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"index\"><a href=\"home\">首页</a></li>\r\n");
      out.write("                                <li class=\"qc\"><a href=\"#\">闪购</a></li>\r\n");
      out.write("                                <li class=\"qc\"><a href=\"#\">限时抢</a></li>\r\n");
      out.write("                                <li class=\"qc\"><a href=\"#\">团购</a></li>\r\n");
      out.write("                                <li class=\"qc last\"><a href=\"#\">大包装</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t    <div class=\"nav-extra\">\r\n");
      out.write("\t\t\t\t\t\t    \t<i class=\"am-icon-user-secret am-icon-md nav-user\"></i><b></b>我的福利\r\n");
      out.write("\t\t\t\t\t\t    \t<i class=\"am-icon-angle-right\" style=\"padding-left: 10px;\"></i>\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<b class=\"line\"></b>\r\n");
      out.write("\t\t<div class=\"center\">\r\n");
      out.write("\t\t\t<div class=\"col-main\">\r\n");
      out.write("\t\t\t\t<div class=\"main-wrap\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"user-info\">\r\n");
      out.write("\t\t\t\t\t\t<!--标题 -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"am-cf am-padding\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"am-fl am-cf\"><strong class=\"am-text-danger am-text-lg\">个人资料</strong> / <small>Personal&nbsp;information</small></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<hr/>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!--头像 -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"user-infoPic\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"filePic\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"file\" class=\"inputPic\" allowexts=\"gif,jpeg,jpg,png,bmp\" accept=\"image/*\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"am-circle am-img-thumbnail\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/images/getAvatar.do.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"am-form-help\">头像</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"info-m\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div><b>用户名：<i>小叮当</i></b></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"vip\">\r\n");
      out.write("                                      <span></span><a href=\"#\">会员专享</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!--个人信息 -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"info-main\">\r\n");
      out.write("\t\t\t\t\t\t\t<form class=\"am-form am-form-horizontal\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"am-form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"user-name2\" class=\"am-form-label\">昵称</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"am-form-content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"user-name2\" placeholder=\"nickname\">\r\n");
      out.write("                                          <small>昵称长度不能超过40个汉字</small>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"am-form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"user-name\" class=\"am-form-label\">姓名</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"am-form-content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"user-name2\" placeholder=\"name\">\r\n");
      out.write("                                         \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"am-form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"am-form-label\">性别</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"am-form-content sex\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"am-radio-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"radio10\" value=\"male\" data-am-ucheck> 男\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"am-radio-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"radio10\" value=\"female\" data-am-ucheck> 女\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"am-radio-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"radio10\" value=\"secret\" data-am-ucheck> 保密\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"am-form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"user-birth\" class=\"am-form-label\">生日</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"am-form-content birth\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"birth-select\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select data-am-selected>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"a\">2015</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"b\">1987</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<em>年</em>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"birth-select2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select data-am-selected>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"a\">12</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"b\">8</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<em>月</em></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"birth-select2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select data-am-selected>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"a\">21</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"b\">23</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<em>日</em></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"am-form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"user-phone\" class=\"am-form-label\">电话</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"am-form-content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input id=\"user-phone\" placeholder=\"telephonenumber\" type=\"tel\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"am-form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"user-email\" class=\"am-form-label\">电子邮件</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"am-form-content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input id=\"user-email\" placeholder=\"Email\" type=\"email\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"am-form-group address\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"user-address\" class=\"am-form-label\">收货地址</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"am-form-content address\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"address\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"new-mu_l2cw\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"province\">湖北</span>省\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"city\">武汉</span>市\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"dist\">洪山</span>区\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"street\">雄楚大道666号(中南财经政法大学)</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"am-icon-angle-right\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"am-form-group safety\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"user-safety\" class=\"am-form-label\">账号安全</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"am-form-content safety\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"safety.html\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"am-icon-angle-right\"></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"info-btn\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"am-btn am-btn-danger\">保存修改</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"footer \">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-hd \" style=\"text-align: center\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"bj.tedu.cn\">达内科技</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<b>|</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"# \">商城首页</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<b>|</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"# \">支付宝</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<b>|</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"# \">物流</a>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-bd \">\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"bj.tedu.cn \">关于达内</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"# \">合作伙伴</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"# \">联系我们</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"# \">网站地图</a>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html >\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("\r\n");
      out.write("\t\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/AmazeUI-2.4.2/assets/css/admin.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\t\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/AmazeUI-2.4.2/assets/css/amazeui.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\t\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/css/personal.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\t\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/css/stepstyle.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\t\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/AmazeUI-2.4.2/assets/js/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/AmazeUI-2.4.2/assets/js/amazeui.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<title></title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t\t<aside class=\"menu\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li class=\"person active\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"index.html\"><i class=\"am-icon-user\"></i>个人中心</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"person\">\r\n");
      out.write("\t\t\t\t\t\t<p><i class=\"am-icon-newspaper-o\"></i>个人资料</p>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"information\">个人信息</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"#\">安全设置</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"address\">地址管理</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"cardlist\">快捷支付</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"person\">\r\n");
      out.write("\t\t\t\t\t\t<p><i class=\"am-icon-balance-scale\"></i>我的交易</p>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"order\">订单管理</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"#\">退款售后</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"#\">评价商品</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"person\">\r\n");
      out.write("\t\t\t\t\t\t<p><i class=\"am-icon-dollar\"></i>我的资产</p>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"#\">我的积分</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"#\">优惠券 </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"#\">红包</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"#\">账户余额</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"#\">账单明细</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"person\">\r\n");
      out.write("\t\t\t\t\t\t<p><i class=\"am-icon-tags\"></i>我的收藏</p>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"collection\">收藏</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"#\">足迹</a></li>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"person\">\r\n");
      out.write("\t\t\t\t\t\t<p><i class=\"am-icon-qq\"></i>在线客服</p>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"#\">商品咨询</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"#\">意见反馈</a></li>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"news\">我的消息</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</aside>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/pages/user/../home/../base.jsp(3,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("sc");
    // /WEB-INF/pages/user/../home/../base.jsp(3,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/user/../home/../base.jsp(3,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f1.setParent(null);
    // /WEB-INF/pages/user/../home/../base.jsp(3,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setVar("sc");
    // /WEB-INF/pages/user/../home/../base.jsp(3,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/user/../home/../base.jsp(3,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
    if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
    return false;
  }
}
