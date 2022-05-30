package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class active_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Active</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"vh-100\" style=\"background-color: #508bfc;\">\n");
      out.write("            <div class=\"container py-5 h-100\">\n");
      out.write("                <div class=\"row d-flex justify-content-center align-items-center h-100\">\n");
      out.write("                    <div class=\"col-12 col-md-8 col-lg-6 col-xl-5\">\n");
      out.write("                        <div class=\"card shadow-2-strong\" style=\"border-radius: 1rem;\">\n");
      out.write("                            <div class=\"card-body p-5 text-center\">\n");
      out.write("\n");
      out.write("                                <h3 class=\"mb-5\">Active</h3>\n");
      out.write("                                <form method=\"post\" action=\"active\">\n");
      out.write("\n");
      out.write("                                    <div class=\"form-outline mb-4\">\n");
      out.write("                                        <label class=\"form-label\" for=\"typeEmailX-2\">Email</label>\n");
      out.write("                                        <input type=\"email\" id=\"typeEmailX-2\" class=\"form-control form-control-lg\" name=\"email\" id=\"user\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-outline mb-4\">\n");
      out.write("                                        <label class=\"form-label\" for=\"typePasswordX-2\">OTP</label>\n");
      out.write("                                        <input type=\"text\" id=\"typePasswordX-2\" class=\"form-control form-control-lg\" id=\"pass\" name=\"otp\"/>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <hr class=\"my-4\">\n");
      out.write("                                    <button class=\"btn btn-primary btn-lg btn-block\" class=\"login\" type=\"submit\">Active</button>\n");
      out.write("                                </form>\n");
      out.write("                                <nav style=\"display: flex;width: 250px;padding-top: 20px;margin-left: 26%;\"></nav>\n");
      out.write("                                </form>\n");
      out.write("                                <a class=\"reg\" href=\"login\"><button class=\"btn btn-primary btn-lg btn-block\">Sign in</button></a>\n");
      out.write("                                <nav style=\"display: flex;width: 400px;padding-top: 20px;margin-left: 10%;\">\n");
      out.write("                                    <a href=\"forgot\">Forgot password</a>\n");
      out.write("                                    <a href=\"change\" style=\"margin-left: 70px;\">change password</a></nav>\n");
      out.write("                                <p style=\"color:red ;margin-top: 30px;margin-left: 15px;\" id=\"h\"></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
