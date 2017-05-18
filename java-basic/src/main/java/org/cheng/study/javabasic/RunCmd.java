package org.cheng.study.javabasic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author li.cheng
 * @version 1.0.0 2017年02月27日
 * @since soter 1.0.0
 */
public class RunCmd {
    public static void main(String[] args) throws Exception {
//        File f = new File("D:/abc.tt1");
//        OutputStream outputStream = new FileOutputStream(f);
//        outputStream.write("asdf".getBytes());
//        outputStream.flush();
//        outputStream.close();
//        Runtime.getRuntime().exec("D:\\apache-tomcat-7.0.68\\bin\\restart.bat");
        String a = "asdf.asdf.as.df.sad.fa.sdf.df12";
        String substring = a.substring(a.lastIndexOf(".")+1);
        System.out.println("substring = " + substring);
    }
}
