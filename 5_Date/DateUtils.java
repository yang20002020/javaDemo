package itheima;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
工具类：
构造函数私有；
成员函数静态
 */
public class DateUtils {
    private DateUtils(){};
    public static String dateToString(Date date,String format){
        SimpleDateFormat sd=new SimpleDateFormat(format);
        String s=sd.format(date);
        return s;
    };
    public static Date stringToDate(String s,String format) throws ParseException {
        SimpleDateFormat sd1=new SimpleDateFormat(format);
        Date d=sd1.parse(s);
        return d;
    }

}
