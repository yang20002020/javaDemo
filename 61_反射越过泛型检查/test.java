package it_19;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
练习：我有一个ArrayList<Interger>集合，现在我想在这个集合中添加一个字符串数组，如何实现？
//反射可以越过泛型检查，获取最原始的方法所需要的类型
 */
public class test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        //创建集合
         ArrayList<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(20);
        System.out.println(array);
        System.out.println("__________________");
        Class<? extends ArrayList> c =array.getClass();
        //反射可以越过泛型检查，获取最原始的方法所需要的类型
        Method m = c.getMethod("add", Object.class);
        m.invoke(array, "hello");
        m.invoke(array, "world");
        m.invoke(array, "java");
        System.out.println(array);
    }
}
