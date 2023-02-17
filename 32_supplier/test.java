package it_06;

import java.util.function.Supplier;

public class test {
    public static void main(String[] args) {
        String  s=getString(()->{
            return "林青霞";
        });
        System.out.println(s);
        String s1=getString(()->"林青霞");
        System.out.println(s1);
        Integer it=getInteger(()->{
            return 30;
        });
        System.out.println(it);
        Integer it1=getInteger(()->30);
        System.out.println(it1);
    }
    private static String getString(Supplier<String> sup){
        return sup.get();
    }
    private static Integer getInteger(Supplier<Integer> sup){
        return sup.get();
    }
}
