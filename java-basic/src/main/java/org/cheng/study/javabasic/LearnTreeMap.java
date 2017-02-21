package org.cheng.study.javabasic;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.TreeMap;

/**
 * @author li.cheng
 * @version 1.0.0 2017年01月09日
 * @since soter 1.0.0
 */
public class LearnTreeMap {
    public static void main(String[] args) throws Exception {

        Path path = Paths.get("E:\\opt\\lucene\\data\\aaaa.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("basicFileAttributes.fileKey() = " + basicFileAttributes.fileKey());
    }
}
