package Encode;

import com.alibaba.fastjson.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SignSort  {

    public static String parseMapToString(Map<String,String> params, boolean encode) {
        TreeMap<String, String> apiparamsMap = new TreeMap();
        for (String key : params.keySet()) {
            apiparamsMap.put(key, (String) params.get(key));
        }
        StringBuilder param = new StringBuilder();
        for (Map.Entry<String, String> e : apiparamsMap.entrySet()) {
            try {
                StringBuilder append = param.append("&").append((String) e.getKey()).append("=");
                String encode2 = e.getValue() == null ? "" : encode ? URLEncoder.encode((String) e.getValue(), "UTF-8") : (String) e.getValue();
                append.append(encode2);
            } catch (UnsupportedEncodingException e1) {
                e1.printStackTrace();
            }
        }
        return param.toString().substring(1);
    }

    public static void main(String[] args) {
        Map params = new HashMap();
        params.put("device","1");
        params.put("password","123");
        params.put("adchal","99999");
        params.put("msi","123");
        params.put("time","123123");
        params.put("androidID","5d849908c7934a0e");
        params.put("ver_code","15005");
        params.put("uuid","123123");
        params.put("mac","123");
        params.put("appid","100000020");
        params.put("net","wifi");
        params.put("sv","6.0");
        params.put("platform","1");
        params.put("api_version","1.2.0");
        params.put("username","123123123");
        params.put("imei","12345678");
        params.put("ip","");
        params.put("ver_name","1.5.0");
        params.put("br","1");
        params.put("channel","100000");

        String a = parseMapToString(params,true);
        System.out.println(params.toString());
        System.out.println(a);
        JSONObject jsonObject = new JSONObject();
    }
}
