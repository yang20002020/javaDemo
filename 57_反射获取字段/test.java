package it_18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
通过反射实现如下操作：
Student =new Student();
s.name="林青霞";
s.age=30;
s.address="西安";
System.out.println(s);
 */
public class test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //获取类对象
        Class<?> c = Class.forName("it_18.Student");

        System.out.println("***************");
        //Student s=new Student()
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        System.out.println(obj); //终端输出 Student{name='null'，age=0,address='null'}
        //s.name="林青霞";  private String name;
       /*
          报错  原因私有字段
         Field nameFiled = c.getField("name");
        */
        Field nameFiled =c.getDeclaredField("name");
        nameFiled.setAccessible(true);//如果不设置为true，会报错，原因 私有字段name
        nameFiled.set(obj, "林青霞");
        System.out.println(obj);

        //s.age=30;
        Field ageFiled =c.getDeclaredField("age");
        ageFiled.setAccessible(true);
        ageFiled.set(obj, 30);
        System.out.println(obj);
        //s.address="西安"
        Field addressFiled =c.getDeclaredField("address");
        addressFiled.setAccessible(true);
        addressFiled.set(obj, "西安");
        System.out.println(obj);




    }
}