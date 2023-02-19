package it_13;

import java.util.*;
/*
stream<T> filter(predicate predicate):用于对流中的数据进行过滤
predicate 接口中的方法 boolean test(T t) :对给定的参数进行判断，返回一个Boolean值
 */

public class test {
    public static <stream> void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");
        list.stream().filter((String s) -> {
            return s.startsWith("张");
        }).forEach(System.out::println);
        System.out.println("***************");
        list.stream().filter(s -> s.startsWith("张")).forEach(System.out::println);
        System.out.println("***************");
        list.stream().filter(s -> s.length() == 3).forEach(System.out::println);
        System.out.println("***************");
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);

    }
}
