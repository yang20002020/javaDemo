package it_13;

import java.util.*;
/*
stream<T> limit(long maxsize) :返回此流中的元素组成的流，截取前指定参数个数的数据
Stream<T> skip(long n)：跳过指定参数个数的数据，返回由该流的剩余元素组成的流
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
        //需求1：去前3个数据在控制台输出
        list.stream().limit(3).forEach(System.out::println);
        System.out.println("***************");
        //需求2：跳过3个元素，把剩余的元素在控制台输出
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("***************");
        //需求3：跳过2个元素，把剩余的元素中的前两个在控制台输出
        list.stream().skip(2).limit(2).forEach(System.out::println);

    }
}
