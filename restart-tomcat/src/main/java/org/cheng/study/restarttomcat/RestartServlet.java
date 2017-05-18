package org.cheng.study.restarttomcat;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.lang.management.ManagementFactory;

/**
 * @author li.cheng
 * @version 1.0.0 2017年02月27日
 * @since soter 1.0.0
 */
public class RestartServlet extends HttpServlet {

    private ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String realPath = config.getServletContext().getRealPath("/");
        String binDir = realPath.substring(0, realPath.indexOf("webapps"))+"bin";
        String name = ManagementFactory.getRuntimeMXBean().getName();
        String pid = name.split("@")[0];
        RestartUtil.restart(binDir,pid);
        PrintWriter out = resp.getWriter();
        out.println("you are welcome " );
        out.flush();
        out.close();
    }


}
