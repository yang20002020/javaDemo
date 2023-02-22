package it_18;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
通过反射实现如下操作：
Student s=new Student(“林青霞”,30,"西安");
System.out.println(s);
 */

public class test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //获取类对象
        Class<?> c = Class.forName("it_18.Student");

        // private Student(String name) {this.name = name;}

       // Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes) 返回一个 Constructor对象，该对象反映由此 Class对象表示的类或接口的指定构造函数。
        Constructor<?> con = c.getDeclaredConstructor(String.class);
        //暴力反射
        //public void setAccessible(boolean flag) ; 值为true表示反射对象应该在使用Java语言访问控制时抑制检查。
        con.setAccessible(true);
        //不能通过私有的构造函数不能直接构造新的对象
        Object obj = con.newInstance("林青霞");
        System.out.println("obj:"+obj);

    }
}
