/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-11-27 07:57:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.back.staff;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class 员工列表_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("    \r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html class=\"no-js\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<title>会员列表</title>\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/i/favicon.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/i/app-icon72x72@2x.png\">\r\n");
      out.write("<meta name=\"apple-mobile-web-app-title\" content=\"Amaze UI\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/css/amazeui.min.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/css/admin.css\">\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/js/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/js/app.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--[if lte IE 9]><p class=\"browsehappy\">升级你的浏览器吧！ <a href=\"http://se.360.cn/\" target=\"_blank\">升级浏览器</a>以获得更好的体验！</p><![endif]-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"am-popup am-popup-inner\" id=\"my-popup\">\r\n");
      out.write("\t\r\n");
      out.write("\t    <div class=\"am-popup-hd\">\r\n");
      out.write("      <h4 class=\"am-popup-title\">添加商品一级分类</h4>\r\n");
      out.write("      <span data-am-modal-close\r\n");
      out.write("            class=\"am-close\">&times;</span>\r\n");
      out.write("    </div>\r\n");
      out.write("\t\r\n");
      out.write("\t    <div class=\"am-popup-bd\">\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("      <form class=\"am-form tjlanmu\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"am-form-group\">\r\n");
      out.write("          <div class=\"zuo\">栏目名称：</div>\r\n");
      out.write("          <div class=\"you\">\r\n");
      out.write("            <input type=\"email\" class=\"am-input-sm\" id=\"doc-ipt-email-1\" placeholder=\"请输入标题\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"am-form-group\">\r\n");
      out.write("          <div class=\"zuo\">栏目关键词：</div>\r\n");
      out.write("          <div class=\"you\">\r\n");
      out.write("            <input type=\"password\" class=\"am-input-sm\" id=\"doc-ipt-pwd-1\" placeholder=\"请输入关键词\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"am-form-group am-cf\">\r\n");
      out.write("          <div class=\"zuo\">栏目描述：</div>\r\n");
      out.write("          <div class=\"you\">\r\n");
      out.write("            <textarea class=\"\" rows=\"2\" id=\"doc-ta-1\"></textarea>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"am-form-group am-cf\">\r\n");
      out.write("          <div class=\"zuo\">栏目图片：</div>\r\n");
      out.write("          <div class=\"you\" style=\"height: 45px;\">\r\n");
      out.write("            <input type=\"file\" id=\"doc-ipt-file-1\">\r\n");
      out.write("            <p class=\"am-form-help\">请选择要上传的文件...</p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"am-form-group am-cf\">\r\n");
      out.write("          <div class=\"zuo\">简介：</div>\r\n");
      out.write("          <div class=\"you\">\r\n");
      out.write("            <textarea class=\"\" rows=\"2\" id=\"doc-ta-1\"></textarea>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"am-form-group am-cf\">\r\n");
      out.write("        <div class=\"zuo\">状态：</div>\r\n");
      out.write("        <div class=\"you\" style=\"margin-top: 3px;\">\r\n");
      out.write("          <label class=\"am-checkbox-inline\">\r\n");
      out.write("            <input type=\"checkbox\" value=\"option1\">\r\n");
      out.write("            显示 </label>\r\n");
      out.write("          <label class=\"am-checkbox-inline\">\r\n");
      out.write("            <input type=\"checkbox\" value=\"option2\">\r\n");
      out.write("            隐藏 </label>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"am-form-group am-cf\">\r\n");
      out.write("          <div class=\"you\">\r\n");
      out.write("            <p>\r\n");
      out.write("              <button type=\"submit\" class=\"am-btn am-btn-success am-radius\">提交</button>\r\n");
      out.write("            </p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"am-popup am-popup-inner\" id=\"my-popups\">\r\n");
      out.write("\t\r\n");
      out.write("\t    <div class=\"am-popup-hd\">\r\n");
      out.write("      <h4 class=\"am-popup-title\">修改栏目名称</h4>\r\n");
      out.write("      <span data-am-modal-close\r\n");
      out.write("            class=\"am-close\">&times;</span>\r\n");
      out.write("    </div>\r\n");
      out.write("\t\r\n");
      out.write("\t    <div class=\"am-popup-bd\">\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("      <form class=\"am-form tjlanmu\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"am-form-group\">\r\n");
      out.write("          <div class=\"zuo\">栏目名称：</div>\r\n");
      out.write("          <div class=\"you\">\r\n");
      out.write("            <input type=\"email\" class=\"am-input-sm\" id=\"doc-ipt-email-1\" placeholder=\"请输入标题\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"am-form-group\">\r\n");
      out.write("          <div class=\"zuo\">栏目关键词：</div>\r\n");
      out.write("          <div class=\"you\">\r\n");
      out.write("            <input type=\"password\" class=\"am-input-sm\" id=\"doc-ipt-pwd-1\" placeholder=\"请输入关键词\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"am-form-group am-cf\">\r\n");
      out.write("          <div class=\"zuo\">栏目描述：</div>\r\n");
      out.write("          <div class=\"you\">\r\n");
      out.write("            <textarea class=\"\" rows=\"2\" id=\"doc-ta-1\"></textarea>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"am-form-group am-cf\">\r\n");
      out.write("          <div class=\"zuo\">栏目图片：</div>\r\n");
      out.write("          <div class=\"you\" style=\"height: 45px;\">\r\n");
      out.write("            <input type=\"file\" id=\"doc-ipt-file-1\">\r\n");
      out.write("            <p class=\"am-form-help\">请选择要上传的文件...</p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"am-form-group am-cf\">\r\n");
      out.write("          <div class=\"zuo\">简介：</div>\r\n");
      out.write("          <div class=\"you\">\r\n");
      out.write("            <textarea class=\"\" rows=\"2\" id=\"doc-ta-1\"></textarea>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"am-form-group am-cf\">\r\n");
      out.write("        <div class=\"zuo\">状态：</div>\r\n");
      out.write("        <div class=\"you\" style=\"margin-top: 3px;\">\r\n");
      out.write("          <label class=\"am-checkbox-inline\">\r\n");
      out.write("            <input type=\"checkbox\" value=\"option1\">\r\n");
      out.write("            显示 </label>\r\n");
      out.write("          <label class=\"am-checkbox-inline\">\r\n");
      out.write("            <input type=\"checkbox\" value=\"option2\">\r\n");
      out.write("            隐藏 </label>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"am-form-group am-cf\">\r\n");
      out.write("          <div class=\"you\">\r\n");
      out.write("            <p>\r\n");
      out.write("              <button type=\"submit\" class=\"am-btn am-btn-success am-radius\">提交</button>\r\n");
      out.write("            </p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"admin-biaogelist\">\r\n");
      out.write("\t\r\n");
      out.write("    <div class=\"listbiaoti am-cf\">\r\n");
      out.write("      <ul class=\"am-icon-users\"> 会员管理</ul>\r\n");
      out.write("      \r\n");
      out.write("      <dl class=\"am-icon-home\" style=\"float: right;\">当前位置： 首页 > <a href=\"#\">商品列表</a></dl>\r\n");
      out.write("      \r\n");
      out.write("      <dl>\r\n");
      out.write("        <button type=\"button\" class=\"am-btn am-btn-danger am-round am-btn-xs am-icon-plus\" > 手动添加会员</button>\r\n");
      out.write("      </dl>\r\n");
      out.write("      <!--这里打开的是新页面-->\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <form class=\"am-form am-g\">\r\n");
      out.write("          <table width=\"100%\" class=\"am-table am-table-bordered am-table-radius am-table-striped\">\r\n");
      out.write("            <thead>\r\n");
      out.write("              <tr class=\"am-success\">\r\n");
      out.write("                <th class=\"table-check\"><input type=\"checkbox\" /></th>\r\n");
      out.write("\r\n");
      out.write("                <th class=\"table-id\">ID</th>\r\n");
      out.write("                <th class=\"table-title\">会员名称</th>\r\n");
      out.write("                <th class=\"table-type\">会员等级</th>\r\n");
      out.write("                <th class=\"table-author am-hide-sm-only\">会员积分</th>\r\n");
      out.write("                <th class=\"table-author am-hide-sm-only\">注册日期</th>\r\n");
      out.write("                <th class=\"table-date am-hide-sm-only\">最近消费</th>\r\n");
      out.write("                <th width=\"130px\" class=\"table-set\">操作</th>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td><input type=\"checkbox\" /></td>\r\n");
      out.write("                \r\n");
      out.write("                <td>14</td>\r\n");
      out.write("                <td><a href=\"#\">Business management</a></td>\r\n");
      out.write("                <td>3件 （消费455个积分）</td>\r\n");
      out.write("                <td class=\"am-hide-sm-only\">访问</td><td class=\"am-hide-sm-only\">访问</td>\r\n");
      out.write("                <td class=\"am-hide-sm-only\">2014年9月4日 7:28:47</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                \t\r\n");
      out.write("                \t\r\n");
      out.write("                      \t\r\n");
      out.write("                \t<div class=\"am-btn-toolbar\">\r\n");
      out.write("                    <div class=\"am-btn-group am-btn-group-xs\">\r\n");
      out.write("                      <button class=\"am-btn am-btn-default am-btn-xs am-text-success am-round\"><span class=\"am-icon-search\" title=\"查看订单详情\"></span> </button>\r\n");
      out.write("                      <button class=\"am-btn am-btn-default am-btn-xs am-text-secondary am-round\" data-am-modal=\"{target: '#my-popups'}\" title=\"修改订单\"><span class=\"am-icon-pencil-square-o\"></span></button>\r\n");
      out.write("                      <button class=\"am-btn am-btn-default am-btn-xs am-text-danger am-round\" title=\"删除订单\"><span class=\"am-icon-trash-o\" ></span></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                \t\r\n");
      out.write("                \t\r\n");
      out.write("                \t\r\n");
      out.write("                \t\r\n");
      out.write("                \t\r\n");
      out.write("                \t\r\n");
      out.write("                </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td><input type=\"checkbox\" /></td>\r\n");
      out.write("                \r\n");
      out.write("                <td>15</td>\r\n");
      out.write("                <td><a href=\"#\">Business management</a></td>\r\n");
      out.write("                <td>default</td>\r\n");
      out.write("                <td class=\"am-hide-sm-only\"><i class=\"am-icon-close am-text-primary\"></i></td><td class=\"am-hide-sm-only\">访问</td>\r\n");
      out.write("                <td class=\"am-hide-sm-only\">2014年9月4日 7:28:47</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                \t\r\n");
      out.write("                \t<div class=\"am-btn-toolbar\">\r\n");
      out.write("                    <div class=\"am-btn-group am-btn-group-xs\">\r\n");
      out.write("                      <button class=\"am-btn am-btn-default am-btn-xs am-text-success am-round\"><span class=\"am-icon-search\" title=\"查看订单详情\"></span> </button>\r\n");
      out.write("                      <button class=\"am-btn am-btn-default am-btn-xs am-text-secondary am-round\" data-am-modal=\"{target: '#my-popups'}\" title=\"修改订单\"><span class=\"am-icon-pencil-square-o\"></span></button>\r\n");
      out.write("                      <button class=\"am-btn am-btn-default am-btn-xs am-text-danger am-round\" title=\"删除订单\"><span class=\"am-icon-trash-o\" ></span></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                \r\n");
      out.write("                </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("          </table>\r\n");
      out.write("          \r\n");
      out.write("                 <div class=\"am-btn-group am-btn-group-xs\">\r\n");
      out.write("              <button type=\"button\" class=\"am-btn am-btn-default\"><span class=\"am-icon-plus\"></span> 删除</button>\r\n");
      out.write("              <button type=\"button\" class=\"am-btn am-btn-default\"><span class=\"am-icon-save\"></span> 上架</button>\r\n");
      out.write("              <button type=\"button\" class=\"am-btn am-btn-default\"><span class=\"am-icon-save\"></span> 下架</button>\r\n");
      out.write("              <button type=\"button\" class=\"am-btn am-btn-default\"><span class=\"am-icon-save\"></span> 移动</button>\r\n");
      out.write("              <button type=\"button\" class=\"am-btn am-btn-default\"><span class=\"am-icon-plus\"></span> 新增</button>\r\n");
      out.write("              <button type=\"button\" class=\"am-btn am-btn-default\"><span class=\"am-icon-save\"></span> 保存</button>\r\n");
      out.write("              <button type=\"button\" class=\"am-btn am-btn-default\"><span class=\"am-icon-archive\"></span> 移动</button>\r\n");
      out.write("              <button type=\"button\" class=\"am-btn am-btn-default\"><span class=\"am-icon-trash-o\"></span> 删除</button>\r\n");
      out.write("            </div>\r\n");
      out.write("          \r\n");
      out.write("          <ul class=\"am-pagination am-fr\">\r\n");
      out.write("                <li class=\"am-disabled\"><a href=\"#\">«</a></li>\r\n");
      out.write("                <li class=\"am-active\"><a href=\"#\">1</a></li>\r\n");
      out.write("                <li><a href=\"#\">2</a></li>\r\n");
      out.write("                <li><a href=\"#\">3</a></li>\r\n");
      out.write("                <li><a href=\"#\">4</a></li>\r\n");
      out.write("                <li><a href=\"#\">5</a></li>\r\n");
      out.write("                <li><a href=\"#\">»</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("      \r\n");
      out.write("          <hr />\r\n");
      out.write("          <p>注：.....</p>\r\n");
      out.write("        </form>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" <div class=\"foods\">\r\n");
      out.write("  <ul>\r\n");
      out.write("    零食铺子管理系统\r\n");
      out.write("  </ul>\r\n");
      out.write("  <dl>\r\n");
      out.write("    <a href=\"\" title=\"返回头部\" class=\"am-icon-btn am-icon-arrow-up\"></a>\r\n");
      out.write("  </dl>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("<script src=\"http://libs.baidu.com/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/js/polyfill/rem.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/js/polyfill/respond.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/js/amazeui.legacy.js\"></script>\r\n");
      out.write("<![endif]--> \r\n");
      out.write("\r\n");
      out.write("<!--[if (gte IE 9)|!(IE)]><!--> \r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/js/amazeui.min.js\"></script>\r\n");
      out.write("<!--<![endif]-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html></html>");
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
    // /WEB-INF/pages/back/staff/员工列表.jsp(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("sc");
    // /WEB-INF/pages/back/staff/员工列表.jsp(4,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/back/staff/员工列表.jsp(4,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
