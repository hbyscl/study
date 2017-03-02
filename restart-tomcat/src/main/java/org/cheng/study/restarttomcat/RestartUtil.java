package org.cheng.study.restarttomcat;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @author li.cheng
 * @version 1.0.0 2017年03月02日
 * @since soter 1.0.0
 */
public class RestartUtil {
    public static void restart(String tomcatBinDir,String pid){
        try {
            String os = System.getProperty("os.name");
            String osName = os.toLowerCase();
            if(osName.startsWith("win")){
                windows(tomcatBinDir,pid);
            }
            else{
                linux(tomcatBinDir,pid);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void windows(String tomcatBinDir,String pid) throws Exception{
        File restart = new File(tomcatBinDir + "\\restart.bat");
        String bats = "call taskkill /F /PID " +pid+" && call ping -n 5 127.0.0.1>nul && "+
                "call " + tomcatBinDir + "\\catalina.bat start";
        FileOutputStream stream = new FileOutputStream(restart);
        stream.write(bats.getBytes());
        stream.flush();
        stream.close();

        File restartVbs = new File(tomcatBinDir+"\\restart.vbs");
        String vbs = "Set ws = CreateObject(\"Wscript.Shell\") \n" +
                "ws.run \"cmd /c restart.bat\",0";
        stream = new FileOutputStream(restartVbs);
        stream.write(vbs.getBytes());
        stream.flush();
        stream.close();

        Runtime.getRuntime().exec("cmd /c start "+tomcatBinDir + "\\restart.vbs");

    }
    private static void linux(String tomcatBinDir,String pid) throws Exception{
        String command = "cd " + tomcatBinDir + " && kill -9 " + pid + " & sh catalina.sh start";
        System.out.println("command = " + command);
        Runtime.getRuntime().exec(command);
    }
}
