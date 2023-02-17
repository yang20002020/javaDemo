package it_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        //构造使用场景
        //定义集合，存储字符串元素
        ArrayList<String> array = new ArrayList<String>();
        array.add("cccc");
        array.add("aa");
        array.add("d");
        array.add("bbb");
        System.out.println("排序前：" + array);
        Collections.sort(array);//自然排序
        System.out.println("排序后：" + array);
        Collections.sort(array, getCompatator());//
        System.out.println("排序后：" + array);
        Collections.sort(array, getCompatator1());//
        System.out.println("排序后：" + array);
        Collections.sort(array, getCompatator2());//
        System.out.println("排序后：" + array);
        Collections.sort(array, getCompatator3());//
        System.out.println("排序后：" + array);

    }

    // @FunctionalInterface
    //  public interface Comparator<T> 函数式接口
    private static Comparator<String> getCompatator() {

        //匿名内部类
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };
        return comp;
    }

    private static Comparator<String> getCompatator1() {
        //匿名内部类
        return new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };
    }

    private static Comparator<String> getCompatator2() {
        return (s1, s2) -> {
            return s1.length() - s2.length();
        };
    }

    //如果方法的返回值是一个函数式接口，我们可以使用lambda表达式作为结果返回
    private static Comparator<String> getCompatator3() {
        return (s1, s2) -> s1.length() - s2.length();
    }

}
