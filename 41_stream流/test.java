package it_13;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Stream;

/*
创建一个集合，储存多个字符串元素
把集合中立国所有以“张”开头的元素存储到一个新的集合
把“张”开头的集合中的长度为3的元素存储到一个新的集合
遍历上一步得到的集合
 */
public class test {
    public static <stream> void main(String[] args) {
        //collection体系的集合可以使用默认方法stream()生成流
        ArrayList<String> list = new ArrayList<>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<String>();
        Stream<String> setStream = set.stream();
        System.out.println("******************");
        //map体系的集合间接生成流，不能直接生成流
        Map<String, Integer> map = new HashMap<String, Integer>();
        Stream<String> keyStream = map.keySet().stream();//获取键集合的流
        Stream<Integer> valueStream = map.values().stream();
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();
        //数组可以通过Stream接口的静态方法of(T ... values)生成流
        String[] strArray = {"hello", "world", "java"};
        Stream<String> strArrayStream = Stream.of(strArray);
        Stream<String> strArrayStream2 = Stream.of("hello", "world", "java");
        Stream<Integer> intStream = Stream.of(10, 20, 30);


    }
}
