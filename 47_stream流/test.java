package it_14;

import java.util.ArrayList;

/*
Stream 流的常见终结操作方法
（1）void forEach(Consumer action):
对流的每一个元素执行操作
Consumer 接口 中的方法：void accept(T t):对给定的参数执行此操作
（2）long count():
返回此流中的元素数

 */
public class test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        //需求1：把集合中的元素在控制台输出
        list.stream().forEach(System.out::println);
        //需求2：统计集合中有几个以张开头的元素，并把统计结果在控制台输出
        long count = list.stream().filter(s -> s.startsWith("张")).count();
        System.out.println(count);
    }
}
