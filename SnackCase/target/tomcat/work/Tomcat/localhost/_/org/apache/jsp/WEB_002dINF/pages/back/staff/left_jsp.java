/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
<<<<<<< HEAD
 * Generated at: 2017-11-27 01:33:37 UTC
=======
<<<<<<< HEAD
 * Generated at: 2017-11-27 01:46:21 UTC
=======
<<<<<<< HEAD
 * Generated at: 2017-11-27 07:57:51 UTC
=======
 * Generated at: 2017-11-27 01:04:00 UTC
>>>>>>> d2eb4786c97f25b79bee1c6885a9f8bfba28f54d
>>>>>>> 4645879ec83f76507ce8215838aa924644ef92f5
>>>>>>> b0936ae8776667e80061d7dd697d17b21408696b
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.back.staff;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class left_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
<<<<<<< HEAD
    _jspx_dependants.put("/WEB-INF/pages/back/staff/../base.jsp", Long.valueOf(1511745714467L));
=======
<<<<<<< HEAD
    _jspx_dependants.put("/WEB-INF/pages/back/staff/../base.jsp", Long.valueOf(1511746603376L));
=======
    _jspx_dependants.put("/WEB-INF/pages/back/staff/../base.jsp", Long.valueOf(1511745050987L));
>>>>>>> 4645879ec83f76507ce8215838aa924644ef92f5
>>>>>>> b0936ae8776667e80061d7dd697d17b21408696b
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
      out.write("<head>\r\n");
      out.write("    <title></title>\r\n");
      out.write("</head>\r\n");
      out.write(" \r\n");
      out.write("<body id=\"left_frame\">\r\n");
      out.write("<div class=\"nav-navicon admin-main admin-sidebar\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"sideMenu\">\r\n");
      out.write("      <h3 class=\"am-icon-users\"><em></em>员工界面</h3>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li class=\"func\" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'>\r\n");
<<<<<<< HEAD
      out.write("        <a href=\"staff\">员工列表</a> </li>\r\n");
=======
<<<<<<< HEAD
      out.write("        <a href=\"staff\">员工列表</a> </li>\r\n");
=======
<<<<<<< HEAD
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/back/staff/staff\" onclick=\"linkHighlighted(this)\" target=\"main\">员工列表</a> </li>\r\n");
=======
      out.write("        <a href=\"staff\">员工列表</a> </li>\r\n");
>>>>>>> d2eb4786c97f25b79bee1c6885a9f8bfba28f54d
>>>>>>> 4645879ec83f76507ce8215838aa924644ef92f5
>>>>>>> b0936ae8776667e80061d7dd697d17b21408696b
      out.write("        <!-- 员工的一般信息修改 -->\r\n");
      out.write("        <li class=\"func\" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'>\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/back/staff/staffInfo\" onclick=\"linkHighlighted(this)\" target=\"main\">员工信息</a></li>\r\n");
      out.write("        <!-- 添加新员工 -->\r\n");
      out.write("        <li class=\"func\" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'>\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/back/staff/staffAdd\" onclick=\"linkHighlighted(this)\" target=\"main\">添加新员工信息</a></li>\r\n");
      out.write("        <!-- 角色模块 -->\r\n");
      out.write("        <li class=\"func\" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'>\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/back/staff/staffJob\" onclick=\"linkHighlighted(this)\" target=\"main\">员工职位</a></li>\r\n");
      out.write("        <!-- 权限模块 -->\r\n");
      out.write("        <li class=\"func\" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'>\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/back/staff/jobInfo\" onclick=\"linkHighlighted(this)\" target=\"main\">角色权限</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- sideMenu End --> \r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("\t\t\tjQuery(\".sideMenu\").slide({\r\n");
      out.write("\t\t\t\ttitCell:\"h3\", //鼠标触发对象\r\n");
      out.write("\t\t\t\ttargetCell:\"ul\", //与titCell一一对应，第n个titCell控制第n个targetCell的显示隐藏\r\n");
      out.write("\t\t\t\teffect:\"slideDown\", //targetCell下拉效果\r\n");
      out.write("\t\t\t\tdelayTime:300 , //效果时间\r\n");
      out.write("\t\t\t\ttriggerTime:150, //鼠标延迟触发时间（默认150）\r\n");
      out.write("\t\t\t\tdefaultPlay:true,//默认是否执行效果（默认true）\r\n");
      out.write("\t\t\t\treturnDefault:true //鼠标从.sideMen移走后返回默认状态（默认false）\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t</script> \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</div>\r\n");
      out.write("<!-- end1 -->\r\n");
      out.write(" \r\n");
      out.write("</body>\r\n");
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
    // /WEB-INF/pages/back/staff/../base.jsp(3,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("sc");
    // /WEB-INF/pages/back/staff/../base.jsp(3,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/back/staff/../base.jsp(3,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
