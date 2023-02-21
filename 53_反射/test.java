package it_17;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/*
反射获取构造方法并使用
反射的思路：通过构造方法来创建对象
 */
public class test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取类对象
        Class<?> c = Class.forName("it_17.Student");

        //  Constructor<?>[] getConstructor() 返回一个包含 Constructor对象的数组， Constructor对象反映了由该 Class对象表示的类的所有公共构造函数。
        Constructor<?>[] cons = c.getConstructors();

        for (Constructor con : cons) {
            System.out.println(con);
        }
        //终端输出如下两行,只能输出公共构造函数，而私有的和默认的构造函数并没有获取到
        //public it_17.Student(java.lang.String,int,java.lang.String)
        //public it_17.Student()
        System.out.println("*****************************");
        //Constructor<?>[] getDeclaredConstructors() 返回反映由该 Class对象表示的类声明的所有构造函数的 Constructor对象的数组。
        Constructor<?>[] conss = c.getDeclaredConstructors();
        //输出所有的构造函数
        for (Constructor con : conss) {
            System.out.println(con);
        }
        System.out.println("******************");
        //获取一个构造方法的对象
       // Constructor<T> getConstructor(Class<?>... parameterTypes) 返回一个 Constructor对象，该对象反映由该 Class对象表示的类的指定公共构造函数。
        Constructor<?> con = c.getConstructor();
        //反射的思路：通过构造方法的对象中的函数newInstance来创建对象
        Object obj = con.newInstance();
        System.out.println(obj);

    }
}
