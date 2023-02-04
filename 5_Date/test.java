package itheima;

import java.text.ParseException;
import java.util.Date;

public class test {
    public static void main(String[] args) throws ParseException {
        Date d=new Date();
       String s= DateUtils.dateToString(d,"yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s);
       String s1= DateUtils.dateToString(d,"yyyy年MM月dd日");
       System.out.println(s1);
        String s2= DateUtils.dateToString(d,"HH:mm:ss");
        System.out.println(s2);

        String s3="2048-08-08 12:12:12";
         Date dd=DateUtils.stringToDate(s3,"yyyy-MM-dd HH:mm:ss");
         System.out.println(dd);

    }

}
