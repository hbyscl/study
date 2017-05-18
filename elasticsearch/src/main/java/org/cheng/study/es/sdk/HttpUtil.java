package org.cheng.study.es.sdk;

import org.apache.commons.lang.StringUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * User: ChengLi
 * Date: 12-9-13
 * Time: 上午10:20
 * HTTP请求
 */
public class HttpUtil {
    /**
     * @param urlString  请求地址
     * @param method     POST OR GET
     * @param parameters 参数
     * @param body
     * @return
     * @throws java.io.IOException
     */
    public static String send(String urlString, String method,
                              Map<String, String> parameters, String body)
            throws IOException {
        HttpURLConnection urlConnection = null;

        String encode = parameters.get("encode");
        encode = StringUtils.isNotEmpty(encode) ? encode : "utf-8";

        StringBuffer param = new StringBuffer();
        int i = 0;
        for (String key : parameters.keySet()) {
            if (i == 0)
                param.append("?");
            else
                param.append("&");
            param.append(key).append("=").append(URLEncoder.encode(parameters.get(key), encode));
            i++;
        }
        urlString += param;

        String timeout = parameters.get("timeout");
        URL url = new URL(urlString);
        urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod(method);
        urlConnection.setDoOutput(true);
        urlConnection.setDoInput(true);
        urlConnection.setUseCaches(false);
        urlConnection.setReadTimeout(null == timeout ? 10000 : Integer.valueOf(timeout));

        if (method.equalsIgnoreCase("POST") && body != null) {
            urlConnection.getOutputStream().write(body.getBytes(encode));
            urlConnection.getOutputStream().flush();
            urlConnection.getOutputStream().close();
        }

        InputStream in = urlConnection.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int l = 0;
        while ((l = in.read(buffer)) > 0) {
            baos.write(buffer, 0, l);
        }
        baos.flush();
        in.close();
        baos.close();
        return new String(baos.toByteArray(), encode);
    }

    public static void main(String[] args) throws IOException {
        Map<String, String> params = new HashMap<String, String>();
        params.put("q", "SELECT");
        params.put("from", "0");
        params.put("size", "1");
        String url = "http://localhost:9200/log-soter/_search";
        String post = send(url, "GET", params, null);
        System.out.println("post = " + post);
    }
}