package it_09;

import java.util.function.Predicate;

/*
predicate <T>接口通常用于判断参数，是否满足指定的条件
 */
public class test {
    public static void main(String[] args) {

        boolean b1=checkString("hello", s-> s.length()>8,s->s.length()<15);
        System.out.println(b1);
        boolean b2=checkString1("hello", s-> s.length()>8,s->s.length()<15);
        System.out.println(b2);
        boolean b3=checkString2("hello", s-> s.length()>8,s->s.length()<15);
        System.out.println(b3);

    }
    //判断给定的字符串是否满足要求
    private static boolean checkString (String s, Predicate<String> pre1,Predicate<String> pre2){
        boolean b1=pre1.test(s);
        boolean b2=pre2.test(s);
        boolean b=b1&&b2;
        return b;
    }
    private static boolean checkString1 (String s, Predicate<String> pre1,Predicate<String> pre2){
      return pre1.and(pre2).test(s);
    }
    private static boolean checkString2 (String s, Predicate<String> pre1,Predicate<String> pre2){
        return pre1.or(pre2).test(s);
    }

}
