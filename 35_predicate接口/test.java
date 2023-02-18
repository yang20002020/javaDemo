package it_09;

import java.util.function.Predicate;

/*
predicate <T>接口通常用于判断参数，是否满足指定的条件
 */
public class test {
    public static void main(String[] args) {
        boolean b1=checkString("hello",(String s)->{
            return s.length()>8;
        });
        System.out.println(b1);
        boolean b2=checkString("hello", s-> s.length()>8);
        System.out.println(b2);
        boolean b3=checkString1("hello", s-> s.length()>8);
        System.out.println(b3);
    }
    //判断给定的字符串是否满足要求
    private static boolean checkString (String s, Predicate<String> pre){
        return pre.test(s);
    }

    private static boolean checkString1 (String s, Predicate<String> pre){
        //return !pre.test(s);
        return pre.negate().test(s);
    }
}
