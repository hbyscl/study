package com.vteam.study.commonstext;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author li.cheng
 * @version 1.0.0 2017年04月14日
 * @since soter 1.0.0
 */
public class Password {
    public static void main(String[] args) {
        String md5key = DigestUtils.md5Hex("H1uOweF");
        String key = "";

        if(md5key.length() < 8){
            key = (md5key+"00000000").substring(0,8);
        }
        else{
            key = md5key.substring(0,8);
        }

        System.out.println();

    }
}
