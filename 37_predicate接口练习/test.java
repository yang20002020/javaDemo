package it_10;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
String[] strArray={"林青霞，30"，“刘岩，34”，"张曼玉,35",“貂蝉,31”，“王祖贤，33”}
满足条件:姓名长度大于2，年龄大于33
 */
public class test {
    public static void main(String[] args) {
        String[] strArray={"林青霞,30","刘岩,34", "张曼玉,35", "貂蝉,31","王祖贤,33"};

        ArrayList<String> strlist= myFilter(strArray,s->s.split(",")[0].length()>2,s->Integer.parseInt(s.split(",")[1])>33);
        for(String str:strlist){
            System.out.println(str);
        }

    }
     //通过predicate接口 将符合要求的字符串筛选到集合arraylist中
    private static ArrayList<String> myFilter(String[] strArray, Predicate<String>pre1, Predicate<String>pre2){
        //定义一个集合
        ArrayList<String> array=new ArrayList<String>();
        for(String str:strArray){
            if(pre1.and(pre2).test(str)){
                array.add(str);
            };
        }
        return array;
    }
}
