package it_13;

import java.sql.SQLOutput;
import java.util.ArrayList;

/*
创建一个集合，储存多个字符串元素
把集合中立国所有以“张”开头的元素存储到一个新的集合
把“张”开头的集合中的长度为3的元素存储到一个新的集合
遍历上一步得到的集合
 */
public class test {
    public static void main(String[] args) {
       ArrayList<String> list=new ArrayList<>();
       list.add("林青霞");
       list.add("张曼玉");
       list.add("王祖贤");
       list.add("柳岩");
       list.add("张敏");
       list.add("张无忌");
       //把集合中所有以张 开头的元素储存到一个新的集合中
       ArrayList<String> zhangList=new ArrayList<String>();
       for(String s:list){
           if(s.startsWith("张")){
               zhangList.add(s);
           }
       }
       System.out.println(zhangList);
       ArrayList<String> threeList=new ArrayList<String>();
       for(String s:zhangList){
           if(s.length()==3){
               threeList.add(s);
           }
       }
        System.out.println(threeList);
       for(String s: threeList){
           System.out.println(s);
       }
       System.out.println("******************");
       //Stream流改进 使用stream流 完成过滤操作
        //sream 流把真正的函数式编程风格引入到java中
        list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3).forEach(s-> System.out.println(s));
        System.out.println("******************");
        list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3).forEach(System.out::println);
    }
}
