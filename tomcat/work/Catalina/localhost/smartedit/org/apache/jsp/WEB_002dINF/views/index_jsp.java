/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.85
 * Generated at: 2023-04-21 08:08:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <title></title>\n");
      out.write("        <meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1\" />\n");
      out.write("        <link\n");
      out.write("            href=\"data:image/x-icon;base64,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\"\n");
      out.write("            rel=\"icon\"\n");
      out.write("            type=\"image/x-icon\"\n");
      out.write("        />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"static-resources/dist/smartedit-container-new/main.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <script src=\"static-resources/userTracking/trackingUserActions.js\"></script>\n");
      out.write("    <script src=\"static-resources/thirdparties/piwik/piwik.js\"></script>\n");
      out.write("    <script src=\"static-resources/thirdparties/ckeditor/ckeditor.js\"></script>\n");
      out.write("    <script src=\"static-resources/dist/smartedit-container-new/vendors.js\"></script>\n");
      out.write("    <script src=\"static-resources/dist/smartedit-container-new/smarteditcontainer.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
