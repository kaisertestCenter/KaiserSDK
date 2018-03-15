package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BaseParams {
    public static int randomPlatform(){
       return (int)Math.random()*3+1;
    }
    public static String randomDeviceType(){
        String[] type = {"xiaomi","huawei","apple","meizu"};
        return type[(int)(Math.random()*4)];

    }
    public static String randomChannel(){
        String[] type = {"test0000","test0001","test0002","test0003"};
        return  type[(int)(Math.random()*4)];
    }
    public static String getSystemTime(int day){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        Calendar calendar = Calendar .getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH,-day);
        date = calendar.getTime();
        return sdf.format(date);
    }
    public static String getGender(){
        return ((int)(Math.random()*2+1))+"";
    }
    public static String getOrderid(String uid){
        return "OrderTest"+"1000"+uid;
    }
    public static String getCpOrderid(String uid){
        return "CpTest"+"1000"+uid;
    }
    public static String getMoneyAcount(){
        String[] type = {"6","128","328","648"};
        return type[(int)(Math.random()*4)];
    }
    public static String getDBNameTime (int day){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        Calendar calendar = Calendar .getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH,-day);
        date = calendar.getTime();
        return sdf.format(date);
    }

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
    }

}
