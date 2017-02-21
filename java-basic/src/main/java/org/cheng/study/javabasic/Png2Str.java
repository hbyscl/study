package org.cheng.study.javabasic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

/**
 * @author li.cheng
 * @version 1.0.0 2017年02月21日
 * @since soter 1.0.0
 */
public class Png2Str {

    public static String getStr(String filePath){
        try {
            byte[] bytes = Files.readAllBytes(Paths.get(filePath));
            return Base64.getEncoder().encodeToString(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void write2File(String base64,String filePath){
        try {
            Files.write(Paths.get(filePath),Base64.getDecoder().decode(base64));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String inFile = "C:\\Users\\Administrator\\Downloads\\calendar_date_16px_1135068_easyicon.net.png";
        String base64 = getStr(inFile);
        System.out.println("getStr(inFile) = " + base64);
        write2File(base64,"C:\\Users\\Administrator\\Desktop\\icons\\date.png");
    }
}
