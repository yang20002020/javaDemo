package it_13;
import java.util.*;

/*
 inStream:表示原始int流
 InStream mapToInt(ToIntFunction mapper):
 返回一个IntStream 其中包含将给定函数应用于此流的元素的结果
 ToIntFunction接口中的方法  int applyAsInt(T value)
 */

public class test {
    public static <stream> void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        list.add("50");

        //需求，将集合中的字符串数据转换为整数之后在控制台输出
        //Stream<R> map(Function<? super T, ? extends R> mapper);
        list.stream().map(s->Integer.parseInt(s)).forEach(System.out::println);
        System.out.println("******************");
        list.stream().map(Integer::parseInt).forEach(System.out::println);
        System.out.println("******************");
        list.stream().mapToInt(Integer::parseInt).forEach(System.out::println);

        //int sum() 返回此流中元素的总和
        int result=list.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(result);
        System.out.println("******************");


    }
}
