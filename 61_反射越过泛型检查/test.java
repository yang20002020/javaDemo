package it_19;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
��ϰ������һ��ArrayList<Interger>���ϣ�����������������������һ���ַ������飬���ʵ�֣�
//�������Խ�����ͼ�飬��ȡ��ԭʼ�ķ�������Ҫ������
 */
public class test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        //��������
         ArrayList<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(20);
        System.out.println(array);
        System.out.println("__________________");
        Class<? extends ArrayList> c =array.getClass();
        //�������Խ�����ͼ�飬��ȡ��ԭʼ�ķ�������Ҫ������
        Method m = c.getMethod("add", Object.class);
        m.invoke(array, "hello");
        m.invoke(array, "world");
        m.invoke(array, "java");
        System.out.println(array);
    }
}
