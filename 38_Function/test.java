package it_11;

import java.util.function.Function;
/*
Function<T,R>接口通常用于对参数进行处理，转换（处理逻辑有lambda表达式实现），然后返回一个新的值
 */
public class test {
    public static void main(String[] args) {
        convert("100", (String s) -> {
            return Integer.parseInt(s);
        });
        convert("100", s -> Integer.parseInt(s));
        convert("100", Integer::parseInt);
        convert(100, a -> String.valueOf(a + 566));
        convert("100",s->Integer.parseInt(s),a->String.valueOf(a + 566));
        convert1("100",s->Integer.parseInt(s),a->String.valueOf(a + 566));
    }

    //定义一个方法，把一个字符串转换int类型，在控制台输出
    private static void convert(String s, Function<String, Integer> fun) {
        Integer i = fun.apply(s);
        System.out.println(i);
    }

    //定义一个方法，把一个int类型的数据加上一个整数之后，转为字符串，并在控制台上输出
    private static void convert(int i, Function<Integer, String> fun) {
        String s = fun.apply(i);
        System.out.println(s);
    }

    private static void convert(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        Integer i = fun1.apply(s);
        String ss = fun2.apply(i);
        System.out.println(ss);

    }
    private static void convert1(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        String ss= fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }
}
