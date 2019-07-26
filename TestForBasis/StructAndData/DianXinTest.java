package StructAndData;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
/**
 * creates by yyf on 2019-07-17 16:46
 */
public class DianXinTest {
    public static String getURLContent(String urlStr) {
        /** 网络的url地址 */
        URL url = null;
        /**//** 输入流 */
        BufferedReader in = null;
        StringBuffer sb = new StringBuffer();
        try {
            url = new URL(urlStr);
            /** http连接 */
            HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
            //设置连接主机超时（单位：毫秒）
            httpConn.setConnectTimeout(10000);
            //设置从主机读取数据超时（单位：毫秒）
            httpConn.setReadTimeout(10000);
//			httpConn.setRequestMethod("POST");
//			httpConn.setDoOutput(true);
//			httpConn.setRequestProperty("User-Agent","directclient");
            httpConn.setRequestProperty("User-agent","Mozilla/4.0");
            //System.out.println(httpConn.getContentLength());
            if(httpConn.getContentLength() < 2097152){
                in=new BufferedReader(new InputStreamReader(httpConn.getInputStream()));
                String str = null;
                while ((str = in.readLine()) != null) {
                    sb.append(str);
                }
            }
            //in = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
            //in = new BufferedReader(new InputStreamReader(url.openStream(),"utf-8")); //gb2312 GB2312
        } catch (Exception ex) {

        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
            }
        }
        //System.out.println(result);
        return sb.toString();
    }

    public static void main(String[] args) {
        getURLContent("https://Movie.douban.com/");
    }
}
