package biz.ezcom.maven.tomcat.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VersionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = "Servlet Version";
        int majorVersion = this.getServletContext().getMajorVersion();
        int minorVersion = this.getServletContext().getMinorVersion();
        resp.getWriter().print(name + " : " + majorVersion + "." + minorVersion);
    }
}
