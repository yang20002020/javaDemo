package ityang;

import java.util.HashSet;

public class test {
    public static void main(String[] args) {
        HashSet<String> hs =new HashSet< >();

        //添加元素
        hs.add("hello");
        hs.add("world");
        hs.add("java");

        for(String ss :hs){
            System.out.println(ss);
        }
    }
}
