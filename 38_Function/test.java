package it_11;

import java.util.function.Function;
/*
Function<T,R>�ӿ�ͨ�����ڶԲ������д���ת���������߼���lambda���ʽʵ�֣���Ȼ�󷵻�һ���µ�ֵ
 */
public class test {
    public static void main(String[] args) {
        convert("100", (String s) -> {
            return Integer.parseInt(s);
        });
        convert("100", s -> Integer.parseInt(s));
        convert("100", Integer::parseInt);
        convert(100, a -> String.valueOf(a + 566));
        convert("100",s->Integer.parseInt(s),a->String.valueOf(a + 566));
        convert1("100",s->Integer.parseInt(s),a->String.valueOf(a + 566));
    }

    //����һ����������һ���ַ���ת��int���ͣ��ڿ���̨���
    private static void convert(String s, Function<String, Integer> fun) {
        Integer i = fun.apply(s);
        System.out.println(i);
    }

    //����һ����������һ��int���͵����ݼ���һ������֮��תΪ�ַ��������ڿ���̨�����
    private static void convert(int i, Function<Integer, String> fun) {
        String s = fun.apply(i);
        System.out.println(s);
    }

    private static void convert(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        Integer i = fun1.apply(s);
        String ss = fun2.apply(i);
        System.out.println(ss);

    }
    private static void convert1(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        String ss= fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }
}
