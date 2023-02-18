package it_07;

import java.util.function.Consumer;

public class test {
    public static void main(String[] args) {
        operatorString("林青霞", (String s) -> {
            System.out.println(s);
        });
        operatorString("张曼玉", s -> System.out.println(s));
        operatorString("王祖贤", System.out::println);
        operatorString("林青霞", s -> {
            System.out.println(new StringBuffer(s).reverse().toString());
        });
        operatorString("林青霞", s -> System.out.println(new StringBuffer(s).reverse().toString()));
        System.out.println("******************************");
        operatorString("林青霞",s->System.out.println(s), s -> System.out.println(new StringBuffer(s).reverse().toString()));
    }

    //定义一个方法 ，消费一个字符串数据
    private static void operatorString(String name, Consumer<String> con1,Consumer<String> con2) {
        con1.accept(name);
        con2.accept(name);
        con1.andThen(con2).accept(name);
    }
    //定义一个方法，消费一个字符串数据
    private  static void operatorString(String name,Consumer<String> con){
       con.accept(name);
    }
}
