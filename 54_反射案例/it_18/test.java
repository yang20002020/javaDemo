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

        //public Student(String name, int age, String address)
        //Constructor<T> getConstructor(Class<?>... parameterTypes) 返回一个 Constructor对象，该对象反映由该 Class对象表示的类的指定公共构造函数。
        Constructor<?> con = c.getConstructor(String.class, int.class, String.class);//基本数据类型也可以通过.class得到对应的class类型


        Object obj = con.newInstance("林青霞", 30, "西安");
        System.out.println("obj:"+obj);

    }
}
