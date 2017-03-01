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

        File restart = new File(binPath + "\\restart.bat");
        String name = ManagementFactory.getRuntimeMXBean().getName();
        String pid = name.split("@")[0];
        String bats = "call taskkill /F /PID " +pid+" && call ping -n 5 127.0.0.1>nul && "+
                "call " + binPath + "\\catalina.bat start";
        FileOutputStream stream = new FileOutputStream(restart);
        stream.write(bats.getBytes());
        stream.flush();
        stream.close();

        File restartVbs = new File(binPath+"\\restart.vbs");
        String vbs = "Set ws = CreateObject(\"Wscript.Shell\") \n" +
                "ws.run \"cmd /c restart.bat\",0";
        stream = new FileOutputStream(restartVbs);
        stream.write(vbs.getBytes());
        stream.flush();
        stream.close();


        Runtime.getRuntime().exec("cmd /c start "+binPath + "\\restart.vbs");
        PrintWriter out = resp.getWriter();
        out.println("you are welcome "+pid );
        out.flush();
        out.close();
    }


}
