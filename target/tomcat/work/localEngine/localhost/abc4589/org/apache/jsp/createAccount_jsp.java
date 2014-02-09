package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Create New Customer Account</title>\n");
      out.write("<meta name=\"description\" content=\"Default Description\" />\n");
      out.write("<link href=\"css/styles.css\" rel=\"stylesheet\" type=\"text/css\"></link>\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div class=\"pagebody\">\n");
      out.write("\t\t<div class=\"page-title\">\n");
      out.write("\t\t\t<h1>Create an Account</h1>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<form id=\"form-validate\" method=\"post\"\n");
      out.write("\t\t\taction=\"createAccount\" onsubmit=\"return verifyAndSubmit();\">\n");
      out.write("\t\t\t<div style=\"width:90%\">\n");
      out.write("\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t<legend>Personal Information</legend>\n");
      out.write("\t\t\t\t\t<div style=\"width:100%\">\n");
      out.write("\t\t\t\t\t\t<div style=\"width:49%;float:left;\">\n");
      out.write("\t\t\t\t\t\t\t<div style=\"width:45%; \"> <label> First Name <em>*</em> </label></div>\n");
      out.write("\t\t\t\t\t\t\t<div style=\"width:50%\"><input type=\"text\" name=\"fname\" id=\"fname\"/></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div style=\"width:49%; float:left;\">\n");
      out.write("\t\t\t\t\t\t\t<div style=\"width:45%; \"> <label> Last Name <em>*</em> </label></div>\n");
      out.write("\t\t\t\t\t\t\t<div style=\"width:50%\"><input type=\"text\" name=\"lname\" id=\"lname\"/></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div style=\"width:100%\">\n");
      out.write("\t\t\t\t\t\t<div style=\"width:100%;float:left;\">\n");
      out.write("\t\t\t\t\t\t\t<div style=\"width:45%; \"> <label> Email Address <em>*</em> </label></div>\n");
      out.write("\t\t\t\t\t\t\t<div style=\"width:50%\"><input type=\"text\" name=\"email\" id=\"email\"/></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div style=\"width:100% float:left;\">\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" name=\"newsletter\" id=\"newsletter\"></input>\n");
      out.write("\t\t\t\t\t\t<label style=\"width: 100px\">Sign up for newsletter</label><br />\n");
      out.write("\t\t\t\t\t</div>\t\t\t\n");
      out.write("\t\t\t\t</fieldset>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div style=\"width: 90%\">\n");
      out.write("\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t<legend>Login Information</legend>\n");
      out.write("\t\t\t\t\t<div style=\"width:100%\">\n");
      out.write("\t\t\t\t\t\t<div style=\"width:49%;float:left;\">\n");
      out.write("\t\t\t\t\t\t\t<div style=\"width:45%; \"> <label> Password <em>*</em> </label></div>\n");
      out.write("\t\t\t\t\t\t\t<div style=\"width:50%\"><input type=\"password\" name=\"password\" id=\"password\"/></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div style=\"width:49%; float:left;\">\n");
      out.write("\t\t\t\t\t\t\t<div style=\"width:45%; \"> <label> Confirm Password <em>*</em> </label></div>\n");
      out.write("\t\t\t\t\t\t\t<div style=\"width:50%\"><input type=\"password\" name=\"confirmPassword\" id=\"confirmPassword\"/></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</fieldset>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div>&nbsp;</div>\n");
      out.write("\t\t\t<div id=\"errMessage\" style=\"color:red;\"></div>\n");
      out.write("\t\t\t<div id=\"successMessage\" ></div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div style=\"width:100%;text-align:center;\">\n");
      out.write("\t\t\t<input type=\"submit\" value=\"Submit\"></input>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div>&nbsp;</div>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
