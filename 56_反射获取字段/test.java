package it_18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
反射获取成员变量 并使用
 */
public class test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //获取类对象
        Class<?> c = Class.forName("it_18.Student");

        //Field[] getFields() 返回一个包含 Field对象的数组， Field对象反映由该 Class对象表示的类或接口的所有可访问的公共字段。

        // 包括public，protected，default（package）访问和私有方法，但不包括继承方法。
        //Field getField(String name) 返回一个 Field对象，该对象反映由该 Class对象表示的类或接口的指定公共成员字段。
        Field[] fields = c.getFields();
        for (Field field : fields) {
            System.out.println(field); //终端输出 public java.lang.String it_18.Student.address
        }
        System.out.println("*****************");
        //Field[] getDeclaredFields() 返回一个 Field对象的数组，反映了由该 Class对象表示的类或接口声明的所有字段。
        Field[] fieldss = c.getDeclaredFields();
        for (Field field : fieldss) {
            System.out.println(field);
        }
        System.out.println("***************");
        //只获取一个成本变量
        //Field 提供有关类或接口的单个字段的信息和动态访问
        //Field getField(String name) 返回一个 Field对象，该对象反映由该 Class对象表示的类或接口的指定公共成员字段。
        Field addressField = c.getField("address");
             /*
             Student s=new Student();
             s.address="西安";
             System.out.println(s);
              */
        //获取无参构造方法创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
       // void set(Object obj, Object value) 将指定的对象参数中由此 Field对象表示的字段设置为指定的新值。
        addressField.set(obj,"西安");//给obj的成员变量addressField赋值为西安
        System.out.println(obj);
    }
}