package it_16;

import java.util.concurrent.Callable;

/*
ClassLoader是负责加载类的对象
ClassLoader 中的两个方法
  static ClassLoader getSystemClassLoader ():返回用于委派的系统类加载器
  ClassLoader getParent():返回父类加载器进行委派
 */
public class test {
    public static void main(String[] args) {
        // static ClassLoader getSystemClassLoader ():返回用于委派的系统类加载器
        ClassLoader c = ClassLoader.getSystemClassLoader();
        //终端输出jdk.internal.loader.ClassLoaders$AppClassLoader@27c170f0
        System.out.println(c);
        /**************************/
        //ClassLoader getParent():返回父类加载器进行委派
        ClassLoader c2 = c.getParent();
        //终端输出 jdk.internal.loader.ClassLoaders$PlatformClassLoader@2d98a335
        System.out.println(c2);
        /**************************/
        ClassLoader c3 = c2.getParent();
        System.out.println(c3);//终端输出 null

    }
}
