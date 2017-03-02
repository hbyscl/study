package org.cheng.study.restarttomcat;

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

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        File directory = new File("");//设定为当前文件夹
        String binPath = directory.getAbsolutePath();
        String name = ManagementFactory.getRuntimeMXBean().getName();
        String pid = name.split("@")[0];
        RestartUtil.restart(binPath,pid);
        PrintWriter out = resp.getWriter();
        out.println("you are welcome " );
        out.flush();
        out.close();
    }


}
