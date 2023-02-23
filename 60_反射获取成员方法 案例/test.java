package it_18;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
反射获取成员方法并使用
Student s=new Student();
s.method();
s.method1();
s.method2("林青霞");
String ss=s.method3("林青霞，30");
System.out.println(ss);
s.function();
 */
public class test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //获取类对象
        Class<?> c = Class.forName("it_18.Student");

        //Student s=new Student();
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        //s.method1();
        Method m1 = c.getMethod("method1");
        m1.invoke(obj); //打印输出method1
        System.out.println("*****************");
        //s.method2("林青霞");
        Method m2 = c.getMethod("method2", String.class);
        m2.invoke(obj, "林青霞");//打印输出method2林青霞
        System.out.println("***************************");
        //String ss=s.method3("林青霞"，30);
        // System.out.println(ss);
        Method m3 = c.getMethod("method3", String.class, int.class);
        Object o = m3.invoke(obj, "林青霞", 30);
        System.out.println(o);//终端输出：林青霞,30
        //s.function();
        Method md=c.getDeclaredMethod("function");
        md.setAccessible(true);
        md.invoke(obj); //终端输出:私有成员函数 function


    }
}