/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-11-26 19:06:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.back.sysadmin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/pages/back/sysadmin/../base.jsp", Long.valueOf(1511721771974L));
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/css/amazeui.min.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/css/admin.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/js/app.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/js/amazeui.min.js\"></script>");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title></title>\r\n");
      out.write("<body>\r\n");
      out.write(" \r\n");
      out.write("<div class=\"admin\">\r\n");
      out.write("   <div class=\"admin-index\">\r\n");
      out.write("      <dl data-am-scrollspy=\"{animation: 'slide-right', delay: 100}\">\r\n");
      out.write("        <dt class=\"qs\"><i class=\"am-icon-users\"></i></dt>\r\n");
      out.write("        <dd>455</dd>\r\n");
      out.write("        <dd class=\"f12\">团队数量</dd>\r\n");
      out.write("      </dl>\r\n");
      out.write("      <dl data-am-scrollspy=\"{animation: 'slide-right', delay: 300}\">\r\n");
      out.write("        <dt class=\"cs\"><i class=\"am-icon-area-chart\"></i></dt>\r\n");
      out.write("        <dd>455</dd>\r\n");
      out.write("        <dd class=\"f12\">今日收入</dd>\r\n");
      out.write("      </dl>\r\n");
      out.write("      <dl data-am-scrollspy=\"{animation: 'slide-right', delay: 600}\">\r\n");
      out.write("        <dt class=\"hs\"><i class=\"am-icon-shopping-cart\"></i></dt>\r\n");
      out.write("        <dd>455</dd>\r\n");
      out.write("        <dd class=\"f12\">商品数量</dd>\r\n");
      out.write("      </dl>\r\n");
      out.write("      <dl data-am-scrollspy=\"{animation: 'slide-right', delay: 900}\">\r\n");
      out.write("        <dt class=\"ls\"><i class=\"am-icon-cny\"></i></dt>\r\n");
      out.write("        <dd>455</dd>\r\n");
      out.write("        <dd class=\"f12\">全部收入</dd>\r\n");
      out.write("      </dl>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"admin-biaoge\">\r\n");
      out.write("      <div class=\"xinxitj\">信息概况</div>\r\n");
      out.write("      <table class=\"am-table\">\r\n");
      out.write("        <thead>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <th>团队统计</th>\r\n");
      out.write("            <th>全部会员</th>\r\n");
      out.write("            <th>全部未激活</th>\r\n");
      out.write("            <th>今日新增</th>\r\n");
      out.write("            <th>今日未激活</th>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>普卡</td>\r\n");
      out.write("            <td>普卡</td>\r\n");
      out.write("            <td><a href=\"#\">4534</a></td>\r\n");
      out.write("            <td>+20</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>银卡</td>\r\n");
      out.write("            <td>银卡</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+2</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>金卡</td>\r\n");
      out.write("            <td>金卡</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+10</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>钻卡</td>\r\n");
      out.write("            <td>钻卡</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+50</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>合计</td>\r\n");
      out.write("            <td>合计</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+50</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </tbody>\r\n");
      out.write("      </table>\r\n");
      out.write("      <table class=\"am-table\">\r\n");
      out.write("        <thead>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <th>团队统计</th>\r\n");
      out.write("            <th>全部会员</th>\r\n");
      out.write("            <th>全部未激活</th>\r\n");
      out.write("            <th>今日新增</th>\r\n");
      out.write("            <th>今日未激活</th>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>普卡</td>\r\n");
      out.write("            <td>普卡</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+50</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>银卡</td>\r\n");
      out.write("            <td>银卡</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+2</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>金卡</td>\r\n");
      out.write("            <td>金卡</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+10</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>钻卡</td>\r\n");
      out.write("            <td>钻卡</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+50</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>合计</td>\r\n");
      out.write("            <td>合计</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+50</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </tbody>\r\n");
      out.write("      </table>\r\n");
      out.write("      <table class=\"am-table\">\r\n");
      out.write("        <thead>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <th>资金统计</th>\r\n");
      out.write("            <th>账户总收入</th>\r\n");
      out.write("            <th>账户总支出</th>\r\n");
      out.write("            <th>账户余额</th>\r\n");
      out.write("            <th>今日收入</th>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>普卡</td>\r\n");
      out.write("            <td>普卡</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+20</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>银卡</td>\r\n");
      out.write("            <td>银卡</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+2</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>金卡</td>\r\n");
      out.write("            <td>金卡</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+10</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>钻卡</td>\r\n");
      out.write("            <td>钻卡</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+50</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>合计</td>\r\n");
      out.write("            <td>合计</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+50</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </tbody>\r\n");
      out.write("      </table>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"shuju\">\r\n");
      out.write("      <div class=\"shujuone\">\r\n");
      out.write("        <dl>\r\n");
      out.write("          <dt>全盘收入：  1356666</dt>\r\n");
      out.write("          <dt>全盘支出：   5646465.98</dt>\r\n");
      out.write("          <dt>全盘利润：  546464</dt>\r\n");
      out.write("        </dl>\r\n");
      out.write("        <ul>\r\n");
      out.write("          <h2>26.83%</h2>\r\n");
      out.write("          <li>全盘拨出</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"shujutow\">\r\n");
      out.write("        <dl>\r\n");
      out.write("          <dt>全盘收入：  1356666</dt>\r\n");
      out.write("          <dt>全盘支出：   5646465.98</dt>\r\n");
      out.write("          <dt>全盘利润：  546464</dt>\r\n");
      out.write("        </dl>\r\n");
      out.write("        <ul>\r\n");
      out.write("          <h2>26.83%</h2>\r\n");
      out.write("          <li>全盘拨出</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"slideTxtBox\">\r\n");
      out.write("        <div class=\"hd\">\r\n");
      out.write("          <ul>\r\n");
      out.write("            <li>其他信息</li>\r\n");
      out.write("            <li>工作进度表</li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"bd\">\r\n");
      out.write("          <ul>\r\n");
      out.write("            <table width=\"100%\" class=\"am-table\">\r\n");
      out.write("              <tbody>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td width=\"7%\"  align=\"center\">1 </td>\r\n");
      out.write("                  <td width=\"83%\" >工作进度名称</td>\r\n");
      out.write("                  <td width=\"10%\"  align=\"center\"><a href=\"#\">10%</a></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td align=\"center\">1 </td>\r\n");
      out.write("                  <td>工作进度名称</td>\r\n");
      out.write("                  <td  align=\"center\"><a href=\"#\">10%</a></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td  align=\"center\">1 </td>\r\n");
      out.write("                  <td>工作进度名称</td>\r\n");
      out.write("                  <td  align=\"center\"><a href=\"#\">10%</a></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td  align=\"center\">1 </td>\r\n");
      out.write("                  <td>工作进度名称</td>\r\n");
      out.write("                  <td  align=\"center\"><a href=\"#\">10%</a></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td  align=\"center\">1 </td>\r\n");
      out.write("                  <td>工作进度名称</td>\r\n");
      out.write("                  <td  align=\"center\"><a href=\"#\">10%</a></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td  align=\"center\">1 </td>\r\n");
      out.write("                  <td>工作进度名称</td>\r\n");
      out.write("                  <td  align=\"center\"><a href=\"#\">10%</a></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td  align=\"center\">1 </td>\r\n");
      out.write("                  <td>工作进度名称</td>\r\n");
      out.write("                  <td  align=\"center\"><a href=\"#\">10%</a></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("              </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("          </ul>\r\n");
      out.write("          <ul>\r\n");
      out.write("            <table class=\"am-table\">\r\n");
      out.write("              <tbody>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td>普卡</td>\r\n");
      out.write("                  <td>普卡</td>\r\n");
      out.write("                  <td><a href=\"#\">4534</a></td>\r\n");
      out.write("                  <td>+20</td>\r\n");
      out.write("                  <td> 4534 </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td>银卡</td>\r\n");
      out.write("                  <td>银卡</td>\r\n");
      out.write("                  <td>4534</td>\r\n");
      out.write("                  <td>+2</td>\r\n");
      out.write("                  <td> 4534 </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td>金卡</td>\r\n");
      out.write("                  <td>金卡</td>\r\n");
      out.write("                  <td>4534</td>\r\n");
      out.write("                  <td>+10</td>\r\n");
      out.write("                  <td> 4534 </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td>钻卡</td>\r\n");
      out.write("                  <td>钻卡</td>\r\n");
      out.write("                  <td>4534</td>\r\n");
      out.write("                  <td>+50</td>\r\n");
      out.write("                  <td> 4534 </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td>合计</td>\r\n");
      out.write("                  <td>合计</td>\r\n");
      out.write("                  <td>4534</td>\r\n");
      out.write("                  <td>+50</td>\r\n");
      out.write("                  <td> 4534 </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("              </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <script type=\"text/javascript\">jQuery(\".slideTxtBox\").slide();</script> \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"foods\">\r\n");
      out.write("    \t<ul>零食铺子后台管理系统</ul>\r\n");
      out.write("    \t<dl><a href=\"\" title=\"返回头部\" class=\"am-icon-btn am-icon-arrow-up\"></a></dl>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \t\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
    // /WEB-INF/pages/back/sysadmin/../base.jsp(3,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("sc");
    // /WEB-INF/pages/back/sysadmin/../base.jsp(3,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/back/sysadmin/../base.jsp(3,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
