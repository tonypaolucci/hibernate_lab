/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.11
 * Generated at: 2017-03-09 00:57:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.NumberFormat;
import java.io.*;
import java.util.*;

public final class signups_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("jar:file:/D:/Godfather00/Documents/eclipse_workspace/hibernateLab/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/wellness/WEB-INF/lib/spring-webmvc-4.1.5.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1424422076000L));
    _jspx_dependants.put("jar:file:/D:/Godfather00/Documents/eclipse_workspace/hibernateLab/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/wellness/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153403082000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.1.5.RELEASE.jar", Long.valueOf(1485302093886L));
    _jspx_dependants.put("jar:file:/D:/Godfather00/Documents/eclipse_workspace/hibernateLab/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/wellness/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153403082000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1485302096561L));
    _jspx_dependants.put("jar:file:/D:/Godfather00/Documents/eclipse_workspace/hibernateLab/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/wellness/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153403082000L));
    _jspx_dependants.put("jar:file:/D:/Godfather00/Documents/eclipse_workspace/hibernateLab/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/wellness/WEB-INF/lib/spring-webmvc-4.1.5.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1424422076000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.text.NumberFormat");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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
java.text.DateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css\">\r\n");
      out.write("    \r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("\t<header>\t\t\r\n");
      out.write("\t\t<div class=\"navigation\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\".navbar-collapse.collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t</button>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"navbar-collapse collapse\">\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-tabs\" role=\"tablist\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li ><a href=\"index\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"about\">About Us</a></li>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"contact\">Contact Us</a></li>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"active\"><a href=\"signups\">Sign up</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"login\">login</a></li>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</header>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"col-lg-8 col-lg-offset-3\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t<h1 style=\"color: #008000\">Wellness Registration </h1>\r\n");
      out.write("\t\t\t    ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t     \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<form id=\"signupForm\" method=\"post\"  action=\"signupMember\">\r\n");
      out.write("                    \r\n");
      out.write("      <div class=\"contact-form\">\r\n");
      out.write("              <div class=\"container\">\r\n");
      out.write("                                  \r\n");
      out.write("                     <div class=\"col-md-4\" >\r\n");
      out.write("                           <div class=\"form-group\">\r\n");
      out.write("                              <label for=\"ln\" id='eln' >Last Name*</label>\r\n");
      out.write("                              <input type=text id=\"lname\" name=\"lname\" class=\"form-control input-sm\" placeholder=\"Last Name\" > \r\n");
      out.write("                           </div>\r\n");
      out.write("                           \r\n");
      out.write("                     </div>\r\n");
      out.write("                     <div class=\"col-md-4\">\r\n");
      out.write("                           <div class=\"form-group\">\r\n");
      out.write("                              <label for=\"fn\" id='efn' >First Name*</label>\r\n");
      out.write("                              <input type=text id=\"fname\" name=\"fname\" class=\"form-control input-sm\" placeholder=\"First Name\" > \r\n");
      out.write("                           </div>\r\n");
      out.write("                           \r\n");
      out.write("                     </div>\r\n");
      out.write("                     \r\n");
      out.write("                     <div class=\"col-md-4\">\r\n");
      out.write("                           <div class=\"form-group\">\r\n");
      out.write("                              <label for=\"ad\" id='ead'>Address*</label>\r\n");
      out.write("                              <input type=text id=\"address\" name=\"address\" class=\"form-control input-sm\" placeholder=\"Address\" > \r\n");
      out.write("                           </div>\r\n");
      out.write("                           \r\n");
      out.write("                     </div>\r\n");
      out.write("                     \r\n");
      out.write("                     <div class=\"col-md-2\">\r\n");
      out.write("                           <div class=\"form-group\">\r\n");
      out.write("                              <label for=\"tl\" id='etl'> City</label>\r\n");
      out.write("                              <input type=text id=\"city\" name=\"city\" class=\"form-control input-sm\" placeholder=\"Job Title\" > \r\n");
      out.write("                           </div>\r\n");
      out.write("                           <div id='etl'>\r\n");
      out.write("                           \r\n");
      out.write("                           </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                     \r\n");
      out.write("                     <div class=\"col-md-2\">\r\n");
      out.write("                           <div class=\"form-group\">\r\n");
      out.write("                              <label for=\"tl\" id='etl'> State</label>\r\n");
      out.write("                              <input type=text id=\"state\" name=\"state\" class=\"form-control input-sm\" placeholder=\"Job Title\" > \r\n");
      out.write("                           </div>\r\n");
      out.write("                           <div id='etl'>\r\n");
      out.write("                           \r\n");
      out.write("                           </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                     \r\n");
      out.write("                     <div class=\"col-md-2\">\r\n");
      out.write("                           <div class=\"form-group\">\r\n");
      out.write("                              <label for=\"tl\" id='etl'> Zip</label>\r\n");
      out.write("                              <input type=text id=\"zip\" name=\"zip\" class=\"form-control input-sm\" placeholder=\"Job Title\" > \r\n");
      out.write("                           </div>\r\n");
      out.write("                           <div id='etl'>\r\n");
      out.write("                           \r\n");
      out.write("                           </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("    \r\n");
      out.write("                     \r\n");
      out.write("                     <div class=\"col-md-2\">\r\n");
      out.write("                           <div class=\"form-group\">\r\n");
      out.write("                              <label for=\"tel\" id='etel'>Telephone*</label>\r\n");
      out.write("                              <input type=text id=\"tel\" name=\"tel\" class=\"form-control input-sm\" placeholder=\"Telephone\" > \r\n");
      out.write("                           </div>\r\n");
      out.write("                           \r\n");
      out.write("                     </div>\r\n");
      out.write("                     \r\n");
      out.write("                     <div class=\"col-md-4\">\r\n");
      out.write("                           <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"emailAddressInput\" >Email*</label>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    <input type=\"hidden\" name=\"roles\" value=\"user\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"emailAddress\" id=\"emailAddressInput\" placeholder=\"Email Address\" />\r\n");
      out.write("\t\t\t\t\t\t\t    </div>                           \r\n");
      out.write("                     </div>\r\n");
      out.write("                     \r\n");
      out.write("                     <div class=\"col-md-2\">\r\n");
      out.write("                           <div class=\"form-group\">\r\n");
      out.write("                              <label for=\"ag\" id='eag' >Age*</label>\r\n");
      out.write("                              <input type='number' id=\"age\" name=\"age\" class=\"form-control input-sm\" placeholder=\"Age\"  min=\"21\"> \r\n");
      out.write("                           </div>\r\n");
      out.write("                           \r\n");
      out.write("                     </div>\r\n");
      out.write("                     \r\n");
      out.write("                     \r\n");
      out.write("                     \r\n");
      out.write("                     <div class=\"col-md-4\">\r\n");
      out.write("                           <div class=\"form-group\">\r\n");
      out.write("                           <label for=\"subscription\" id='subscription'>Subscription Type</label>\r\n");
      out.write("                              <select name=\"subscription\" id=\"subscription\" class=\"form-control input-sm\">\r\n");
      out.write("                                                  <option value=\"Life Time Membership\">Life Time Membership $400</option>\r\n");
      out.write("                                                  <option value=\"Anual Subscription\" >Annual Subscription $100</option>  \r\n");
      out.write("                                                  <option value=\"Monthly Subscription\" >Monthly Subscription $35</option>\r\n");
      out.write("                                                  <option value=\"Free Trial\" selected>2 week Free trial</option>                                           \r\n");
      out.write("                                                 </select>                       \r\n");
      out.write("                           </div>                           \r\n");
      out.write("                     </div>\r\n");
      out.write("                     \r\n");
      out.write("                    <!--  <div class=\"col-md-2\">\r\n");
      out.write("                           <div class=\"form-group\">\r\n");
      out.write("                              <label for=\"cd\" id='eag' >Credit Card</label>                               \r\n");
      out.write("                              <input type='number' id=\"card\" name=\"card\" class=\"form-control input-sm\" placeholder=\"Credit/debit card\"   min=\"900000\" > \r\n");
      out.write("                           </div>                           \r\n");
      out.write("                     </div> -->\r\n");
      out.write("                     \r\n");
      out.write("                    \r\n");
      out.write("                     \r\n");
      out.write("                     <div class=\"col-md-3\">\r\n");
      out.write("                           <div class=\"form-group\">\r\n");
      out.write("                              <label for=\"ag\" id='eag' >Password*</label>                               \r\n");
      out.write("                              <input type=\"password\" class=\"form-control\" name=\"password\" id=\"password\" placeholder=\"Password\" />\r\n");
      out.write("                           </div>                           \r\n");
      out.write("                     </div>\r\n");
      out.write("                     \r\n");
      out.write("                     <div class=\"col-md-3\">\r\n");
      out.write("                           <div class=\"form-group\">\r\n");
      out.write("                              <label for=\"ag\" id='eag' >Reenter password*</label>                               \r\n");
      out.write("                              <input type=\"password\" class=\"form-control\" name=\"passwordConfirm\" id=\"passwordConfirm\" placeholder=\"Re-enter password\" />\r\n");
      out.write("                           </div>                           \r\n");
      out.write("                     </div>\r\n");
      out.write("                     \r\n");
      out.write("                     \r\n");
      out.write("                     \r\n");
      out.write("                     <div class=\"col-md-12\" >\r\n");
      out.write("\t\t                           <div class=\"form-group\">\r\n");
      out.write("\t\t                           \r\n");
      out.write("\t\t\t\t\t                   <button type=\"submit\" name=\"submit\" id=\"submit\" class=\"btn btn-primary\" >Submit</button>\r\n");
      out.write("\t\t\t\t\t                   <a href=\"index\" class=\"btn btn-primary\" role=\"button\">Cancel</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t \t\t\t\t\r\n");
      out.write("\t\t\t\t\t                \r\n");
      out.write("\t\t\t\t\t\t               \r\n");
      out.write("\t\t                              </div>\r\n");
      out.write("                                  </div> \r\n");
      out.write("                                  \r\n");
      out.write("                                  \r\n");
      out.write("                                  \r\n");
      out.write("              </div>\r\n");
      out.write("       </div>         \r\n");
      out.write("           \r\n");
      out.write("        </form>\r\n");
      out.write("   \r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\t$('#dateOfBirthInput').datepicker();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\tvar yesButton = $(\"#yesbutton\");\r\n");
      out.write("\t\t\tvar progress = $(\"#doitprogress\");\r\n");
      out.write("\r\n");
      out.write("\t\t\tyesButton.click(function() {\r\n");
      out.write("\t\t\t\tyesButton.button(\"loading\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar counter = 0;\r\n");
      out.write("\t\t\t\tvar countDown = function() {\r\n");
      out.write("\t\t\t\t\tcounter++;\r\n");
      out.write("\t\t\t\t\tif (counter == 11) {\r\n");
      out.write("\t\t\t\t\t\tyesButton.button(\"complete\");\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\tprogress.width(counter * 10 + \"%\");\r\n");
      out.write("\t\t\t\t\t\tsetTimeout(countDown, 100);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tsetTimeout(countDown, 100);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("  </body>\r\n");
      out.write("   <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write(" \t <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/signups.jsp(59,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty error}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t    \r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t<h2>\t\t\t\t\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return true;
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t</h2>\t\r\n");
          out.write("\t\t\t\t<h2 style=\"color: #FF0000\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(" </h2>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      if (!_jspx_th_c_005fif_005f0_reused) {
        _jspx_th_c_005fif_005f0.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_c_005fif_005f0);
      }
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
      // /WEB-INF/views/signups.jsp(61,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty message}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t<h2 style=\"color: #008000\">Try a two week Free trial now!</h2>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      if (!_jspx_th_c_005fif_005f1_reused) {
        _jspx_th_c_005fif_005f1.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_c_005fif_005f1);
      }
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
      // /WEB-INF/views/signups.jsp(66,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty message}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<h1 style=\"color: #008000\">Wellness Registration Success</h1>\r\n");
          out.write("\t\t\t\t<div class=\"text-success\">\r\n");
          out.write("\t\t\t\t<h2 style=\"color: #008000\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(" <a href=\"login\">Login</a></h2>\r\n");
          out.write("\t\t\t\t</div>\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      if (!_jspx_th_c_005fif_005f2_reused) {
        _jspx_th_c_005fif_005f2.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_c_005fif_005f2);
      }
    }
    return false;
  }
}
