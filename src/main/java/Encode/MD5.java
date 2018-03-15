package Encode;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

    public static String getMd5(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes("UTF-8"));
            byte[] hash = md.digest();
            String s;
            for (byte b : hash) {
                s = Integer.toHexString(0xff & b);
                if (s.length() == 1) {
                    sb.append("0");
                }
                sb.append(s);
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return sb.toString();
//        try {
//            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
//            messageDigest.update(str.getBytes());
//            String ret = new BigInteger(1,messageDigest.digest()).toString(16);
//            KsLog.d("md5 is " + ret);
//            return new BigInteger(1,messageDigest.digest()).toString(16);
//        } catch (Exception  e) {
//            e.printStackTrace();
//            return null;
//        }




    }

    public static void main(String[] args) {
        String md5 = "device=1&password=1234561&adchal=99999&msi=123&time=1520938092&androidID=5d849908c7934a0e&ver_code=15005&uuid=b6cfe71dc9383cd28846e1521&mac=123&appid=100000020&net=wifi&sv=6.0&platform=1&api_version=1.2.0&username=testmaster0001&imei=12345678&ip=&ver_name=1.5.0&br=1&channel=100000&4a6a42408c74276b78c61f9141ba3b49";
        String md3 = "device=1&password=1234561&adchal=99999&msi=123&time=1520938092&androidID=5d849908c7934a0e&ver_code=15005&uuid=b6cfe71dc9383cd28846e1521&mac=123&appid=100000020&net=wifi&sv=6.0&platform=1&api_version=1.2.0&username=testmaster0001&imei=12345678&ip=&ver_name=1.5.0&br=1&channel=100000&4a6a42408c74276b78c61f9141ba3b49";
        String time = System.currentTimeMillis()+"";
        System.out.println(getMd5(md5));
        System.out.println(getMd5(md3));
        ;
        time = time.substring(0,time.length()-3);


    }
}
