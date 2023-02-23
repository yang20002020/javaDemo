package it_9_1;

import java.util.Properties;
import java.util.Set;

/*
Properties 作为集合的特有方法
 */
public class test {
    public static void main(String[] args) {
        Properties pro=new Properties();
        System.out.println(pro);
        pro.setProperty("it_01","林青霞");
        pro.setProperty("it_02","张曼玉");
        pro.setProperty("it_03","王祖贤");
        System.out.println(pro);
        /*
        上述代码的方法如下所示：
          public synchronized Object setProperty(String key, String value) {
             return put(key, value);
          }
          public synchronized Object put(Object key, Object value)

         */
        System.out.println(pro.getProperty("it_01"));
        System.out.println(pro.getProperty("it_001"));
        System.out.println("______________");
       // Set<String> stringPropertyNames() 从该属性列表中返回一个不可修改的键集，其中键及其对应的值是字符串，包括默认属性列表中的不同键，如果尚未从主属性列表中找到相同名称的键。
        Set<String> names=pro.stringPropertyNames();
        for(String key:names){
            System.out.println(key);
            String value=pro.getProperty(key);
            System.out.println(key+"，"+value);
        }



    }
}
