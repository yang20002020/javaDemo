package it_15;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
对数据使用stream流的方式操作完毕后，如果想把流中的数据手记到集合中，应该怎么办？
Stream流的收集方法
R collect(Collector collector),其中Collector 是接口
Class Collectors 工具类
toList() 返回一个Collector,将输入元素累加到一个新的list
toSet()返回一个Collector,将输入元素累加到一个新的set。
 */
public class test {
    public static void main(String[] args) {

        //创建list集合
        ArrayList<String> list = new ArrayList<>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");

        //需求1：得到名字是3个字的流
        Stream<String> listStream = list.stream().filter(s -> s.length() == 3);
        //需求2：把使用stream流操作完毕的数据收集到list集合中并遍历
        List<String> names = listStream.collect(Collectors.toList());
        for (String name : names) {
            System.out.println(name);
        }

        /*************************/
        //创建Set集合对象
        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(33);
        set.add(35);
        //得到年龄大于25的流
        Stream<Integer> setStream = set.stream().filter(age -> age > 25);
        //把使用stream流操作完毕的数据收集到set集合中并遍历
        Set<Integer> ages = setStream.collect(Collectors.toSet());
        for (Integer age : ages) {
            System.out.println(age);
        }
        //定义一个字符串数组，每一个字符串数据由姓名和年龄组成
        String[] strArray = {"林青霞，30", "张曼玉，35", "王祖贤，33", "柳岩，25"};
        //需求：得到字符串中年龄数据大于28的流
        Stream<String> arrayStream = Stream.of(strArray).filter(s -> Integer.parseInt(s.split("，")[1]) > 28);
        System.out.println("arrayStream:"+arrayStream);
        //需求：把使用Stream流操作哦完毕的数据收集到map集合中并遍历，字符串中的姓名做键，年龄做值
        Map<String, Integer> map = arrayStream.collect(Collectors.toMap(s -> s.split("，")[0],
                s -> Integer.parseInt(s.split("，")[1])));

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            Integer value = map.get(key);
            System.out.println(key + "," + value);
        }


    }
}
