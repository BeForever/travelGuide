/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-12-21 09:20:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class map_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no, width=device-width\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://cache.amap.com/lbs/static/main1119.css\"/>\n");
      out.write("    <script src=\"http://cache.amap.com/lbs/static/es5.min.js\"></script>\n");
      out.write("    <script src=\"http://webapi.amap.com/maps?v=1.3&key=a7de736c21c683a64d24a247879d9ca7\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"http://cache.amap.com/lbs/static/addToolbar.js\"></script>\n");
      out.write("\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        #container {\n");
      out.write("            width: 25%;\n");
      out.write("            height: 25%;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"container\" style=\"margin-left: 85px;margin-top: 200px\"></div>\n");
      out.write("<script>\n");
      out.write("    //创建地图,设定地图的中心点和级别\n");
      out.write("    var map = new AMap.Map('container', {\n");
      out.write("        resizeEnable: true,\n");
      out.write("        zoom:14,\n");
      out.write("        center: [125.2747, 43.820999]\n");
      out.write("\n");
      out.write("    });\n");
      out.write("    //TODO  创建控件并添加\n");
      out.write("    //信息窗体的创建与设定\n");
      out.write("    var infowindow = new AMap.InfoWindow({\n");
      out.write("        offset: new AMap.Pixel(0, -30),\n");
      out.write("        size:new AMap.Size(230,0)\n");
      out.write("    });\n");
      out.write("    //点标记的创建与添加\n");
      out.write("    var marker = new AMap.Marker({\n");
      out.write("        position: [120.2, 30.3],\n");
      out.write("        map:map\n");
      out.write("    });\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
}
