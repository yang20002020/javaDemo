package it_9_0;


import java.util.Properties;
import java.util.Set;

/*
1.Properties 作为map集合的使用
2.public class properties extends hashtable <Object，Object>
3.Properties 是一个map体系的集合类

 */
public class test {
    public static void main(String[] args) {
        //创建集合对象
        Properties prop = new Properties();
        //  Object put(Object key, Object value) 将指定的 key映射到此散列表中指定的 value 。
        prop.put("it_01", "林青霞");
        prop.put("it_02", "张曼玉");
        prop.put("it_01", "王祖贤");
        Set<Object> keySet=prop.keySet();
        for(Object key:keySet){
            Object value=prop.get(key);
            System.out.println(key+","+value);
        }



    }


}
